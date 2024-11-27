package GUI;
import java.awt.event.*;
public class Timer extends AddSubQuiz{
  
    static int SingleSeconds, TenSeconds, SingleMinutes, TenMinutes;
    static javax.swing.Timer timer;
    
    public static void Timer(){
        SingleSeconds = 0; TenSeconds = 0; SingleMinutes = 0; TenMinutes = 0;
        timer = new javax.swing.Timer(ms, (ActionEvent e) -> {
            SingleSeconds++;
            if(SingleSeconds == 10){//Reset each number to zero when the timer hits ten 
                SingleSeconds = 0;
                TenSeconds++;
            }
            if(TenSeconds == 6){
                TenSeconds = 0;
                SingleMinutes++;
            }
            if(SingleMinutes == 10){
                SingleMinutes = 0;
                TenMinutes++;
            }
            Timer.setText("Time "+TenMinutes+SingleMinutes + ":"+TenSeconds+SingleSeconds);
        });
        timer.start();

    }
}