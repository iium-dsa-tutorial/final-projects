## Final Projects
----
#### This is where all of you needs to submit your source code and report.
----

Here is a short video **[link](https://www.youtube.com/watch?v=XdhuWDdu-rk)** that will show you how to upload your code here. Here is a [list of steps](https://education.github.com/guide/forks#3-completing-assignments) to be followed precsiely.

And here is a long video **[link](https://www.youtube.com/watch?v=73I5dRucCds)** in case you want to know more.

Before you commit your project, put your team name, name of all members and matric, project name and class section in README.md file. And put your team name in the description of the commit.

**At least one of your team member needs to have a GitHub account to be able to submit, do create an account.**

> Bring the [[DSA Project: Group Assessment.pdf](https://github.com/iium-dsa-tutorial/final-projects/blob/master/DSA%20Project-Group%20Assessment.pdf )] document with you in the presentation.

#### You have to fill up the following section - 
----

**Team Name:Apple Pen**

**Project Name:Minesweeper Game**

**Section:**

**Members:3**

  1. Amal Nadhira Bt Mohd Radzi (1514660)
  
  2. Nurhasyifha binti Mahazan  (1517840)
  
  3. Muhammad Haziq Akmal Bin Ismail Shah (1516233)
  
  4. Muhammad Fakrudin Bin Zaidi (1516405)
  
----

### Report

> Your Project Report Goes Here

----
Features of Games



•	How to play?
In this button, we provide an instruction to the user on how to play Minesweeper games.

•	Back Button
This button will make user easy to undo or going back to homepage. The purpose of doing it because we want to provide user-friendly interface.

•	Game
In this interface, we provide the Minesweeper game with 3 level, which are beginner, intermediate and expert.

•	Suggestion
In this button, the user can provide their opinion regarding to our game to make an improvement to it.



Algorithm
Overall algorithm
1.	Start
2.	Initialize a queue 
3.	If current square is non-mine uncover it and add to queue, otherwise game over
4.	Remove a square from queue 
5.	Count mines adjacent to it 
6.	If adjacent mine count is zero, add any adjacent covered squares to queue and uncover them
7.	Go to step 3 if queue is not empty, otherwise finish
8.	Stop

 Welcome
1.	Start 
2.	In start method:
( i ).    Initialize pane(padding size,text size,text colour,text font)
( ii ).   Initialize box(padding size,spacing,box alignment)
( iii ).  Initialize new button(HOW TO PLAY?,GAME,SUGGESTION)
3.	If click how to play? button,instruction how to play the game will be given.
4.	If click game button, the game will start.
5.	If click suggestion button, the user can provide their opinion to improve our system.
6.	Initialize new event handler(AboutUs,Feedback,Game)
7.	Stop   
Game
1.	Start
2.	Initialize new pane.
3.	Initialize new button(Beginner,Medium,Expert,Home)
( i ). If click beginner button, game will start in beginner level.
( ii ). If click medium button, game will start in medium level.
( iii ). If click exert button, game will start in expert level.
( iv ). If click home, the game will return to home page.
4.	Stop 

Easy
1.	Start
2.	Initialize box and grid (TILE_SIZE = 400/60)
3.	Start stopwatch/timer ( StopWatch st = new StopWatch();)
4.	if (!tile.hasBomb)= win
if (tile.hasBomb) = lose
•	If cell has getNeighbors > 0, show getNeighbors on the cell. If all cells which hasBomb=false are opened, end game with SUCCESS.
•	If has bomb=true, show message game over.
5.	Get the time taken to complete (txt.setText(String.valueOf(st.getTime())
6.	Stop




Medium
7.	Start
8.	Initialize box and grid (TILE_SIZE = 400/40)
9.	Start stopwatch/timer ( StopWatch st = new StopWatch();)
10.	if (!tile.hasBomb)= win
if (tile.hasBomb) = lose
•	If cell has getNeighbors > 0, show getNeighbors on the cell. If all cells which hasBomb=false are opened, end game with SUCCESS.
•	If has bomb=true, show message game over.
11.	Get the time taken to complete (txt.setText(String.valueOf(st.getTime())
12.	Stop

Hard
1.	Start
2.	Initialize box and grid (TILE_SIZE = 600/40)
3.	Start stopwatch/timer ( StopWatch st = new StopWatch();)
4.	if (!tile.hasBomb)= win
          if (tile.hasBomb) = lose
•	If cell has getNeighbors > 0, show getNeighbors on the cell. If all cells which hasBomb=false are opened, end game with SUCCESS.
•	If has bomb=true, show message game over.
5. 	Get the time taken to complete (txt.setText(String.valueOf(st.getTime()) 
6.	Stop


Feedback

1.	Start
2.	Initialize feedback text field
3.	Submit suggestion ( Button btsubmit = new Button("Submit Suggestion") );
4.	Show message Thank You and team description
5.	Stop


Major function

For this program, we decided to use object-oriented programming as this program quite a big project and thus, it is better if we can separate it function to its components rather than make it all on one file which will become hassle when we need to debug the program.
For this program, we use a few classes which each one of them have their specific function. Following is the list of the classes:
•	About Us – for display information on how to play this game
•	Welcome – for display the home page of the apps
•	Game – for displaying the level of game
•	Easy – to display game at easy level 
•	Medium – to display game at medium level
•	Hard – to display game at Hard level
•	Feedback – for player to give their suggestion about our system

