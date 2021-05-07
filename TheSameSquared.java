public class TheSameSquared {
    public static void main(String[] args) {

        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
        
    }

    public static boolean comp(int[] a, int[] b) {
        int number = 0;
        for (int x : a) {
            for (int y : b) {
                if (a.length==0||b.length==0||(Integer) x==null||(Integer) y==null) {
                    return false;
                }
                number += (y==(x*x)) ? 1 : 0;
            }
        }
        return (number/2 == a.length) ? true : false;
    }
    
}