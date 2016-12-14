**Topic name: Maze generator and solver**

**Section: 03**

**Members:**

	1.Qandagha safi (1325731)
	2.Ezatullah safi (1324045)
	3.Abdullah Ghafari (1215023)
	4.Abdul Ro Zac (1318783)

---
Report

I.	Introduction
This project is all about random maze generator and we have done this project using JavaScript, HTML and CSS languages .there we used three different algorithms such as BFS, DFS and Greedy to solve the Maze. And also the users can select their lovely algorithm and can select the Height and Width for the chosen algorithm. For generating Maze we used a basic and fundamental tools of DSA subject such as graph, stack and queue. There we have execution time for the program and also we have expanded nodes (visited nodes) as well as the order of the visited nodes. The interface of this program is friendly everyone can use it without any guide line.


II.	Features
The maze can be generated randomly with the specific Width, Height as well as the Cell Size which is chosen by user. After clicking Generate button, the respective Maze will be display in the right side of screen. User can change the other random maze by clicking the Generate button repeatedly. Next, we provide the solving options to user where they can choose their own algorithm, starting point and ending (exit) point. Algorithms include Breadth First Search (BFS), Depth First Search (DFS) and Greedy best first-search, user can choose starting position and exit position directly from the maze. We provide the extra features which is the Solution area where it shows the execution time to generate the maze, the expanded node (include the node are visited and the node path) and Actions or directions where the step-by-step path will take.
III.	Methodology
a.	Breadth First Search (BFS)
The program work by giving the maze into bfs function, first we specify the starting point and mark it as visited and push it into the queue. Next, if the current node is the exit point, the function will return the solution, if it is not the exit point then we visit all the possible neighbor nodes next to the current node and mark them as visited and push them into the queue, after that we visit every neighbor node and do the same step recursively until the current node state equals to the ending node state.
b.	Depth First Search (DFS)
For DFS we start we starting point mark it as visited and push into the stack and check if it’s ending point then stop searching otherwise visit one of the neighbor, push into stack and mark it visited. If we reach target point then we stop searching if not we go visit neighbors if we don’t have unvisited neighbor then pop up the last cell we visited and go back to previous keep 

c.	Greedy best first-search
This algorithm is trying to find shortest path to reach to destination. It use heuristic function to calculate the distance from current to goal and sort the list based on this priority. In implementation we use priority queue to sort the list and replace parent with successor that has better priority than parent. Otherwise wise push it into list according to its priority. When we find a successor with better priority we replace with parent and expand it and keep this process for its farther successors until we reach target point. A good heuristic function can lead it to a good result, if the optimized path is shorter than the actual part then it works best.
IV.	Main Functions and Classes
1.	Array function(); This function is used to randomize an array
2.	AI function(); This function is used to implement AI algorithm such as State class, Node class, Actionresult class, expand class, solution class, bfs algorithm, dfs algorithm, gbfs algorithm and so on.
3.	Maze function(); This function is used to represent the problem
4.	getSeleVal(id); this function used to get the specific id from html code
5.	generateMaze(); this function used to initial a random maze
6.	solve(); this function is used to select the algorithm to solve the maze
7.	setInitState() setGoalState() are used to set the starting position and ending position.

V.	Maze generator scheme
1.	First of all we set the initial starting point and ending point as (0,0) and (width-1,height-1) respectively.
2.	Set color for the background and wall.
3.	Create a 2d array.
4.	Create cell and set four directions (W, E, N, S) to “true”.
5.	Create grid.
6.	For a given current state, we create next state and action then return the next state depends on the direction.
7.	Create a contain() function to make sure that the given cell is inside the maze.
8.	Create FindNeighbors() function to find the next cell and push into an array, every cell has at least two neighbor.
9.	SuccessorFn() function for solving the maze
10.	Create distancefromGoal() function to calculate the distance of the current cell to the goal position. This function is used for Best search method.
11.	Create removeWall() function to remove the border of 2 adjacent cells
12.	Create buildpath() function to build the maze path using recursive DFS algorithm.
13.	clearMaze() function to clear child nodes from the current maze HTML element.
14.	Lastly, display the maze in html.

VI.	Maze Solver scheme
1.	Create selection if 
2.	If the DFS algorithm is selected then call the dfs() function and operate the function as explained above (Methodology). 
3.	If the BFS algorithm is selected then call the bfs() function and operate the function as explained above (Methodology). 
4.	If the GBFS algorithm is selected then call the gbfs() function and operate the function as explained above (Methodology).

---