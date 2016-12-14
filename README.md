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

**Team Name: INTELLIGENCE

**Project Name: MAZE SOLVER

**Section: 4

**Members:**

1.Hazimah Binti Sairin 			(1422330)
2.Siti Shyahirah Qayyum Binti Naseer	(1519536)
3.Nur Shuhadah Binti Mohd @ Ab Razak	(1513338)
4.Wan Nur Shahirah Binti Wan Ahmad Sayuti(1517892)
  
----

### Report

> Your Project Report Goes Here

----

Mention in detail about any extra features you added, if any
1.Generate new maze
2.Background
3.Cursor
4.Font
5.Color for maze route
Must include detail explanation of your algorithms
This Maze is generated using Graph Structure and a recursive depth-first search algorithm.The graph cells are connected by a wall separating them in the maze. As we run the DFS algorithm to generate the maze , we start removing connections and store them in an array of removed edges in the graph class.
The mazeGenerator() received n of rows and columns. Then they searchCell() if there is the neighbor “the path” or not , if not , they go to other way. Either up, down , left or right .Then cellNeighbors notify that which way that the neighbor connected or not. In cell.js , they show that if they had go to the path , it will mark as visited. So they do not go to the visited path and continue until the end of the maze.
They start at the top of the graph and end at the bottom.

By-1517892










Must include short description of all major functions/classes.
CURSOR
function sparkle()
-Use to produce sparkles when moving the cursor. This is the function that call another function which is “update_tiny()” and “update_star()”
function update_tiny(i)
-This function is used to control how the sparkle will be appeared when we move our cursor. If we remove this function, the sparkle from the cursor will move for a while only, then it will be freezed in the screen and no more sparkle will come out.
function update_star(i)
-To set how the cursor will be appeared in the screen when the user move the pointer. In term of visibility, size, width, height and position.
function mouse(e)
-This function is used to describe and set for onmouse event which occurs when the pointer is moving while it is over an element.
function set_scroll()
-The pageXOffset and pageYOffset properties returns the pixels the current document has been scrolled from the upper left corner of the window, horizontally and vertically.
-The pageXOffset and pageYOffset properties are equal to the scrollX and scrollY properties.
-These properties are read-only.
function set_width()
-This function is used to set the width when we resize the window. The resize event is fired after the window has been resized.
function createDiv(height, width)
-This function is used to set the size of the sparkle that will falling down from the cursor.





GRAPH
this.getCellAt = function (x, y)
-This function will received parameter x and y
this.getCellDistance = function (cell1, cell2)
-This function will calculate and returns the distance between the cells.
this.areConnected = function(cell1, cell2)
-Returns true if there is an edge between cell1 and cell2
this.cellConnectedNeighbors = function(cell)
-Returns all neighbors of this cell that are separated by an edge (maze line)
this.cellDisconnectedNeighbors = function (cell)
-This function returns all neighbors of this cell that are not separated by an edge
-This means there is a maze path between both cells.
this.cellNeighbors = function (cell)
-This function will returns all neighbors of this cell, regardless if they are connected or not.
this.removeEdgeBetween = function(cell1, cell2)
-This function will remove the edge between the cell as it will receive parameter cell 1 and cell2.









MAZE
width: function() 
-This function is use to get the width for the maze generator. Then it will returns the value of the width. 
height: function()
-This function is use to get the height for the maze generator. Then it will returns the value of the height. 
generate: function () 
-This function will be used to generate the maze path.
draw: function() 
-This function will draw the borders and maze. This function will call  the function “this.drawBorders()” and “this.drawMaze();”
solve: function() 
-This is the function that used to draw the solution.
   drawBorders: function() 
-This function will be used a function that describe the size in term of width and height of the border of the maze’s border
    drawSolution: function() 
-This is the function where to get the path for the solution.
setTimeout(function() )
-The setTimeout() method calls a function or evaluates an expression after a specified number of milliseconds.
drawMaze: function()
-This is the function that will draw the maze randomly. 
drawLine: function(x1, y1, x2, y2) 
-This function will receive four parameter which is x1, y1, x2, and y2 and in order to draw the line of the maze.


MAZE GENERATOR
var MazeGenerator = function(rows, cols) 
-This function will be used to get two parameter which is rows and cols. This will call all the function that will produce the maze generator.
var recurse = function(cell) 
-This function is about the graph and will using the data from the graph file.

solve = function()
-This is the function that will carry out the solution for the maze solver.

 _.each(openSet, function(cell) 
-_.each is synchronous and will only return after the function was execute on all item that is stated in this function

By- 1513338
Must include detail of the maze generator scheme.

The generator consist of cells. When solving the maze, the generator starts by  searching and visiting the cells. If the cell leads to the wrong path, which is a dead end, it will then go to the neighboring cell with the correct path. This step is repeated from the top part of the maze until the end of the maze which is at the bottom.

-By 1519536


Must include detail of the maze storing scheme.
Mazes generated with a depth-first search have a low branching factor and contain many long corridors, because the algorithm explores as far as possible along each branch before backtracking.
To add difficulty and a fun factor to depth-first search generated mazes, you can influence the likelihood of which neighbor you should visit, instead of it being completely random. By making it more likely to visit neighbors to your sides, you can have a more horizontal maze generation. Experimenting with directional passage &quot;bias&quot; in certain places could lead to creating fun designs, such as a checkerboard pattern, an X, and more.
A maze file is basically a text file that contains all the information you need to construct your maze. It consists of:
 	Number of rooms/vertices: An integer that tells you how many vertices are in the graph.Name x y: The next n lines each contain the name of a room (String) and its x and y coordinates (integers).
 Room1 Room2: After the list of vertices comes the edges/corridors. Each edge is listedas two integers, room1 and room2, the indices of its start and end vertices. Store each valid edge by adding an EdgeListNode with the target room2 to the tail of room1’s list of edges.The maze file will end with a line “-1 -1”.
Hazimah