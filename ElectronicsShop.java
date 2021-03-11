public class ElectronicsShop {
    public static void main(String[] args) {
        
        int[] keyboards = {4};
        int[] drives = {5};
        int budget = 5;
        
        int maxPrice = -1;

        for (int i=0;i<keyboards.length;i++) {
            for(int j=0;j<drives.length;j++){
                int combinedPrice = keyboards[i] + drives[j];

                System.out.println(combinedPrice);

                if (combinedPrice > maxPrice && combinedPrice <= budget) {
                    maxPrice = combinedPrice;
                }
            
                System.out.println(combinedPrice + " " + maxPrice);
            }
        }
        System.out.println(maxPrice);
    }
}