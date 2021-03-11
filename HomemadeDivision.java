public class HomemadeDivision {
    public static void main(String[] args) {
        int divisor1 = 5;
        int divisor2 = 50;
        int quotient = 0;
        int sum = 0;

        while (sum < divisor1 && divisor1 > 0 && divisor2 > 0 && divisor1 >= divisor2) {
            sum+=divisor2;
            quotient++;
        }

        // quotient = () ? :

        System.out.println(quotient);

        // keep adding divisor2 to sum and increasing quotient
        // until sum is higher than divisor1, then return quotient
    }
    
}
