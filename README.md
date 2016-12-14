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

**Team Name:**
HIAH

**Project Name:**
Minesweeper

**Section:**
3

**Members:**

  1. Illyas Hadi bin Ismail (1410579)
  
  2. Abdul Hakeem bin Anuar (1517199)
  
  3. Muhammad Haiqal bin Rosli (1516243)
----

### Report

----

For this project, we are required to develop a program of a game named Minesweeper. Minesweeper is a single-player puzzle game that utilizes strategy and chance. The objective of the game is to clear a rectangular board containing hidden "mines" or “bombs” without detonating any of them, with help from clues about the number of neighboring mines in each field. Our minesweeper game is a simple program that uses C++ language. The game is a 5x5 rectangular board with five mines, one for each row. The program starts with a clear board with x and y coordinate used to pinpoint the selected box to be picked. The game will continue as the player picked the non-mine box showing the number clues until all 5 mine box are left, resulting in a complete game, or a game over when one of the mine box is selected. After either of the result, the program will close.

### Code With Comments

#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

int cmp(int,int,int[][5]);
void clean(void);
int drawBoard(int [][5],int,int,int);

int main(){						//main function
	int grid[5][5]={0,0,0,0,0,		//create 2d array
			    0,0,0,0,0,
			    0,0,0,0,0,
			    0,0,0,0,0,
			    0,0,0,0,0};
					
	srand(time(NULL));
		
	int rng,x=-1,y=-1,result=0,count=0;
		
int r1[5]={9,0,0,0,0};	//initialize all row with 9 as bomb
	int r2[5]={0,9,0,0,0};
	int r3[5]={0,0,9,0,0};
	int r4[5]={0,0,0,9,0};
	int r5[5]={0,0,0,0,9};
			
	for(int i=0;i<5;i++)			//loop for randomizing bomb
	{						  location
		rng = rand() % 5;
			
		switch(rng)
		{
			case 0: for(int j=0;j<5;j++){		
				grid[i][j]=r1[j];
				//cout<<grid[i][j];
			};//cout<<"\n";
			break;
			case 1: for(int j=0;j<5;j++){
				grid[i][j]=r2[j];
				//cout<<grid[i][j];
			};//cout<<"\n";
			break;
			case 2: for(int j=0;j<5;j++){
				grid[i][j]=r3[j];
				//cout<<grid[i][j];
			};//cout<<"\n";
			break;
			case 3: for(int j=0;j<5;j++){
				grid[i][j]=r4[j];
				//cout<<grid[i][j];
			};//cout<<"\n";
			break;
			case 4: for(int j=0;j<5;j++){
				grid[i][j]=r5[j];
				//cout<<grid[i][j];
			};//cout<<"\n";
			break;
		}
	}
	
	while(result!=-1 || count==20)	//loop where actual game is run
	{
		grid[x][y]=drawBoard(grid,result,x,y);
		
		cout<<"Input coordinates: ";
		cin>>x>>y;
		
		result=cmp(x,y,grid);		//result from cmp function prints
							  the number of neighboring bomb
		if(result==-1)
		{
			cout<<"Bomb";
			return 0;
		}
		
		cout<<endl;
		//cout<<"\n"<<result<<"\n";
		count++;
		
		clean();			//cleans screen after each selection
	}
	return 0;
}

