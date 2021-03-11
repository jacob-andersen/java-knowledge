public class Java2DArray {
    public static void main(String[] args) {
        int count = 0; 
        int maxCount = Integer.MIN_VALUE;
        int array[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};

        for (int row = 0;row < 4;row++) {
            for(int column = 0;column < 4;column++){

                // add all array entries in 'H' shape and save in count

                count += array[row][column]+array[row][column+1]+array[row][column+2]+
                                     array[row+1][column+1]+
                         array[row+2][column]+array[row+2][column+1]+array[row+2][column+2];
                
                // compare count variable with maxCount
                // if bigger, make count new maxCount

                maxCount = (count >  maxCount) ? count : maxCount;

                count = 0;
            }
        }
        
        // after loops have traversed array, print maxCount

        System.out.println(maxCount);
    }
    
}