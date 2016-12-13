var sorting = (function() {

  var MAIN_COLOUR = '#2196F3';
  var COMPARING_COLOUR = '#E91E63';
  var SWAPPING_COLOUR = '#009688';


  // Generate and return random integer that include highest and lowest
  function randomInt(lowest, highest) {

    return lowest + Math.floor((highest - lowest + 1) * Math.random());
  }

  function draw_array(myCanvas, myArray, colour) {
    
    var width_ratio = 2; // 2 means bar is double width than spacing
    var dimension = myCanvas.getContext('2d');

    // Clear the myCanvas
    dimension.fillStyle = '#673AB7';
    dimension.fillRect(1, 1, myCanvas.width, myCanvas.height);

    // Find min and max elements
    var min = myArray[0];
    var max = myArray[0];
    for (var i = 1; i < myArray.length; i++) {
      min = myArray[i] < min ? myArray[i] : min;
      max = myArray[i] > max ? myArray[i] : max;
    }

    // calculating bar width and spacing
    var arraySize = myArray.length;
    var spacing = myCanvas.width / (width_ratio * arraySize + arraySize + 1);
    var bar_width = spacing * width_ratio;

    // make outline box outside myCanvas
    dimension.strokeRect(0, 0, myCanvas.width, myCanvas.height);

    function convertVertical(y) {
      // Want convert_y(max) = 0, convert_y(min) = myCanvas.height`
      var a = myCanvas.height / (min - max);
      var b = max * myCanvas.height / (max - min);
      return a * y + b;
    }

    // drawing line for zero value
    var verticalZero = convertVertical(0);
    dimension.beginPath();
    dimension.moveTo(0, verticalZero);
    dimension.lineTo(myCanvas.width, verticalZero);
    dimension.stroke();

    // Now draw boxes
    var x = spacing;
    for (var i = 0; i < myArray.length; i++) {
      dimension.fillStyle = colour[i];
      var y = convertVertical(myArray[i]);
      if (myArray[i] >= 0) {
        dimension.fillRect(x, y, bar_width, verticalZero - y);
      } else {
        dimension.fillRect(x, verticalZero, bar_width, y - verticalZero);
      }
      x += spacing + bar_width;
    }
  }

  // generate canvas for array visualization
  function AnimatedArray(myArray, myCanvas, interval) {
    
    this.myNewArray = myArray;
    this.myNewCanvas = myCanvas;
    this.arrayToDisplay = [];
    this.myColour = [];
    this.myAction = [];
    for (var i = 0; i < myArray.length; i++) {
      this.arrayToDisplay.push(myArray[i]);
      this.myColour.push(MAIN_COLOUR);
    }
    draw_array(this.myNewCanvas, this.myNewArray, this.myColour);
    var _this = this;
    this._id = window.setInterval(function() {_this._step();}, interval);
  }
  
  // compare between array component
  AnimatedArray.prototype.compare = function(i, j) {
    
    this.myAction.push(['compare', i, j]);
    return this.myNewArray[i] - this.myNewArray[j];
  }

  // function to compare which one is less
  AnimatedArray.prototype.lessThan = function(i, j) {
   
    return this.compare(i, j) < 0;
  }

  // to swap between element
  AnimatedArray.prototype.swap = function(i, j) {
    
    this.myAction.push(['swap', i, j]);
    var t = this.myNewArray[i];
    this.myNewArray[i] = this.myNewArray[j];
    this.myNewArray[j] = t;
  }

  // this function use to update the display version of the array(also the colour) thus draw
  // on MyCanvas. This function not called manually(consume one step from action buffer)
  AnimatedArray.prototype._step = function() {
   
    if (this.myAction.length === 0) {
      draw_array(this.myNewCanvas, this.arrayToDisplay, this.myColour);
      return;
    }
    var action = this.myAction.shift();
    var i = action[1];
    var j = action[2];
    if (action[0] === 'compare') {
      this.myColour[i] = COMPARING_COLOUR;
      this.myColour[j] = COMPARING_COLOUR;
    } else if (action[0] === 'swap') {
      this.myColour[i] = SWAPPING_COLOUR;
      this.myColour[j] = SWAPPING_COLOUR;
      var t = this.arrayToDisplay[i];
      this.arrayToDisplay[i] = this.arrayToDisplay[j];
      this.arrayToDisplay[j] = t;
    }
    draw_array(this.myNewCanvas, this.arrayToDisplay, this.myColour);
    this.myColour[i] = MAIN_COLOUR;
    this.myColour[j] = MAIN_COLOUR;
  }

  AnimatedArray.prototype.length = function() {
    return this.myNewArray.length;
  }
// this function responsible for each choosing pivot for every loop
function choose_pivot(animatedArray, pivot_type, left, right) {
    if (typeof(left) === 'undefined') left = 0;
    if (typeof(right) === 'undefined') right = animatedArray.length() - 1;
    var pivot = null;
    if (pivot_type === 'random') 
      return randomInt(left, right);
      
  }

// this function for partition after swap
  function partition(animatedArray, pivot_type, left, right) {
    var pivot = choose_pivot(animatedArray, pivot_type, left, right);
    animatedArray.swap(pivot, right);

    // Partition the array around the pivot.
    pivot = left;
    for (var i = left; i < right; i++) {
      if (animatedArray.lessThan(i, right)) {
        if (i != pivot) {
          animatedArray.swap(i, pivot);
        }
        pivot += 1
      }
    }
    animatedArray.swap(right, pivot);

    return pivot;
  }


  function quicksort(animatedArray, pivot_type, left, right) {
    var n = animatedArray.length();
    if (typeof(left) === 'undefined') left = 0;
    if (typeof(right) === 'undefined') right = n - 1;

    if (left >= right) return;

    var pivot = partition(animatedArray, pivot_type, left, right);
    quicksort(animatedArray, pivot_type, left, pivot - 1);
    quicksort(animatedArray, pivot_type, pivot + 1, right);
  }

 
  var algorithms = {
	'quicksort': quicksort
  }

// quicksort a algorithm that used pivot
function is_pivot_algo(algo) {
    var pivot_algos = {
      'quicksort': true,

    };
    return pivot_algos.hasOwnProperty(algo);
  }
 

  function get_sort_fn(algo, pivot_type) {
    
    var sort_fn = algorithms[algo];
    if (is_pivot_algo(algo)) {
      return function(animatedArray) { sort_fn(animatedArray, pivot_type); };
    } else {
      return sort_fn;
    }
  }
  
  return {
    'AnimatedArray': AnimatedArray,
    'get_sort_fn': get_sort_fn,
  }

  

})();
