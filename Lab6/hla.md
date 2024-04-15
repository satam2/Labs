When I heard this problem, I was kind of lost on where to begin. I decided to draw a sketch of the two test conditions and realized the program returned false only on cyclic graphs. 

I decided to use DFS and its visited list to check for a cycle. The first thing it does is check the first unvisited node and pushes it onto the stack. A variable curr is then set to the integer on the top of the stack. It is compared to the visited list. 

As soon as a cycle is detected, the program returns false. Else, if the program runs all the way, it returns true because no cycles were detected.

tldr: I go through the adjacency list's nodes and check for cycle using DFS.
