public class HigherNumber {
    public static void main(String[] args) {
        int n = 0;
        int[] numbers = {5,4,15,22,8,3};
        boolean result = findExistHigherNumber(numbers,n);
        System.out.println(result);
    }

    public static boolean findExistHigherNumber(int num[],int n) {
        boolean result = false;
        for (int i = 0;i<num.length;i++){
            if (n<=num[i]){
                result =true;
                break;
            }
        }
        return result;

    }

}

