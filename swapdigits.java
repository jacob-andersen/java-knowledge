public class swapdigits {
    public static void main(String[] args) {
        int number = 19;
        String digits = Integer.toString(number);
        int swappedNumber = Integer.parseInt(digits.substring(1)+digits.substring(0,1)); 

        System.out.println(number + " : -> " + digits + " swapped number : " + swappedNumber);

        System.out.println(swappedNumber <= number);
    }
}