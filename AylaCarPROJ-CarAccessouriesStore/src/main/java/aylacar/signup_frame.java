package aylacar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class signup_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JButton signup_btn = new JButton("Sign Up");

	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup_frame frame = new signup_frame();
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
	public signup_frame() {
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
        
        JLabel lblNewLabel = new JLabel("Sign Up");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(181, 39, 172, 41);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Customer ID :");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1.setBounds(58, 126, 139, 13);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Name :");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_2.setBounds(58, 165, 139, 13);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Email :");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_3.setBounds(58, 208, 139, 13);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Phone Number :");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_4.setBounds(58, 246, 139, 13);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Address :");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_5.setBounds(58, 283, 139, 13);
        panel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Password :");
        lblNewLabel_6.setForeground(new Color(255, 255, 255));
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_6.setBounds(58, 325, 139, 13);
        panel.add(lblNewLabel_6);
        
        textField = new JTextField();
        textField.setBounds(228, 125, 268, 19);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(228, 164, 268, 19);
        panel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(228, 207, 268, 19);
        panel.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(228, 245, 268, 19);
        panel.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(228, 282, 268, 19);
        panel.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(228, 324, 268, 19);
        panel.add(textField_5);
        
        
        signup_btn.setFont(new Font("Tahoma", Font.BOLD, 16));
        signup_btn.setForeground(new Color(64, 0, 64));
        signup_btn.setBounds(189, 365, 145, 29);
        panel.add(signup_btn);

		
	}
	 public JButton getSignupButton() {
	        return signup_btn;
	    }
}
