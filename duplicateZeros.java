public class duplicateZeros {
    public static void main(String[] args) {
    
        int[] arr = {1,0,2,3,0,4,5,0};

        int count = 0;

        for(int elem : arr) {
            count+= (elem == 0) ? 1 : 0;
        }

        int[] helperArray = new int[arr.length+count];

        count=0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                helperArray[count++]=0;
                helperArray[count++]=0;
            } else {
                helperArray[count++]=arr[i];
            }
                

                // traverse and shift array elements from end of array to where main loop paused
                // put a zero in the following array element and add 2 to i in the main loop, to 
                // skip the newly created element

            }

            for (int i=0;i<arr.length;i++) {
                arr[i]=helperArray[i];
            }
        }
    
    }