int cmp(int a,int b,int grid[5][5])		//function where input from main
{							  and board is analyzed for
	int c=0;					  calculating neighbor bombs
	
	if(grid[a][b]==9)
		return -1;			//return -1 for bomb selected and finish
	
	if(a==0 && b==0)			//code for algorithm for upper-left box
	{					  of the board
		if(grid[a][b+1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b]==9)
		{
			c++;
		}
		
		if(grid[a+1][b+1]==9)
		{
			c++;
		}
		return c;	
	}
	if(a==0 && b==4)			//code for algorithm for upper-right box
	{
		if(grid[a][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b]==9)
		{
			c++;
		}
		return c;	
	}
	if(a==4 && b==0)			//code for algorithm for lower-left box
	{
		if(grid[a-1][b]==9)
		{
			c++;
		}
		
		if(grid[a-1][b+1]==9)
		{
			c++;
		}
		
		if(grid[a][b+1]==9)
		{
			c++;
		}
		return c;	
	}
	if(a==4 && b==4)			//code for algorithm for lower-right box
	{
		if(grid[a][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b]==9)
		{
			c++;
		}
		return c;	
	}
	if(a==0 && (b==1||b==2||b==3))	//code for algorithm for 3 middle 
	{						  box of the top row
		if(grid[a][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b]==9)
		{
			c++;
		}
		
		if(grid[a+1][b+1]==9)
		{
			c++;
		}
		
		if(grid[a][b+1]==9)
		{
			c++;
		}
		return c;
	}
	if((a==1||a==2||a==3) && b==0)	//code for the 3 middle box of left
	{						  column
		if(grid[a-1][b]==9)
		{
			c++;
		}
		
		if(grid[a-1][b+1]==9)
		{
			c++;
		}
		
		if(grid[a][b+1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b+1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b]==9)
		{
			c++;
		}
		return c;
	}
	if(a==4 && (b==1||b==2||b==3))	//code for the 3 middle box of the
	{						  lowest row
		if(grid[a][b-1]==9)
		{
			c++;
		}
		
		if(grid[a-1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a-1][b]==9)
		{
			c++;
		}
		
		if(grid[a-1][b+1]==9)
		{
			c++;
		}
		
		if(grid[a][b+1]==9)
		{
			c++;
		}
		return c;
	}
	if((a==1||a==2||a==3) && b==4)	//code for the 3 middle box of 
	{						  right column
		if(grid[a-1][b]==9)
		{
			c++;
		}
		
		if(grid[a-1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b]==9)
		{
			c++;
		}
		return c;
	}
	if((a==1||a==2||a==3) && (b==1||b==2||b==3)) //code for the inner box	
	{
		if(grid[a-1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a-1][b]==9)
		{
			c++;
		}
		
		if(grid[a-1][b+1]==9)
		{
			c++;
		}
		
		if(grid[a][b-1]==9)
		{
			c++;
		}
		
		if(grid[a][b+1]==9)
		{
			c++;
		}
		if(grid[a+1][b-1]==9)
		{
			c++;
		}
		
		if(grid[a+1][b]==9)
		{
			c++;
		}
		
		if(grid[a+1][b+1]==9)
		{
			c++;
		}
		
		return c;
	}
}

int drawBoard(int grid[5][5],int result,int x,int y)
{
	//  _0_1_2_3_4_			//function to redraw board after each
	// 0|_|_|_|_|_|			  selection including the number clues
	// 1|_|_|_|_|_|			  acquired from past selection
	// 2|_|_|_|_|_|
	// 3|_|_|_|_|_|
	// 4|_|_|_|_|_|

	//This draws the top line
	cout << " _";
	for (int i = 0; i < 5; i++)
	{
		cout << i << "_";
	}
	cout << endl;

	//This draws the body
	for (int i = 0; i < 5; i++)
	{
		cout << i << "|";
		for (int j = 0; j < 5; j++)
		{
			if (grid[i][j]==9)
			{
				cout << "b|";
			}
			else if (grid[i][j]==1)
			{
				cout << "1|";
			}
			else if (grid[i][j]==2)
			{
				cout << "2|";
			}
			else if (grid[i][j]==3)
			{
				cout << "3|";
			}
			else if (grid[i][j]==4)
			{
				cout << "4|";
			}
			else if (grid[i][j]==5)
			{
				cout << "0|";
			}
			else if (i==x && j==y)
			{
				cout << result << "|";
			}
			else
			{
				cout << "_|";
			}		
		}
		cout << endl;
	}
	
	if(result==0)
		result=5;
	
	return result;
}

void clean()	//clean screen function
{
	cout<<flush;
	system("CLS");
	
	return;
}


----
