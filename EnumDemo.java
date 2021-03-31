public class EnumDemo {
    public static void main(String[] args) {
        Season s = Season.valueOf("SUMMER");
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);

        for(Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }
    }
}
