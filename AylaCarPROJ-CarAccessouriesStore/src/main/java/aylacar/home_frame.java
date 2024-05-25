package aylacar;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch;
	JButton view_order_btn = new JButton("View Orders");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home_frame frame = new home_frame();
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
	public home_frame() {
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
        
        txtSearch = new JTextField();
        txtSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtSearch.setText("  Search");
        txtSearch.setBounds(72, 118, 308, 31);
        panel.add(txtSearch);
        txtSearch.setColumns(10);
        
        JButton btnNewButton = new JButton("Search");
        btnNewButton.setBounds(379, 118, 71, 31);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Interior");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 9));
        btnNewButton_1.setBounds(62, 209, 85, 31);
        panel.add(btnNewButton_1);
        
        JLabel lblNewLabel = new JLabel("Categories :");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(62, 175, 91, 13);
        panel.add(lblNewLabel);
        
        JButton btnNewButton_5 = new JButton("New button");
        btnNewButton_5.setBounds(182, 209, 91, 118);
        panel.add(btnNewButton_5);
        
        JLabel lblNewLabel_1 = new JLabel("Ayla Car");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 33));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(182, 33, 242, 60);
        panel.add(lblNewLabel_1);
        
        JButton btnNewButton_1_1 = new JButton("Exterior");
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 9));
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_1_1.setBounds(62, 253, 85, 31);
        panel.add(btnNewButton_1_1);
        
        JButton btnNewButton_1_2 = new JButton("Electronics");
        btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 9));
        btnNewButton_1_2.setBounds(62, 296, 85, 31);
        panel.add(btnNewButton_1_2);
        
        JButton btnNewButton_5_1 = new JButton("New button");
        btnNewButton_5_1.setBounds(278, 209, 91, 118);
        panel.add(btnNewButton_5_1);
        
        JButton btnNewButton_5_2 = new JButton("New button");
        btnNewButton_5_2.setBounds(374, 209, 91, 118);
        panel.add(btnNewButton_5_2);
        
       
        view_order_btn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        view_order_btn.setBounds(374, 62, 91, 21);
        panel.add(view_order_btn);
	}
	
	public JButton getLoginButton() {
        return view_order_btn;
    }
}
