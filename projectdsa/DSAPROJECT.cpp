#include <stdio.h>
#include <string.h>
#include <conio.h>
#include <stdlib.h>
#include <windows.h>
#include<fstream>
#include<iostream>
using namespace std;


void ClearConsoleToColors(int ForgC, int BackC)
{
     WORD wColor = ((BackC & 0x0F) << 4) + (ForgC & 0x0F);
     ///Get the handle to the current output buffer...
     HANDLE hStdOut = GetStdHandle(STD_OUTPUT_HANDLE);
     ///This is used to reset the cursor to the top left.
     COORD coord = {0, 0};
     ///A return value... indicating how many chars were written
     ///   not used but we need to capture this since it will be
     ///   written anyway 
     DWORD count;
     ///This is a structure containing all of the console info
     /// it is used here to find the size of the console.
     CONSOLE_SCREEN_BUFFER_INFO csbi;
     ///Here we will set the current color
     SetConsoleTextAttribute(hStdOut, wColor);
     if(GetConsoleScreenBufferInfo(hStdOut, &csbi))
     {
          ///This fills the buffer with a given character (in this case 32=space).
          FillConsoleOutputCharacter(hStdOut, (TCHAR) 32, csbi.dwSize.X * csbi.dwSize.Y, coord, &count);
          FillConsoleOutputAttribute(hStdOut, csbi.wAttributes, csbi.dwSize.X * csbi.dwSize.Y, coord, &count );
          ///This will set our cursor position for the next print statement.
          SetConsoleCursorPosition(hStdOut, coord);
     }
     return;
}




void SetColorAndBackground(int ForgC, int BackC)
{
     WORD wColor = ((BackC & 0x0F) << 4) + (ForgC & 0x0F);;
     SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), wColor);
     return;
}

COORD coord = {0,0}; ///set the cordinate to 0, 0 (top-left corner of window);
void gotoxy(int x, int y){     // can change cursor position
    coord.X = x; coord.Y = y; /// X and Y coordinates
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}


void clearWindow(){
    int i,j;
    for(i = 37; i < 78; i++){
        for(j = 7; j < 25; j++){
            gotoxy(i,j);printf(" ");
        }
    }
    return;
}

void window(){
    
    gotoxy(28,2);
    printf("FILE SYSTEM SEARCH");
    gotoxy(20,3);
    
}

void print_heading(const char st[]){
    SetColorAndBackground(31,28);
    gotoxy(45,8);printf("PHYTON : %s",st);
    SetColorAndBackground(17,15);
}


void search_student(){
   
   
    clearWindow();
    print_heading("Searching File...");
   
  
  
   
   
   	string search;
 	int offset;
 	string line;
 	
 	ifstream Myfile;
 	Myfile.open("record.txt") ;
 	gotoxy(37,10);cout<<"Type the file you want to search :";fflush(stdin);
 	cin>>search;
 	
 	
 	if (Myfile.is_open())
 	
 	{
	 
	 while  (!Myfile.eof())
	 {
	    getline(Myfile,line);    
	    if ((offset=line.find(search,0)) !=string::npos){  
		
		gotoxy(37,12);cout<<"The files has been founded!! :"<<search;    
	 
}
	    }
        
           




	 Myfile.close();

	 return ;
	 
}
 
}
   
   
void main_window(){
    int choice;
    
    int x = 2;
    while(1){
       
        gotoxy(x,10);printf("1. Search File");
        gotoxy(x,11);printf("2. Exit");
        gotoxy(x,12);printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
               search_student();
                break;
             case 2:
                exit(0);
                break;
            default:
                break;
        }

    }

}

int main(){
    ClearConsoleToColors(17,15);
    SetConsoleTitle("DSA PROJECT FILE SYSTEM SEARCH");
    window();
    //use_pass_field();
    main_window();
    return 0;
}







