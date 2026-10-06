package digitalclock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {

    public static void main(String[] args) {

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        while (true) {

            Date currentTime = new Date();

            System.out.println("Current Time: " + timeFormat.format(currentTime));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Clock stopped.");
                break;
            }
        }
    }
}