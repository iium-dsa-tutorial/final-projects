#include <iostream>
#include <sys/types.h> 
#include <dirent.h> 
#include <regex>
#include <string>

using namespace std;

int main(void) 
{ 
    restart:
    
    string curdir = "";
    cout << "Please enter directory name. (enter . for current directory):\n";
    cin >> curdir;

    DIR *dir = opendir(curdir.c_str()); 
    if(dir) 
    { 
        int choice = 0;
        cout << "Please choose enter mode:\n\n";
        cout << "[1] Normal mode\n";
        cout << "[2] Regex mode\n";
        cin >> choice;
        struct dirent *ent; 
        if (choice == 1) {
            string find_what = "";
            cout << "Enter query: ";
            cin >> find_what;
            int foundx = 0;
            while((ent = readdir(dir)) != NULL) 
            { 
                std::string str(ent->d_name);
                // skip . and ..
                if (str == "." || str == "..") {

                } else {
                  std::size_t found = str.find(find_what);
                    if (found != std::string::npos) {
                        foundx++;
                        cout << "Searching in " << str << ".. found!\n";
                    } else {
                        cout << "Searching in " << str << "..\n";
                    }
                }
            } 

            cout << "Found " << foundx << " results.\n";
        } else if (choice == 2) {
            string patt = "";
            cout << "Enter regex: ";
            cin >> patt;
            int foundx = 0;
            while((ent = readdir(dir)) != NULL) 
            {   
                std::string str(ent->d_name);
                // skip . and ..
                if (str == "." || str == "..") {

                } else {
                    if (std::regex_match (str, std::regex(patt) )) {
                        foundx++;
                        cout << "Searching in " << str << ".. found!\n";
                    } else {
                        cout << "Searching in " << str << "..\n";
                    }
                }
            } 

            cout << "Found " << foundx << " results.\n";
        } else {
            goto restart;
        }

    }

    else 
    { 
        cout << "Directory not found.\n" << endl; 
    } 

    char ans;
    cout << "Restart? (y/n) ";
    cin >> ans;

    if (ans == 'y') {
        goto restart;
    }

    return 0; 
}