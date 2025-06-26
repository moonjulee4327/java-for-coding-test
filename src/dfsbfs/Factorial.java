package dfsbfs;

public class Factorial {
    public static void main(String[] args) {
        int input = 7;
        System.out.println("factorialRecursive("+ input + ") : " + factorialRecursive(input));
        System.out.println("factorialIterative("+ input + ") : " + factorialIterative(input));
    }

    private static int factorialRecursive(int i) {
        if(i <= 1) {
            return 1;
        }
        return i * factorialRecursive(i - 1);
    }

    private static int factorialIterative(int num) {
        int result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
