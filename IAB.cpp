#include <iostream>
#include <iomanip>
#include <windows.h>
#include "Welcome_Screen.h"
#include "Logout_Screen.h"
#include <cstdlib>
#include <string>
#include <fstream>
#include <sstream>
#include <stdio.h>

using namespace std;

struct tables{
		string a ;
	};
	
tables** getValues(); 						// Create Table
void viewTable(tables**);					// View Table
tables** EditTable(tables**);				// Edit Table
void Menu_Screen();
void Logout_Screen();
void End_Line();

int NumTab,NumData;

int main(){
	
	int option;
	tables** my2Darray ; //
	do{
		Menu_Screen();
		cout<<"                             Enter your options: ";
		cin>>option;
		if(option==1){
			my2Darray = getValues();
		}
		else if(option==2){
			viewTable(my2Darray) ;
		}
		else if(option==3){
			my2Darray=EditTable(my2Darray) ;
		}
		else if(option==0){
			Logout_Screen();
		}
		else
			cout<<"Invalid input! Try Again\n";
            End_Line();
        }while(option!=0);
        
        system("pause");
        return 0;
    }

tables** EditTable(tables** my2Darray){	
	
	int i,k;
	
	system("cls");
	cout << setiosflags(ios::left);
	for( int j=0 ; j < NumTab ; j++)
    	{
    		cout << "\n\n\t| ";
    		for( int l=0 ; l<NumData ; l++ ){
    			cout << setw(10) << my2Darray[j][l].a << "| "  ;
			}
			cout << endl;
    	}
    	
    cout << "\n\t\tChoose Row and Colm You want to change" << endl;
    cout << "\n\t\t" ;
    cin >> i >> k ;
    
    
				cout << endl << "\n\t\t" ;
				cin >> my2Darray[i][k].a ;
			
				cout << endl;
		
	system("cls");
	
	for( int j=0 ; j < NumTab ; j++)
    	{
    		cout << "\n\n\t| ";
    		for( int l=0 ; l<NumData ; l++ ){
    			cout << setw(10) << my2Darray[j][l].a << "| "  ;
			}
			cout << endl << "\n\n\t" ;
    	}
    
    system("pause");
    return my2Darray;
    
    
}

void viewTable(tables** my2Darray){	
	
	system("cls");
	cout << setiosflags(ios::left);
	for( int j=0 ; j < NumTab ; j++)
    	{
    		cout << "\n\n\t| ";
    		for( int l=0 ; l<NumData ; l++ ){
    			cout << setw(10) << my2Darray[j][l].a << "| "  ;
			}
			cout << endl;
    	}
}

tables** getValues(){
	system("cls");
	
	cout << "\n\n\t\tPlease input Row: " ;
	cin >> NumTab;
	
	cout << "\n\t\tPlease input col: " ;
	cin >> NumData;
	
	tables** array2D = 0;
	array2D = new tables*[NumTab];
	
		system("cls");
		cout << "\n\n\t\tInput Data" << endl << endl;
		for( int i=0 ; i<NumTab ; i++ ){
			
			array2D[i]=new tables[NumTab];
			
			for( int k=0 ; k < NumData ; k++ ){
				cout << "\t\t" ;
				cin >> array2D[i][k].a ;
			}
			cout << endl;
		}
		
		
		return array2D;
	
	
}

void Menu_Screen()
{
     system("cls");
     cout<<"-------------------------------------------------------------------------------"<<endl;
     cout<<"\t\t\t\t|MAIN MENU|"<<endl;
     cout<<"-------------------------------------------------------------------------------"<<endl<<endl;
     cout<<"You are here: Main Menu                                                        "<<endl;
     cout<<endl<<endl;
     cout<<"\n-----------------------     -----------------------     -----------------------";
     cout<<"\n   1)CREATE TABLE                2)VIEW TABLE                3)EDIT TABLE      ";
     cout<<"\n-----------------------     -----------------------     -----------------------"<<endl;
     cout<<"\nHere you can CREATE         Here you can VIEW           Here you can EDIT the  "<<endl;
     cout<<"\ntable.                      table you have created.     table you have created."<<endl;
     cout<<"\n                                                                                ";
     cout<<"\n-----------------------     -----------------------     -----------------------";
     cout<<endl<<endl<<endl<<endl;
     return;
}

void End_Line()
{
     cout<<"\n\n\t\t   ";
     system("pause");
     system("cls");
     return;
}
