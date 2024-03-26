import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.*;

public class LoginView extends JFrame {

     JLabel jLabelUname = new JLabel("username:");
    JTextField jTxtUname = new JTextField(8);
    
    JLabel jLabelPswd = new JLabel("password:");
    JTextField jTxtPswd = new JTextField(8);
    
    
JButton LoginButton = new JButton("Login");
JButton RegisterButton = new JButton("Register");

    LoginView(){
        setTitle("Login into Your Account");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        userGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    }

    public static void main(String[] args) {

        // JFrame frame = new JFrame();
        // JTextField textField = new JTextField();
        // frame.add(textField);
        // frame.setSize(300, 200);
        // textField.setBounds(50, 50, 150, 30);
        // frame.setVisible(true);
    new LoginView();
    }

void userGUI()
{
    Container window = getContentPane();
    window.setLayout(new GridLayout(10, 10));
    window.add(jLabelUname);
window.add(jTxtUname);
window.add(jLabelPswd);
window.add(jTxtPswd);


window.add(LoginButton);
window.add(RegisterButton);
}


}
