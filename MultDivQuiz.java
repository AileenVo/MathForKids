package GUI;
import javax.swing.*;
//get methods from practice and timer class
import static GUI.Practice.*;
import static GUI.Timer.*;
import java.awt.*;
import java.awt.event.*;
public class MultDivQuiz extends JFrame{
    static JFrame Quiz1;
    MultDivQuiz(){//Constructor for JPanel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(240, 60));
        Timer = new JLabel();
        complete = new JLabel(progress+"% complete");
        answer = new JTextField(2);
        submitAnswer = new JButton("Submit");
        Add = new JLabel();
        panel.add(Timer);
        panel.add(complete);
        panel.add(Add);
        panel.add(answer);
        panel.add(submitAnswer);
        add(panel);
    }
    public static void frame2(){//Method for frame and calling all methods
        Timer();
        Quiz1 = new MultDivQuiz();
        Quiz1.setTitle("Multiplication & Division Quiz");
        problem2();//method from practice class to generate multiplication problems
        Check2();
        Quiz1.pack();
        Quiz1.setVisible(true);
        Quiz1.setResizable(false);
        Quiz1.addWindowListener(new WindowAdapter() {//reset timer and progress when frame is closed
            @Override
            public void windowClosing(WindowEvent e) {
                    timer.stop();
                    progress = 0;
            }
        });
    }
    public static void Check2(){
        submitAnswer.addActionListener((ActionEvent e) -> {
            String answer1 = answer.getText();
            try {
                Canswer = Integer.parseInt(answer1);
            }catch(NumberFormatException a){//remove exception in thread
            }
            if(correctAnswer == Canswer){
                correct++;
                answer.setText("");
            }else{
                answer.setText("");
            }
            progress++;
            if(progress == 100){
                Quiz1.dispose();
                timer.stop();
                if(correct == 100){
                    JOptionPane.showMessageDialog(null, "Great job you got all 100 questions right\n"+
                            "with a time of "+TenMinutes+SingleMinutes + ":"+TenSeconds+SingleSeconds);
                }else if(correct >= 90 && correct <100){
                    JOptionPane.showMessageDialog(null, "Nice job you are getting very close to a perfect score.\n"+
                            "Your time is "+TenMinutes+SingleMinutes + ":"+TenSeconds+SingleSeconds);
                }else{
                    JOptionPane.showMessageDialog(null, "Good try keep practicing and you'll get better.\n"+
                            "Your time is "+TenMinutes+SingleMinutes + ":"+TenSeconds+SingleSeconds);
                }
            }
            if(progress % 2 == 0){//switch between addition and subtraction problems
                problem2();//multiplcation problem generator
            }else{
                problem3();//division problem generator
            }
            complete.setText(progress+"% complete");
        });
    }
}
