package GUI;
import javax.swing.*;
//get methods from practice and timer class
import static GUI.Practice.*;
import static GUI.Timer.*;
import java.awt.*;
import java.awt.event.*;
public class AddSubQuiz extends JFrame{
    static int progress = 0, correct = 0, ms = 1000;
    static JLabel complete, result, Timer;
    static JButton submitAnswer;
    static JPanel panel;
    static JFrame Quiz;
    AddSubQuiz(){//Constructor for JPanel
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
    public static void frame(){//Method for frame and calling all methods
            Timer();
            Quiz = new AddSubQuiz();
            Quiz.setTitle("Add & Subtract Quiz");
            problem();//method from practice class to generate addition problems
            Check();
            Quiz.pack();
            Quiz.setVisible(true);
            Quiz.setResizable(false);
            Quiz.addWindowListener(new WindowAdapter() {//reset timer and progress when frame is closed
                @Override
                public void windowClosing(WindowEvent e) {
                        timer.stop();
                        progress = 0;
                }
            });
    }
    public static void Check(){
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
                Quiz.dispose();
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
                problem();//addition problem generator
            }else{
                problem1();//subtraction problem generator
            }
            complete.setText(progress+"% complete");
        });
    }
}
