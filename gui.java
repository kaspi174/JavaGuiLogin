import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gui implements ActionListener{
   
private static JLabel userLabel;
private static JTextField userText;
   private static JLabel passwordLabel;
   private static JPasswordField passwordText;
   private static JButton button;
   private static JLabel success;
public static void main(String[] args){
    
    
    
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    frame.setSize(100,100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);

    panel.setLayout(null);

    userLabel = new JLabel("User");
    userLabel.setBounds(10,20,80,25);
   
    userText = new JTextField(20);
    userText.setBounds(100, 20, 80, 25);
    panel.add(userLabel);

    passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(10, 50, 80, 25);

    passwordText = new JPasswordField();
    passwordText.setBounds(100, 50, 165, 25);
    panel.add(passwordText);

    button = new JButton();
    button.setBounds(10, 80, 80, 25);
    button.addActionListener(new gui());
    panel.add(button);


   success = new JLabel("");
    success.setBounds(10, 110, 300, 25);
    panel.add(success);
    success.setText(null);

    frame.setVisible(true);


    
}

@Override
public void actionPerformed(ActionEvent e){
    
    String user = userText.getText();
    String password = passwordText.getText();

    if(user.equals("Kacper") && password.equals("java")){
        success.setText("Login Succesful!");
    }

}

}