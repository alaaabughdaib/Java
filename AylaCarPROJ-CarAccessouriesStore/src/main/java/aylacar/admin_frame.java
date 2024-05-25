package aylacar;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class admin_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_frame frame = new admin_frame();
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
	public admin_frame() {
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
        
        JButton btnNewButton = new JButton("Manage Products");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton.setBounds(160, 101, 209, 53);
        panel.add(btnNewButton);
        
        JButton btnManageCategories = new JButton("Manage Categories");
        btnManageCategories.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnManageCategories.setBounds(160, 179, 209, 53);
        panel.add(btnManageCategories);
        
        JButton btnManageUsers = new JButton("Manage Users");
        btnManageUsers.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnManageUsers.setBounds(160, 258, 209, 53);
        panel.add(btnManageUsers);
	}

}
