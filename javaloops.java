public class javaloops {
    public static void main(String[] args) {
        var a = 0;
        var b = 2;       
        var n = 10;
        int[] loopValues = new int[n];
        loopValues[0]=(int)(a + (Math.pow(2, 0)*b));
        System.out.println(loopValues[0]);

        for (int i=1; i<n;i++)
        {
            loopValues[i]=loopValues[i-1]+(int)((Math.pow(2, i)*b));
        }

        for (int x : loopValues) {
            System.out.print(x + " ");
        }
    }
}
