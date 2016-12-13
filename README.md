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

**Team Name: Vertex**

**Project Name : QuickSort Visualization**

**Section: 1 **

**Members:**

  1. KHAIRUDDIN BIN CHE OTHMAN 1510735
  
  2. SITI SHAHRINA BINTI JAFFAR 1417240
  
  3. AHMAD ZUL AFKAR BIN SAIFUL BAHRI 1519675
  
  4. MOHAMMAD SYUKRI FAIZ BIN MD NASIR 1516471
  
----

### Report

> ABSTRACT
---- 

This report is intended to be as a result of reference of the project group has prepared. This report contains of abstract, introduction, explanation of algorithms on quicksort visualization, description of functions or classes, description on approach the quicksort visualization, appendix and conclusion. This project was conducted to study the way or the step of quicksort algorithm visualization in sorting data. In implementing this project, several methods have been used such as GUI to visualize the view of quicksort algorithm and apply java to implement  the quicksort visualization. This project covers the step of quicksort algorithm in sorting data using the quicksort method and how the quicksort algorithm solve the problem in sorting the data in computer science. In fact, quicksort algorithm is one of the most used in sorting algorithm because it can sort large list or data and it is the fastest sorting algorithm that we have and quicksort is best for general purpose. In daily life, we use this applications to organize our data so that we could look them up in this quicksort visualization in order, without jumping from section to section. Therefore, the use of advanced technology can improve the work become more efficient.

 
> INTRODUCTION
----

By the age of globalization, technology are becoming more advanced in the world. It allows businesses or any activity to run smoothly and efficiently. The aim of this project is to implement the quicksort visualization that use by the user in the computer system. Quicksort is a fast sorting algorithm, which is used not only for educational purposes, but widely applied in practice. On the average, it has O(n log n) complexity, making quicksort suitable for sorting big data volumes. 

This study presents several steps to implement the quicksort visualization. Firstly, user need to choose a ‘pivot’. Pivot is a value that picked from the middle of list number. However, it can be any number which is in range of sorted values. Second is partition. Partition is the process of rearrange the elements in the list number to the correct position which is be judged by the pivot number. Elements which are lesser than the pivot go to the left part of the array and all elements greater than the pivot, go to the right part of the array. Values equal to the pivot can stay in any part of the array. Third is sort the both parts. This phase apply quicksort algorithm recursively to the left and the right parts.
	
Quicksort is also one of the best example of recursion. It is naturally recursive because it sort the large list by dividing into smaller sub list and then applying same algorithm on those. In conclusion, the choice of pivot will effects the distribution of the elements in partitioning and affects the complexity of the quicksort algorithm. Quicksort is an in place algorithm, which means it does not take any additional space, except those used by method stack.

						
> EXPLANATION OF ALGORITHMS ON QUICKSORT VISUALIZATION
----

Algorithm is a self-contained unit in which it will operate in sequence and step by step by writing in programming language. Algorithms perform calculation, data processing, and automated reasoning tasks.

Sorting algorithm is the process of arranging elements in the list in the correct order either ascending or descending order. The most-used orders are numerical order and lexicographical order also known as lexical order, dictionary order, alphabetical order or lexicographic product. Efficient sorting is important for optimizing the use of other algorithms such as search and merge algorithms which require input data to be in sorted lists.

Quicksort is a method of compiling a list of elements that have been prepared based on a comparison with a marker known as pivot. The elements in the list will be broken down into two parts where the values are smaller than the pivot will move to the left while values greater than pivot to be moved to the right. This can be done efficiently in linear time and in-place. The lesser and greater sub lists are then recursively sorted.

This yields average time complexity of O (n log n) with low overhead. Thus this is a popular algorithm. Efficient implementations of quicksort with in place partitioning are typically unstable sorts and somewhat complex but are among the fastest sorting algorithms in practice. Together with its modest O (log n) space usage, quicksort is one of the most popular sorting algorithms and is available in many standard programming libraries.

