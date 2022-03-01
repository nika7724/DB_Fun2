import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DB_Login_Window {

    private JFrame frame;
    private JTextField usrTxtFld;
    private JPasswordField pswrdFld;
    private JLabel usrLbl;
    private JLabel pswrdLbl;

    /*internal method */
    public DB_Login_Window() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Login window");
        frame.setBounds(800, 500, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        usrLbl = new JLabel("User name:");
        usrLbl.setBounds(57, 61, 70, 16);/*create a label*/
        frame.getContentPane().add(usrLbl);/*put this on to the frame*/

        usrTxtFld = new JTextField("add user name");
        usrTxtFld.setBounds(156, 56, 203, 36);
        frame.getContentPane().add(usrTxtFld);
        usrTxtFld.setColumns(10);

        pswrdLbl = new JLabel("Password");
        pswrdLbl.setBounds(63, 112, 87, 16);
        frame.getContentPane().add(pswrdLbl);

        pswrdFld = new JPasswordField();
        /*pswrdFld.setEchoChar('*');*/
        pswrdFld.setBounds(156, 107, 203, 36);
        frame.getContentPane().add(pswrdFld);


        JButton connectBtn = new JButton("Login"); /*intantiate here*/
        connectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String userName = usrTxtFld.getText();
                    String password = new String(pswrdFld.getPassword());
                    if (DB_Statements.checkLogin(userName, password)) { /*if this is correct*/
                        JOptionPane.showMessageDialog(null, "User found. \nAccess granted.");
                    } else {
                        /*if they don't find*/
                        JOptionPane.showMessageDialog(null, "User not found\nAccess denied");
                    }
                    usrTxtFld.setText("");
                    pswrdFld.setText("");
                    usrTxtFld.grabFocus();

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, e1);
                }
            }
        });

        connectBtn.setBounds(148, 172, 117, 29);
        frame.getContentPane().add(connectBtn);

        frame.setVisible(true);
    }
}
