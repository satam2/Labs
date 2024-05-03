from typing import List

class lab8():
    def coinChange(self, coins: List[int], amount: int) -> int:
        minList = [float('inf')] * (amount + 1)
        minList[0] = 0

        for coin in coins:
            for j in range(coin, amount + 1):
                minList[j] = min(minList[j], minList[j - coin] + 1)

        # if minList[amount] is infinity, it means it's impossible to form the amount with the given coins
        return minList[amount] if minList[amount] != float('inf') else -1
    
# test = lab8()
# coins = [1]
# amount = 0
# print("the optimal amount is " + str(test.coinChange(coins,amount)))
