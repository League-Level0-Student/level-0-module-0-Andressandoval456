package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
System.out.println("Hi");	
String input = JOptionPane.showInputDialog("What is your name");
JOptionPane.showMessageDialog(null,"Hellow"+input);

}
}
