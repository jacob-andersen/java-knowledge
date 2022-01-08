public class factorial {
    public static void main(String[] args) {
        int n = 10;
        long fact = 1;
        for (int i = 2;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
    
}
