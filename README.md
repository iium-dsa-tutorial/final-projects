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

**Team Name:** The Programmer 

**Project Name:** Magic Wand

**Section:** 3

**Members:**

  1. Muhammad Izzudin Bin Mohd Anuar (1510063)
  
  2. Muhammad Taufiq Syahmi Bin Abdul Rahman (1519421)
  
  3. Muhammad Iqbal Hakim Bin Ramle (1516133)
  
  4. Muhammad Alif Bin Mohd Fadil (1519641)
  
----

### Report

> Your Project Report Goes Here

----

Introduction 
	The Magic Wand tool allows you to select an area of an image based on its colour. The tool is located near the top of the Photoshop Toolbox. When you click an area in an image with the magic wand, all areas which are a similar colour are selected. You can specify various options to determine the exact selection. Moreover, Magic wand is one of features that have in Photoshop software. Not only Photoshop but it is use by almost the photo editor that have in this world. This feature is common for an image editor to use it. 
Furthermore, Magic wand is very useful to crop the picture that we wanted. For example, the editor just need the exact picture only, not the background, so that the crop box will move towards the boundary of a picture that the editor want. After the crop is done, the editor can move the picture that has been crop to the place that he want. Such as, he or she wanted to make a collage, and put all the picture at the same place, so it is suitable to crop the picture first using magic wand tool to make it nice and arranged. Refer to figure 1 to see how it works.
 
Figure 1
	To use the Magic Wand tool first select it from the Tool Bar. Then move your cursor into the area containing the colour range that you would like to select; the shadow in our aforementioned example. Set the threshold to a value which you consider reasonable and click the mouse. Note that your threshold level selection will be a skill gained through experience and that you can always make multiple attempts at selecting an area and eventually tune the threshold correctly.

Implementation
	
Magic wand is a program that use graph BFS or DFS. BFS is stand for Breadth-First Search which is it is to find the shortest paths in an unweighted graph. While DFS that stands for Depth-First Search is to find strongly connected components. It has the same function, but the way how it works is different. Besides that, BFS use queue and DFS works with stack. Thus, to make it the magic wand works any of this 2 ways will be used for searching the same number of pixel of a picture. 
	Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures. It starts at the tree root (or some arbitrary node of a graph, sometimes referred to as a 'search key' and explores the neighbour nodes first, before moving to the next level neighbours. While Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures. One starts at the root (selecting some arbitrary node as the root in the case of a graph) and explores as far as possible along each branch before backtracking.
Firstly, as we know, all pictures consist of number with red green and blue. All the colour when it combined it will form a new colour. For example, like R=140 G=53 and B=228, it will form a purple colour. Same goes to the picture itself. So, to make it magic wand happen we make codes to get a number of pixels from the pictures. The number of pixels will represent the picture in the java language. Then, we converted number of pixels into array and pass the array into the BFS or DFS method. For our program, we use DFS because it looks easier to understand compared to the BFS. After the DFS is implemented in our codes, the start to visit the number of pixel ad continue to the neighbour of the pixel number. Last but not least, the bunch of number will print to the to represent the cluster of the pixel numbers. 
Next, our group make a GUI for the program using javafx and link to the inner codes. Button are provided to upload a picture from the desktop and to cancel it back. Then, button to save also provided after the crop has been done.



