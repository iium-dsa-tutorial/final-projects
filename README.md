## Final Projects
----
#### This is where all of you needs to submit your source code and report.
----

Here is a short video **[link](https://www.youtube.com/watch?v=XdhuWDdu-rk)** that will show you how to upload your code here. Here is a [list of steps](https://education.github.com/guide/forks#3-completing-assignments) to be followed precsiely.

>
  1. At first, **fork** this repository
  2. Then **Clone** the forked repository from your account to your pc
  3. Then add all your project files and put your report in the README.md file
  4. **Push/Sync** all the changes you made to github
  5. Create a **Pull Request** on the original repository to complete submission

And here is a long video **[link](https://www.youtube.com/watch?v=73I5dRucCds)** in case you want to know more.

Before you commit your project, put your team name, name of all members and matric, project name and class section in README.md file. And put your team name in the description of the commit.

**At least one of your team member needs to have a GitHub account to be able to submit, do create an account.**

> Bring the [[DSA Project: Group Assessment.pdf](https://github.com/iium-dsa-tutorial/final-projects/blob/master/DSA%20Project-Group%20Assessment.pdf )] document with you in the presentation.

#### You have to fill up the following section - 
----

**Team Name:Noob_Coders**

**Project Name:Merge Sort Visualisation**

**Section:3**

**Members:**

  1. Md.Asir Faisal Dip (1421837)
  
  2. Zakaria Mohiuddin Khandaker (1435677)
  
  3. MOHAMMAD MOSTAFIZUR RAHMAN (1333513)
  
  4. TYSIR HOSSAIN (1330589)
  
----

### Report

Our project was intended to visualize Merge sorting.For that, we used Javascript, html, jquery and Css. We used Js for the implementation of Merge sorting and also the algorithm is written in Js. Html and css is just for running the js and making it a little bit more beautiful.

Extra Feautres : 
For extra, features we added two extra algorithm Heap sort and Quick sort. This two algorithm and its visualization was also done in the very same way as the Merge sort. You can choose data size for example :50,60 and you can also choose the time interval to see the real time sorting .
Briefing : 

1)	Algorithms : The algorithms we used are simply merge sort ,quick sort and Heap sort.but there are also some other algorithms for visualization in the javascript.I am going to explain the main visualization details a bit later in the following phrase.
Merge Sort Algo:  

Merge sort is a sorting technique based on divide and conquer technique. With worst-case time complexity being Ο(n log n), it is one of the most respected algorithms. Merge sort first divides the array into equal halves and then combines them in a sorted manner.

Quick sort Algo : 
Here is how quicksort uses divide-and-conquer. As with merge sort, think of sorting a subarray array[p..r], where initially the subarray isarray[0..n-1].
1.	Divide by choosing any element in the subarray array[p..r]. Call this element the pivot. Rearrange the elements in array[p..r] so that all other elements in array[p..r] that are less than or equal to the pivot are to its left and all elements in array[p..r] are to the pivot's right. We call this procedure partitioning. At this point, it doesn't matter what order the elements to the left of the pivot are in relative to each other, and the same holds for the elements to the right of the pivot. We just care that each element is somewhere on the correct side of the pivot.
As a matter of practice, we'll always choose the rightmost element in the subarray, array[r], as the pivot. So, for example, if the subarray consists of [9, 7, 5, 11, 12, 2, 14, 3, 10, 6], then we choose 6 as the pivot. After partitioning, the subarray might look like [5, 2, 3, 6, 12, 7, 14, 9, 10, 11]. Let qbe the index of where the pivot ends up.
2.	Conquer by recursively sorting the subarrays array[p..q-1] (all elements to the left of the pivot, which must be less than or equal to the pivot) and array[q+1..r] (all elements to the right of the pivot, which must be greater than the pivot).
3.	Combine by doing nothing. Once the conquer step recursively sorts, we are done. Why? All elements to the left of the pivot, in array[p..q-1], are less than or equal to the pivot and are sorted, and all elements to the right of the pivot, in array[q+1..r], are greater than the pivot and are sorted. The elements in array[p..r] can't help but be sorted!
Think about our example. After recursively sorting the subarrays to the left and right of the pivot, the subarray to the left of the pivot is [2, 3, 5], and the subarray to the right of the pivot is [7, 9, 10, 11, 12, 14]. So the subarray has [2, 3, 5], followed by 6, followed by [7, 9, 10, 11, 12, 14]. The subarray is sorted.
The base cases are subarrays of fewer than two elements, just as in merge sort. In merge sort, you never see a subarray with no elements, but you can in quicksort, if the other elements in the subarray are all less than the pivot or all greater than the pivot.
Let's go back to the conquer step and walk through the recursive sorting of the subarrays. After the first partition, we have have subarrays of [5, 2, 3] and [12, 7, 14, 9, 10, 11], with 6 as the pivot.
To sort the subarray [5, 2, 3], we choose 3 as the pivot. After partitioning, we have [2, 3, 5]. The subarray [2], to the left of the pivot, is a base case when we recurse, as is the subarray [5], to the right of the pivot.
To sort the subarray [12, 7, 14, 9, 10, 11], we choose 11 as the pivot, resulting in [7, 9, 10] to the left of the pivot and [14, 12] to the right. After these subarrays are sorted, we have [7, 9, 10], followed by 11, followed by [12, 14].

Visualization :
We simply used Jquery and Javascript for visualisation in this project.I am just going to note down the functions in very short.
Draw_array : 
*
     * Draw an array on a canvas.
     *
     * Inputs:
     * - canvas: a DOM canvas object
     * - ary: An array of numbers to draw
     * - colors: An array of the same length as ary, whose ith element
     *   is a string giving the color for the ith element of ary
     */
// Draws a box around the outside of the canvas
    ctx.strokeRect(0, 0, canvas.width, canvas.height);

function convert_y(y) {
      // Want convert_y(max) = 0, convert_y(min) = canvas.height

function AnimatedArray(ary, canvas, interval) {
    /*
     * An AnimatedArray wraps a pure Javascript array of numbers,
     * and provides functions to compare and swap elements of the array.
     * These comparisons and swaps will be visualized on a canvas.
     *
     * The AnimatedArray stores two copies of the array and a list of actions;
     * whenever one of the comparison or swap methods are called, the original
     * array is immediately updated and the action is added to the action list;
     * whenever _step() is called (which you should not call manually), one
     * action is consumed from the action list, the second copy of the array
     * is updated if needed, an the array is drawn to the canvas.
     *
     * This design lets clients of AnimatedArray use it in clean imperative
     * code without worrying about callbacks. The downside is that it uses
     * extra memory.
     *
     * Inputs to the constructor:
     * - ary: Pure Javascript array to wrap
     * - canvas: DOM canvas object where we will draw
     * - interval: Time (in milliseconds) between visualizing each step
     */
