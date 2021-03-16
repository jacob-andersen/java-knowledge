import java.util.Timer;
import java.util.TimerTask;

public class Pomodoro {

    int secondsPassed = 0;

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            if (secondsPassed == 1500) {    // 1500 seconds = 25 minutes, the duration of ONE Pomodoro
                timer.cancel();             // stop timer after ONE Pomodoro.
            }
            System.out.println("Seconds passed: " + secondsPassed);
            secondsPassed++;
        };
        
    };

    public void start() {
        timer.scheduleAtFixedRate(task,1000,1000);
    }

    public static void main(String[] args) {
        Pomodoro pomodoroTimer = new Pomodoro();
        pomodoroTimer.start();
    }
        
    
}
