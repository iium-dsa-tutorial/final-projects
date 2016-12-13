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

**Team Name:** NoName

**Project Name:** Mini SQL Database

**Section:** 4

**Members:**

  1. Bekka Amine Fatah 1429659

  2. Abdulraouf Naseh 1216509

  3. Rouhullah Zakiri 1213539 

  4. Munawar Shah 1222315

----

# Mini SQL Database:

## Introduction:

To implement anything related to a database we need first to get an input as an SQL statement then we should be able to validate that input and give it a logical meaning so that it can processed 

## Implementation:

In our small program we have crafted the following procedures:

```
Input --> Tokeniz ---> Parse ---> Excute a logic (or sometimes not "Syntax Error") according to the result of the previos steps
```



from the above explanation as expected we have a `public class Tokenizer` and a `public class Parser`

each of those have many methods to allow them to work properly.

But what about the input ? well we have two options:

1. From a text file (recommended) where the program load a file then execute all the statements that are inside that file then give the chance to the user to enter any statement he wants.
2. The second one is simply letting the user enter the queries by hand.

Before talking about the the execution of the queries we have to talk about the data structures behind the tables, well this is a DSA Class after all :)

we have implemented a `public class Schema` which works as Schema for our database in it we defined 

a `HashMap<String, Table > TableSheme = new HashMap<>();` this is to allow fast retrieval of the tables where the keys are the names and the values are actual tables.

then comes the  `public class Table` where we defined `private LinkedHashMap<String, LinkedList> Attributes;` 

we chose this structure as it will keep the natural order of insertion we judged that this might be important

this LinkedHashMap will contain a single column name as a keys to a Linked list of values



we should also mention that our parser will create an Abstract LinkedList Syntax `LinkedList<SqlStatementNode> ParsedNodes = new LinkedList<>();` where instead of a normal parse tree we only populate our LinkedList with nodes that are needed to the excution of the SQL commands

this will not affect anything as our parser will check for syntax errors and will only create nodes that are needed for a logical excution of the statment 

we also check the statments during the excution for example: doese the table exist or not or the column exist or not etc...

## Grammar and Parser:

### Missing features:

So far non :D

### Syntax Rules:

Comments are **not supported.**

Double quotes syntax is **not supported**.

Semi column is **not necessary** but the user will receive a **warning**. 

This syntax in table names is **not supported**: `Customers.CustomerName | c.CustomerName`  as it will make the parser tree bigger in size we decided to skip it.

Subqueries are **not supported.** (As requested)

`DISTINCT ` is not allowed with the `DELETE` command.

Input **can** be separated by a space or escape characters. Our tokenizer trims those.

String literals **accept** escape characters.

Concatenation is **not supported**.

Exponent of the following Pattern in real numbers is **not supported**: `([eE][-+]?[0-9]+)` example:

 `e-10 | E6`.

The following operators are **not supported**:

```
Similar_To : ~
Not_Similar_To : !~
Similar_To_Case_Insensitive : ~*
Not_Similar_To_Case_Insensitive : !~*
```

Only Underscore:`_` and digits:`[0-9]` are allowed in identifiers but not at the beginning of it.

The command `ORDER BY` accept one value only as this syntax is not accepted:

```
SELECT * FROM Weather ORDER BY City, Date
```



###  Added features:

Null order specification: `NULL FIRST NULL LAST`

Order specification: `DESC, ASC`  

----
## Statements Execution:

so far our program can execute the following commands:

**CREAT TABLE**

**DROP TABLE**

**INSERT INTO**

**UPDATE** 

**SELECT *** 




###  Added features: