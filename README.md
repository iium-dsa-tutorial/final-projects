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
group A

**Project Name:**
scientific calculator
**Section:**
3
**Members:**

 Mohammad Ayub Haidari	        1219063
 Mohammad Ismail Haidari 	1328357
 Iqbal Ubaid Mattoo	        1424777
 Dawood daryabi 	        1210929

  
----

### Report

> Your Project Report Goes Here

---

TEBLE OF CONTENTS
INTRODUCTION………......................................................................................................... 1
BASIC FUNCTION……………………………………………………………………………2
SYSTEM REQUIREMENT……………………………………………………………………3
SOURCE CODE……..…………………………………………………………………………4

INTRODUCTION OF THE PROJECT:
This Scientific Calculator is designed to automate the calculation procedure. Making less paper work and automate the process of calculation. Moreover, it helps the users to solve any mathematical and scientific problem as fast as they can solve it on the paper. Therefore our scientific calculator can help the users to solve their problem easier and faster.
BASIC FUNCTION:
1.	ADDITION: The addition function is used  by clicking the “+” button on the calculator such as (a+b) = c
2.	SUBTRACTION: The subtraction function is used  by clicking the “-” button on the calculator such as (a-b) = c
3.	DIVITION: The  division function is used  by clicking the “/” button on the calculator such as (a/b) = c
4.	MULTIPLICATION: The multiplication function is used  by clicking the “*” button on the calculator such as (a*b) = c.
5.	SQUARE ROOT: The square root function is used  by clicking the “Sqrt” button on the calculator such as Sqrt (25)= 5.
6.	POWER: The power function is used  by clicking the “^” button on the calculator such as (5^2)= 25
7.	LOGARITHM: The log function is used  by clicking the “Log” button on the calculator such as log2 
8.	NATURAL LOGARITHM: The natural log function is used  by clicking the “Log10” button on the calculator such as log10

9.	LN: The ln function is used by clicking the “Ln” button on the calculator. 
10.	PI: The pi function is used by clicking the “pi” button on the calculator. 
11.	SINE: The sin function is used by clicking the “sin” button on the calculator such as 
sin (45) = 0.70……
12.	COSINE: The cos function is used by clicking the “cos” button on the calculator such as cos (45) = 0.70……
13.	TANJANT: The tan function is used by clicking the “tan” button on the calculator such as tan (45) = 0.99…..
14.	BACK: The back function is used  by clicking the “back” button on the calculator 
15.	CLEAR: The clear function is used  by clicking the “clear” button on the calculator ss
Algorithms  
Algorithm: 1- For this project we had make a new design and added this push button to which will serve as an input for talking the number through user and arithmetical such as (+,-,*,/). 
2- We have added static text box for displaying input which is given by user and for showing the result. 
3- Here we have used the logic as taking input from user as string it will take as string from the user through button and it will add this string to string which if already present in the static text box. 
Do code> operandStack.push( currentToken );}}} 
else if ( isNaN( +currentToken) == false) // 
ie it is a number{ p("IV isNumber() currentToken = " +currentToken); output.push(currentToken)}} while( operandStack.length > 0 ) 
output.push( operandStack.pop() ) ; 
return output; } function operatorToPrecedence( op){ if( op == "+" || op == "-" ) return 
1; else if( op== "*" || op == '/') return 
2; else if (op == '^') return 
3; else if (op == '(' || op == ')') return 
4; else throw ("Unknown operator =" +op + ',at operatorToPrecedence()')}
Major classes and functions 
$(window).ready(function()  
function isOperand(elem, bAllowParenthesis) 
function displayError(msg, data)
function getFullNumber(str)
function toArr(data)
function resetErr
function p( str){if (debug) console.log(str )
function infixToPostfix(array)
function  operatorToPrecedence( op)
function evaluateRPN( rpnArray )
$(".calcbttn").click(function()
function  evaluateFuncts(){
function replaceAllPis(){
function calculate (a,b,op)


