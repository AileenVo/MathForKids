package GUI;

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Practice extends JFrame {

    static JLabel Add, check;
    static int Random1, Random2, correctAnswer, Canswer;
    static JTextField answer;
    static JButton submit;
    static JFrame frame;

    public static void generate() {//Generate for Addition and subtraction
        Random r = new Random();
        Random1 = r.nextInt(10);
        Random2 = r.nextInt(10);
    }

    //ADDITION
    Practice() {//Frame for all practice menu items

        Add = new JLabel();
        JPanel panel = new JPanel();
        answer = new JTextField(2);
        submit = new JButton("Submit");
        check = new JLabel("----------");
        panel.add(Add);
        panel.add(answer);
        panel.add(submit);
        panel.add(check);
        add(panel);
    }

    public static void problem() {//problem format for addition
        generate();
        Add.setText(Random1 + " + " + Random2 + " = ");
        correctAnswer = Random1 + Random2;
    }

    public static void actionlistener() {//action listener for addition
        submit.addActionListener((ActionEvent e) -> {
            String answer1 = answer.getText();
            try {
                Canswer = Integer.parseInt(answer1);

            } catch (NumberFormatException a) {//remove exception in thread
            }
            if (correctAnswer != Canswer) {
                check.setText("Try again");
                answer.setText("");
            } else {
                check.setText("Correct");
                answer.setText("");
                generate();
                problem();
            }
        });
    }

    //SUBTRACTION
    public static void problem1() {//problem format for subtraction
        generate();
        Add.setText(Random1 + " - " + Random2 + " = ");
        correctAnswer = Random1 - Random2;
    }

    public static void actionlistener1() {//action listener for subtraction
        submit.addActionListener((ActionEvent e) -> {
            String answer1 = answer.getText();
            try {
                Canswer = Integer.parseInt(answer1);

            } catch (NumberFormatException a) {//remove exception in thread
            }
            if (correctAnswer != Canswer) {
                check.setText("Try again");
                answer.setText("");
            } else {
                check.setText("Correct");
                answer.setText("");
                generate();
                problem1();
            }
        });
    }

    //MULTIPLICATION
    public static void problem2() {//Problem format for multiplication
        generate1();
        Add.setText(Random1 + " * " + Random2 + " = ");
        correctAnswer = Random1 * Random2;
    }

    public static void generate1() {//Generate for multiplication
        Random r = new Random();
        Random1 = r.nextInt(12);
        Random2 = r.nextInt(12);
    }

    public static void actionlistener2() {//actionlistener for multiplication
        submit.addActionListener((ActionEvent e) -> {
            String answer1 = answer.getText();
            try {
                Canswer = Integer.parseInt(answer1);

            } catch (NumberFormatException a) {//remove exception in thread
            }
            if (correctAnswer != Canswer) {
                check.setText("Try again");
                answer.setText("");
            } else {
                check.setText("Correct");
                answer.setText("");
                generate();
                problem2();
            }
        });
    }

    //DIVISION
    public static void generate2() {//Generate for division
        Random r = new Random();
        Random1 = r.nextInt(144) + 1;
        Random2 = r.nextInt(12) + 1;
        if (Random1 % Random2 != 0) {
            generate2();//regenerate if the num1/num2 does not equal a whole number
        }

    }

    public static void problem3() {//Division problem format
        generate2();
        Add.setText(Random1 + " / " + Random2 + " = ");
        correctAnswer = Random1 / Random2;
    }

    public static void actionlistener3() {//actionlistner for division
        submit.addActionListener((ActionEvent e) -> {
            String answer1 = answer.getText();
            try {
                Canswer = Integer.parseInt(answer1);

            } catch (NumberFormatException a) {//remove exception in thread
            }
            if (correctAnswer != Canswer) {
                check.setText("Try again");
                answer.setText("");
            } else {
                check.setText("Correct");
                answer.setText("");
                generate();
                problem3();
            }
        });
    }
}
