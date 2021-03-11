public class Population {
    public static void main(String[] args) {
        int p0 = 1500;
        int p = 5000;
        double percent = 0.05;
        int aug = 100;
        int nb_year = 0;

        while (p0 <= p) {
            p0 *= percent+1;
            p0 += aug;
            nb_year++;
        }
        System.out.println(nb_year);        
    }
    
}
