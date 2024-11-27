package GUI;
import java.awt.Color;
import javax.swing.*;

public class Learn extends JFrame{

    public static void Add(){
        JFrame frame = new JFrame();
        frame.setTitle("Learn Addition");
        frame.pack();
        frame.setSize(530,530);
        frame.getContentPane().setBackground(Color.WHITE);
        ImageIcon Add = new ImageIcon("/Users/emilychau/Desktop/CMPR_Project/Addition.png");
        JLabel ADD = new JLabel(Add);
        frame.add(ADD);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    public static void Subtract(){
        JFrame frame = new JFrame();
        frame.setTitle("Learn Subtraction");
        frame.pack();
        frame.setSize(530,530);
        frame.getContentPane().setBackground(Color.WHITE);
        ImageIcon Sub = new ImageIcon("/Users/emilychau/Desktop/CMPR_Project/Subtraction.png");
        JLabel SUB = new JLabel(Sub);
        frame.add(SUB);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    public static void Multiplication(){
        JFrame frame = new JFrame();
        frame.setTitle("Learn Multiplication");
        frame.pack();
        frame.setSize(530,530);
        frame.getContentPane().setBackground(Color.WHITE);
        ImageIcon Mult = new ImageIcon("/Users/emilychau/Desktop/CMPR_Project/Multiplication.png");
        JLabel MULT = new JLabel(Mult);
        frame.add(MULT);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    public static void Division(){
        JFrame frame = new JFrame();
        frame.setTitle("Learn Division");
        frame.pack();
        frame.setSize(530,530);
        frame.getContentPane().setBackground(Color.WHITE);
        ImageIcon Div = new ImageIcon("/Users/emilychau/Desktop/CMPR_Project/Division.png");
        JLabel DIV = new JLabel(Div);
        frame.add(DIV);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