Quicksort is aptly named because, when properly implemented, it is the fastest known general purpose in memory sorting algorithm in the average case. It does not require the extra array needed by merge sort, so it is space efficient as well. Quicksort is widely used, and is typically the algorithm implemented in a library sort routine such as the UNIX quicksort function.


> DESCRIPTION OF FUNCTIONS OR CLASSES
----

In this project, we complement the quicksort algorithm visualization using computer language that is javaScript. The functions of quicksort visualization are writing in javaScript programming to run the programming code successfully. 

The first function of quicksort visualization is to generate and return random integer that include highest and lowest element by using function 'randomInt (lowest, highest)' and the statement is: `return lowest + Math.floor ((highest - lowest + 1) * Math.random ())`.  Next is function `draw_array (myCanvas, myArray, colour)`. `myCanvas` is an object declared for DOM myCanvas object where we will draw. While myArray is object declared for pure Javascript array to wrap. 

Besides that, function `convertVertical(y)`. This function want to convert_y(max) = 0, convert_y(min) = myCanvas.height. Next, function `AnimatedArray(myArray, myCanvas, interval)`. An AnimatedArray wraps a pure Javascript array of numbers  and provides functions to compare and swap elements of the array. These comparisons and swaps will be visualized on a myCanvas. The AnimatedArray stores two copies of the array and a list of actions: whenever one of the comparison or swap methods are called, the original array is immediately updated and the action is added to the action list: whenever `_step()` is called (which you should not call manually), one action is consumed from the action list, the second copy of the array is updated if needed and the array is drawn to the myCanvas. Interval is inputs to the constructor which use for record time (in milliseconds) between visualizing each step.

The other functions is function `choose_pivot(animatedArray, pivot_type, left, right)` and  function `partition(animatedArray, pivot_type, left, right)`. Function `choose_pivot` use for choose the pivot element among the list element or number. Elements which are lesser than the pivot go to the left part of the array and all elements greater than the pivot, go to the right part of the array. Values equal to the pivot can stay in any part of the array. Function partition is the process of rearrange the elements in the list number to the correct position which is be judged by the pivot number. 


> DESCRIPTION ON APPROCH THE QUICKSORT VISUALIZATION
----

Data visualization is a modern equivalent of visual communication. It involves the creation and study of the visual representation of data, meaning information that has been abstracted in some schematic form, including attributes or variables for the units of information. For examples are graph, pie and etc.

A primary goal of data visualization is to communicate information clearly and efficiently via statistical graphics, plots and information graphics. Numerical data may be encoded using dots, lines, or bars, to visually communicate a quantitative message. Effective visualization helps users analyze and reason about data and evidence. It makes complex data more accessible, understandable and usable. 

Data visualization is both an art and a science. In this report, we are studies about data visualization in computer science that is sorting algorithm visualization. In this project quicksort  visualization simply shows how the basic divide and conquer approach works with quicksort. The subsequent visualizations are all focused on the partitioning step of quicksort. The partitioning step is really the main factor in the success of any divide and conquer technique. 

Elements which are lesser than the pivot go to the left part of the array and all elements greater than the pivot, go to the right part of the array. Values equal to the pivot can stay in any part of the array. Next is sort the both parts. This phase apply quicksort algorithm recursively to the left and the right parts. In this project we let it automatically proceed from step to step when the user click the 'sort!' button.

In conclusion, quicksort visualization aimed to communicate data or information by encoding it as visual objects such points, lines or bars contained in graphics. The goal is to communicate information clearly and efficiently to users.


> CONCLUSION
----

The purpose of  quicksort visualization is to ease user to read their data correctly and easily do notes and comparison on their study. The application will ease the user where all their data already compared by quicksort algorithm in ascending or decending order.  Information of data can always be update with this convenience where it does not need empty space to add new data or delete data.  Besides, sorting data using computer system will be more accurate than manually. This implementation provides better performance for lot of data sets. Quicksort is best for general purpose. Quicksort also one of the best example of recursion.
