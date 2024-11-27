package GUI;
//Imports to use methods from other classes
import static GUI.AddSubQuiz.*;
import static GUI.Learn.*;
import static GUI.MultDivQuiz.frame2;
import static GUI.Practice.*;
//GUI Imports
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame{
    static JMenuBar mb;
    static JMenu Practice, Quiz, Learn;
    static JMenuItem Add, Sub, Mult, Div,LA,LS,LM,LD, AddSubQuiz,MultDivQuiz;

    public static void MyFrame() {//create main page
    
        JFrame frame = new JFrame("Math for Kids"); //create new frame and name it
        frame.setResizable(false); //can't adjust size of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
   
        ImageIcon mainpage = new ImageIcon("/Users/emilychau/Desktop/CMPR_Project/LEARN.png");
        JLabel main = new JLabel(mainpage);
        frame.add(main);
        mb = new JMenuBar();
        Learn = new JMenu("Learn");
        Practice = new JMenu("Practice");
        Quiz = new JMenu("Timed Quiz");
        
        Add = new JMenuItem("Addition");
        Sub = new JMenuItem("Subtraction");
        Mult = new JMenuItem("Multiplication");
        Div = new JMenuItem("Division");
        
        LA = new JMenuItem("Addition");
        LS = new JMenuItem("Subtraction");
        LM = new JMenuItem("Multiplication");
        LD = new JMenuItem("Division");
        
        AddSubQuiz = new JMenuItem("Add & Subtract Quiz");
        MultDivQuiz = new JMenuItem("Multiplication & Division Quiz");
        Learn.add(LA);
        Learn.add(LS);
        Learn.add(LM);
        Learn.add(LD);
        Practice.add(Add);
        Practice.add(Sub);
        Practice.add(Mult);
        Practice.add(Div);
        Quiz.add(AddSubQuiz);
        Quiz.add(MultDivQuiz);
        mb.add(Learn);
        mb.add(Practice);
        mb.add(Quiz);
        frame.setJMenuBar(mb);
        frame.setVisible(true);
        
    }
    public static void MainPage(){//Method to call all actionlisteners and Frame
        MyFrame();
        menus();
    }
    public static void menus(){//menu actionlistener 
        Add.addActionListener((ActionEvent e) -> {
            JFrame frame = new Practice();
            problem();
            actionlistener();
            frame.setTitle("Addition");
            frame.pack();
            frame.setVisible(true);
            frame.setResizable(false);
        });//practice addition actionlistener
        
        Sub.addActionListener((ActionEvent e) -> {
            JFrame frame = new Practice();
            problem1();
            actionlistener1();
            frame.setTitle("Subtraction");
            frame.pack();
            frame.setVisible(true);
            frame.setResizable(false);
        });//practice subtraction actionlistener
        Mult.addActionListener((ActionEvent e) -> {
            JFrame frame = new Practice();
            problem2();
            actionlistener2();
            frame.setTitle("Multiplication");
            frame.pack();
            frame.setVisible(true);
            frame.setResizable(false);
        });//practice multiplication actionlistener
        Div.addActionListener((ActionEvent e) -> {
            JFrame frame = new Practice();
            problem3();
            actionlistener3();
            frame.setTitle("Division");
            frame.pack();
            frame.setVisible(true);
            frame.setResizable(false);
        });//practice division actionlistener
        AddSubQuiz.addActionListener((ActionEvent e) -> {
            frame();
        });//Add/Sub Quiz actionlistener
        MultDivQuiz.addActionListener((ActionEvent e)->{
            frame2();
        });//Mult/Div Quiz actionlistener
        LA.addActionListener((ActionEvent e) ->{
            Add();
        });// Learn addition actionlistener
        LS.addActionListener((ActionEvent e) ->{
            Subtract();
        });// Learn subtraction actionlistener
        LM.addActionListener((ActionEvent e)->{
            Multiplication();
        });// Learn Multiplication actionlistener
        LD.addActionListener((ActionEvent e)->{
            Division();
        });// Learn Division Actionlistener
        
    }
}
