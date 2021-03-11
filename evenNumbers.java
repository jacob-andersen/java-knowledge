public class evenNumbers {
    public static void main(String[] args) {
        int num = 200;

        int[] evenNumbers = new int[num/2];
		int idx = 0;	
		for (int i=1;i<=num;i++) {
			if(i%2==0) {
                evenNumbers[idx]=i;
                idx++;
			}			
        }
        for (int elem : evenNumbers) {
            System.out.println(elem);
        }
    }
}
