# Recursion and Backtracking Assignment

## Introduction
Recursion is a technique where a function calls itself. Backtracking explores possible solutions and reverses choices when they fail.

## Problem 1: Directory Size
- **Base Case:** If the item is a file, return its size.
- **Recursive Case:** Calculate and add the sizes of all child items.
- **Total Size:** 380 KB
- **Time Complexity:** O(N), where N is the number of files and directories.
- **Iterative Approach:** Use a stack or queue.
- **Cycle Handling:** Maintain a set of visited directory identities to prevent infinite recursion.

**File:** `Problem1_DirectorySize.java`

## Problem 2: Word Search
Find `DREAM` in a grid using horizontal, vertical, and diagonal movements without reusing cells.

- **Technique:** Recursion and backtracking
- **Expected Output:** `Word found: true`
- **Time Complexity:** O(R × C × 8 × 7^(L-1))
- **Space Complexity:** O(L)

**File:** `Problem2_WordSearch.java`

## Problem 3: N-Queens
Place N queens on an N × N chessboard so that no two queens attack each other.

- **Technique:** Recursion and backtracking
- **Optimization:** Track occupied columns and diagonals.
- **Time Complexity:** O(N × N!) as a conservative bound for the basic implementation.
- **Board Space:** O(N²)

**File:** `Problem3_NQueens.java`

## Conclusion
This assignment demonstrates recursion, base cases, recursive calls, backtracking, and complexity analysis through three practical problems.

## Author
**Ishant Pathak**  
B.Tech CSE — Cloud Computing and DevOps  
GLA University
