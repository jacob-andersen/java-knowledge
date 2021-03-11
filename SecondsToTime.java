    import java.util.Scanner;

    public class SecondsToTime {

  public static void main(String[] args) {

      int totalSeconds = 3660;
      String timeString = "";
      
      int hours = totalSeconds / 3600;
      timeString += hours + ":";
      
      int minutes = (totalSeconds - (hours * 3600)) / 60;
      timeString += (minutes > 9) ? minutes+":" : "0"+minutes+":";

      int seconds = (totalSeconds - (hours * 3600) - minutes * 60);
      timeString += (seconds > 9) ? seconds+":" : "0"+seconds;
      
      System.out.println(timeString);

  }
}