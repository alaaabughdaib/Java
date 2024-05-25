package aylacar;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class login_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JButton login_btn = new JButton("Log In");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_frame frame = new login_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 554, 504);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        // Set layout manager to null
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(64, 0, 64));
        // Set bounds of the panel to match the size of the frame
        panel.setBounds(0, 0, 555, 487);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Log In");
        lblNewLabel.setBounds(206, 24, 235, 88);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Email :");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(76, 131, 208, 120);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Password :");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(76, 207, 208, 62);
        panel.add(lblNewLabel_2);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(219, 232, 281, 19);
        panel.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(219, 178, 281, 19);
        panel.add(textField_1);
        
        JButton login_btn = new JButton("Log In");
        login_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
        login_btn.setForeground(new Color(64, 0, 64));
        login_btn.setBounds(206, 292, 114, 33);
        panel.add(login_btn);
	}
	public JButton getLoginButton() {
        return login_btn;
    }

}
