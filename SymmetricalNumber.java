// program that determines whether a number is symmetric or asymmetric
// example of a symmetric number : 1221
// example of an asymmetric number 1234
public class SymmetricalNumber {
    public static void main(String[] args) {
        
    
    String number = "1234";
    boolean isSymmetric = true;

    for (int i=0;i<number.length()&&isSymmetric==true;i++) {
        
        isSymmetric = (number.charAt(i)==number.charAt(number.length()-1-i)) ? true : false;

        System.out.println (number.charAt(i) + " " + number.charAt(number.length()-1-i) + " ---> " + isSymmetric);
    }
   System.out.println(isSymmetric); 
}
}