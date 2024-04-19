public class lab1 {
    public String findSum(int[] array, int target){
        int index1;
        if(array!=null){
            for(int i = 0; i < array.length; i++){
                index1 = array[i];
                for(int j = 0; j < array.length; j++){
                    if(j!=i && (array[j]+index1 == target))
                        return "indices "+ i + " and " + j + " add up to " + target;
                }
            }
        }
        return null;
    }

    // public static void main(String[] args){
        // int[] array = {4,2,3,6};
        // int target = 10;
        // lab1 test = new lab1();
        // System.out.println(test.findSum(array, target));
    // }
    
}
