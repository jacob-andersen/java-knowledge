public class MaxPopulationIncrease {
    public static void main(String[] args) {
        double maxPopulation = 0;
        int maxYear = 0;
        int year = 0;

        double thisYearPopulation = 0;
        double lastYearPopulation = 0;

        String line = reader.nextLine();
        line = reader.nextLine();

        String[] columns = line.split(" ",0);
        year = Integer.parseInt(columns[0]);
        lastYearPopulation = Double.parseDouble(columns[1]);

        while (line = reader.nextLine() != -1) {
            columns = line.split(" ", 0);
            year = Integer.parseInt(columns[0]);
            thisYearPopulation = Double.parseDouble(columns[1]);
            if(thisYearPopulation > lastYearPopulation) {
                if (thisYearPopulation - lastYearPopulation > maxPopulation) {
                    maxPopulation = thisYearPopulation - lastYearPopulation;
                    maxYear = year;
                }
                lastYearPopulation = thisYearPopulation;
            }
        }
    }
    
}