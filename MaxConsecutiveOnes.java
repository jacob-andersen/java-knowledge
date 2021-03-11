public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] binArray = {1,1,1,1,1,1,0,0,1,1,0,1,0,1,0,1,1};

        int longest = 0;
        int count = 0;

        for (int i=0;i<binArray.length;i++) {
            if (binArray[i] == 1) {
                count++;
                longest = (count > longest ? count : longest);
            } else {
                if (binArray[i] == 0)
            {
                longest = (count > longest ? count : longest);
            }
                count = 0;
            }
        }
    System.out.println("Longest Consecutive Sequence of 1's : " + longest);
}
}