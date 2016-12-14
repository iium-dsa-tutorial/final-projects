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

**Team Name: DSA Survivors**

**Project Name: File Search System**

**Section: 3**

**Members:**

  1. Nurfarhanim binti Fazir (1519944)
  
  2. Nursyafawati binti Abdullah (1516918)
  
  3. Rubaite Rukhsana (1424284)
  
  4. Hadil Abdulhkim Qasem (1414620)
  
----

### Report

About

This project is about File Search System, which is basically a program for searching files. In this program, the directory and keywords are inputted and the program will search the machine based on the directory and search keyword. The following is the algorithm for using the program:

1.	Start
2.	Click Select Path button
3.	Browse the directory
4.	Select chosen directory path
5.	Click Open button
6.	Type search keyword in Search Text Field
7.	Click Find Files button
8.	Click Clear Search button to start a new search with the same directory path
9.	End

The results of the search will be shown in the Results Text Area, showing whether it is a file or folder, the file/folder name and its parent directory path. At the bottom of the interface, the number of matches is also shown, with the number of files and folders are separated and also the total of both.
 
Extra Features

For the project, we incorporated the use of CSS with JavaFX to change the look of the interface. External CSS was used in this project, the FileSearchSystem.css file. The command for calling this file in the start method, FileSearchSystem.java is scene.getStylesheets().add(FileSearchSystem.class.getResource("FileSearchSystem.css").toExternalForm()); By using CSS, the following features are redesigned:

•	Buttons 
The font and colour is changed and an effect is created when the button is hovered, creating a very interactive interface.

•	Background Image
A background image is added using CSS to make the interface look interesting and not plain-looking.

•	Labels
The font and size of the labels are customized as to make the interface more visible and eye-pleasing to the users.

•	Scene Title – Welcome Text
The welcome text is specially customized with special fonts, colours and features,

Other than the use of CSS, the project also incorporated the use of java libraries in making the writing of the codes easier. The libraries that are used:

•	Swing JFileChooser library
This library is used to open the machine’s directory and getting its folders and files paths.

•	Java File library
This library is used to search through the files and folders in the directory, and storing them in an array of files for it to be retrieved again for display.

•	Java FilenameFilter library
This library is used together with the REGEX library to incorporate the filter mechanism when searching the files and folders that contains the search keyword inputted by the user.

•	Java Regex library
This library is used to enable the use of wildcards for pattern matching, and is also incorporated together with the FILENAMEFILTER library to filter the files.

Algorithms Explanation - DFS

To build the program the concept of Depth-first search (DFS) in Java language is used. Depth-first search (DFS) is an algorithm for searching tree or graph data structure. In DFS, start will be with an un-visited node and start picking an adjacent node, until there is no choice, then using backtrack until there is another choice to pick a node, if not, then need to select another un-visited node. 

For the case of this project, the DFS will start at the first folder in the directory path and mark it as visited. Since it is a folder, it means that there are children ore files. The DFS will then search into the folder and if there is another folder, mark it as visited and search again into the folder. If there is no more folder and only files, then it already reaches the bottom of the tree. It will return the filenames and folders in using stack. After searching until the bottom, the DFS will backtrack to the folder before and search again until all the folders and files are marked as visited. The program will then display all the found folders and files using stack, with the bottom-most in directory path will be the first one displayed.

DFS can be implemented in two ways, one is iterative and another one is recursive. We used DFS with recursion function in the coding. The listDirectories(dir, find) method is used as the DFS algorithm in this program. As recursion is used, the method is called again if a folder is encountered and it will stop (reduction step) when there is no more folder and only the files are left. 

Class Description

For the project, two distinct classes are used. The classes are:

•	FileSearchSytem
This class contains the Stage and Main method for the program. JavaFX is used in creating the interface within the Stage method. There are also methods which are listDirectories(dir, find) for the DFS, and also the Event Handler methods for the buttons. The Main method is used for the program to launch the interface.

•	Filter
This class contains the functions for filtering and pattern matching. It contains the interface class Filter and implements the class FilenameFilter to do both the pattern matching and filtering mechanism. These two methods are implicitly called within the FileSearchSystem class in the Stage method. 

Details of Pattern Matching Scheme

Java Regex is widely used to define constraint on strings such as password and email validation. Regular expression, also known as a regex or regexp, is a string whose pattern (template) describes a set of strings. The pattern determines that strings belong to the set, and consists of literal characters and metacharacters, characters that have special meaning instead of a literal meaning. The process of searching text to identify matches—strings that match a regex's pattern—is pattern matching. 
Java's java.util.regex package supports pattern matching via its Pattern, Matcher, and PatternSyntaxException classes: 
•	Pattern objects, also known as patterns, are compiled regexes.
•	Matcher objects, or matchers, are engines that interpret patterns to locate matches in character sequences, objects whose classes implement the java.lang.CharSequence interface and serve as text sources.

For this project, the pattern ("(.*)" + find + "(.*)") is used to filter the list of files and folders. Find indicates the search keyword entered by the user. The "(.*)" before and after find indicates that there may or may not be other characters before and after the search keyword. The pattern matching package is implicitly called using the Filter class it compiles and compares the pattern with the file and folder names. The file and folder names are then filtered using the accept(dir, name) method in the Filter class, which is also a method in the FilenameFilter package and returns file/folder names to the File [] dirs1 array in FileSearchSystem class to be displayed.


----
