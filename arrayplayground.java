class arrayplayground {
    public static void main(String[] args) {

        int m = 3;
        int n = 4;

        int[][] oldArray = {
            { 11,12,13,14 },
            { 21,22,23,24 },
            { 31,32,33,34 }
        };

        // int [][] newArray = new int [n][m];

        for (int a=0;a<n;a++) {
            for (int b=1;b<m+1;b++) {
                System.out.print(oldArray[m-b][a]+" ");
            }
            System.out.println();
        }

        System.out.println();
        
        // for (int x=0;x<n;x++) {
        //     for (int y=1;y<m+1;y++) {
        //         System.out.print(oldArray[m-y][x]+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println();

    }
}