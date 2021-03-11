public class Diamond {
    public static void main(String[] args) {
        // use 2 loops, the outer for the vertical and the inner for the horizontal
        // start out with an empty string and start each inner loop traversal with a 
        // newline character, followed by the number of stars dictated by the inner loop
        // use an end variable to determine length of string addition. 
        // if you are halfway through the outer loop, gradually decrease end variable, else
        // increase end variable. increase and decrease in steps of 3 to create diamond.
        int n=1;

        for (int i=0;i<5;i++){
            for (int j=0;j<15-n;j++){
                System.out.print("*");
            }
            System.out.println();
            n+=3;
        }
    }
    
}
