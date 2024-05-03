In order to solve this problem, we can use dynamic programming. <br>

The decision that is being made at each step is "do we use this coin as part of our solution"? In order to figure that part out, I used a nested for loop. First, the program tries to make the amount using only the smallest coin denomination possible. Then, it mixes the smallest coin with some of the second-to-smallest coins and checks to see if the total amount of coins used in the solution in the mix is better than the first solution. If it is better, we keep the solution. This keeps going and checks if the solution uses fewer coins than the last. <br>

We check if the current solution uses less coins than th last by looking at the step that matches the value of the coin we are going to add and see if adding the coin (minList[j-coin]+1) to the list gets you the amount in fewer coins than the last solution (minList[j]).

