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

**Project Name:**

**Section:**

**Members:**

  1. Muhammad Mustaqeem Bin Mohd Sopee (1419355)
  2. Muhammad Amin ashreen Bin Roslan (1415627)
  3. Ismail Faizi (1210283)
  4. Ahmadshah Sherzad (1211469)
  
----

### Report



Team Name: The NoobiesProject Name: dictionary Section: 3Members:  1) Muhammad Mustaqeem bin Mohd Sopee (1419355)  2) Muhammad Amin Ashreen Bin Roslan (1415627)  3) Ahmadshah Sherzad  (1211469)  4) Ismail Faizi (1210283)Extra features-	Extra features are not added. There is not much thing can do with trie tree.
Explaination of the algorithm-	Trie tree is called digital tree and sometimes radix tree or prefix tree. It is a kind of search tree—an ordered tree data structure that is used to store a dynamic set or associative array where the keys are usually strings. Unlike a binary search tree, no node in the tree stores the key associated with that node; instead, its position in the tree defines the key with which it is associated. All the descendants of a node have a common prefix of the string associated with that node, and the root is associated with the empty string. Values are not necessarily associated with every node. Rather, values tend only to be associated with leaves, and with some inner nodes that correspond to keys of interest. For the space-optimized presentation of prefix tree, see compact prefix tree.
Lexicographic sorting of a set of keys can be accomplished with a simple trie-based algorithm as follows:¥	Insert all keys in a trie.¥	Output all keys in the trie by means of pre-order traversal, which results in output that is in ¥	lexicographically increasing order. Pre-order traversal is a kind of depth-first traversal.
This algorithm is a form of radix sort.	Description of all major functions/classMain function -	There is we create main function to perform all operations.-	This is where we insert the word and the wordmeaning to method insert in Trie class.-	Trie class is called in Main function.                 Array Component Class-	Initialized array named wordmeaning.-	Search is called to check the word either in dictionary or not.-	Deletion of string is implement here. Trie class-	Initialized root with compliment TrieNode.-	Public Void insert is to insert word into trie.		- Message will return if the word has been added.-	public Boolean search is to search word in trie and return true if there is word searching.-	public Boolean startswith is to return word if it start with prefix.-	public trieNode searchnode is to return in index form if the word Is exist.-	public void remove is to remove word from dictionary.TrieNode class-	Initialize the size of an array.-	Construct tree.Detail about data storage scheme .-  we stored selected word and its meaning to database.-  then we ask user to search one word that have been stored in database-  the the dictionary will prompt the word that user search include with its meaning-  then we ask user to delete any word that have been stored.-  the dictionary will display all the words left.