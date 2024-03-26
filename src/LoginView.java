import javax.swing.JFrame;

public class LoginView extends JFrame {

    LoginView(){
        setTitle("Login into Your Account");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    }

    public static void main(String[] args) {

    new LoginView();
    }

}
