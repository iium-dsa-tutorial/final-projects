
**Team Name: Anonymous

**Project Name: Merge Sort Visualization

**Section: 1

**Members:

  1. MOHD. NORAZAM BIN RAJIE (1419375)
  
  2. M.M.AYNUL ISLAM SHAKIB (1335955)
  

--------------------------------------------------------------------------------------------------------------------------------------------------

### Report

> Your Project Report Goes Here

 introduction

In computer science, merge sort is an efficient, general-purpose, comparison-based 
sorting algorithm. Most implementations produce  a stable sort, which means that the implementation preserves the input order of equal elements in the sorted output. Merge sort is divide and conquer sorting technique where we divide the whole array in to parts then apply merge technique on them and then combine them in order to produce the final sorted array. Merge sort consist  of  two basic algorithms called MERGE and MERGE_SORT.   
This source achieve present our own demo program for merge sort algorithm, given the name “Merge Sort Visualization.

Generally about the Merge sort

Merge Sort is a complex and fast sorting algorithm that repeatedly divides an un-sorted section into two equal sub-sections, sorts them separately and merges them correctly.
The basic idea of Merge Sort algorithm can be described as these steps:
1. Divide the data elements into two sections with equal number of elements.
2. Sort the two sections separately.
3. Merge the two sorted sections into a single sorted collection.
Obviously, this is a recursive idea, where a problem is divided into smaller problems. And the division will be repeated to make the smaller problems even smaller, until they are smaller enough so that the solutions are obvious.




implementation

By using html, CSS and html
     * An AnimatedArray wraps a pure Javascript array of numbers,
     * and provides functions to compare and swap elements of the array.
     * The AnimatedArray stores two copies of the array and a list of action.
     * array is immediately updated and the action is added to the action list.
     * This design lets clients of AnimatedArray use it in clean imperative
 We represent a general permutation as a list of length N
     *  where each element is an integer from 0 to N - 1, with the
     *  interpretation that the element at index i will move to index
     *  perm[i]
     *  In general any permutation can be written as a product of
     *  transpositions; we represent the transpostions as an array t of
     *  length-2 arrays, with the interpretation that we first swap
     *  t[0][0] with t[0][1], then swap t[1][0] with t[1][1], etc.
     *  Input: perm, a permutation
     *  Returns: transpositions: a list of transpositions.


