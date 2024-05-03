public class lab8 {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] minList = new int[max];

        // initalize minList with max
        for (int i = 1; i <= amount; i++) {
            minList[i] = max;
        }
        
        // base case: $0
        minList[0] = 0; 
        
        // fill minList array
        for (int coin : coins) { // test all coin combos
            for (int j = coin; j <= amount; j++) {
                minList[j] = Math.min(minList[j], minList[j - coin] + 1);
            }
        }
        
        return minList[amount] > amount ? -1 : minList[amount]; // if no solution, minList[amount] would be more than amount
    }
    
    public static void main(String[] args){
        // int[] coins = {1};
        // int amount = 0;

        // lab8 test = new lab8();
        // System.out.println("the optimal solution is " + test.coinChange(coins, amount));
    }
}
