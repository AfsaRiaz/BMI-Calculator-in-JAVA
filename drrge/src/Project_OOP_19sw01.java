import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Project_OOP_19sw01 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project_OOP_19sw01 window = new Project_OOP_19sw01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project_OOP_19sw01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBackground(new Color(0, 0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(276, 30, 574, 430);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_8139110628260");
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 43, 574, 94);
		panel_1.add(panel_5);
		panel_5.setBackground(new Color(102, 204, 153));
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("BMI Calculator ");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 45));
		lblNewLabel_4.setBounds(153, 11, 378, 72);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Afsa\\Desktop\\project\\BMI-5-760x434.png"));
		lblNewLabel_7.setBounds(88, 165, 427, 254);
		panel_1.add(lblNewLabel_7);
		//BMI-5-760x434.png
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_8142005786157");
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel = new JLabel("Height(m)");
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblNewLabel.setBounds(65, 66, 153, 39);
		panel_2.add(lblNewLabel);
		
		JLabel lblWeightkg = new JLabel("Weight(kg)");
		lblWeightkg.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblWeightkg.setBounds(65, 131, 153, 39);
		panel_2.add(lblWeightkg);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblBmi.setBounds(39, 254, 153, 39);
		panel_2.add(lblBmi);
		
		textField = new JTextField();
		textField.setBounds(183, 66, 252, 35);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 131, 252, 35);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(314, 254, 153, 39);
		panel_2.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 254, 92, 39);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double h = Double.parseDouble(textField.getText());
				double w = Double.parseDouble(textField_1.getText());
				
				double bmi = w/(h*h);
				
				String cal = String.format("%.2f", bmi);
				
				textField_2.setText(cal);
				
				
				
				if(bmi<=18.5) {
					textField_2.setOpaque(true);
					textField_2.setBackground(Color.blue);
					lblNewLabel_1 .setForeground(Color.blue);
					lblNewLabel_1 .setText("Under Weight");
				}
				else if(bmi<=24.5) {
					textField_2.setOpaque(true);
					textField_2.setBackground(Color.green);
					lblNewLabel_1 .setForeground(Color.green);
					lblNewLabel_1 .setText("Normal Weight");
				}
				else if(bmi<=29.5) {
					textField_2.setOpaque(true);
					textField_2.setBackground(Color.orange);
					lblNewLabel_1 .setForeground(Color.orange);
					lblNewLabel_1 .setText("Over Weight");
				}
				else if(bmi>=30) {
					textField_2.setOpaque(true);
					textField_2.setBackground(Color.red);
					lblNewLabel_1 .setForeground(Color.red);
					lblNewLabel_1 .setText("Obese");
				}
			}
		});
		btnNewButton.setBounds(84, 326, 108, 35);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.validate();
			}
			
		});
		btnNewButton_2.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton_2.setBounds(465, 373, 89, 35);
		panel_2.add(btnNewButton_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_2.setOpaque(true);
				textField_2.setBackground(null);
				lblNewLabel_1.setText("");
			}
		});
		btnReset.setBounds(327, 326, 108, 35);
		panel_2.add(btnReset);
		
		JPanel panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_1180642204775");
		panel_3.setBackground(new Color(255, 255, 255));
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.setBounds(452, 373, 89, 35);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.validate();
			}
		});
		panel_3.setLayout(null);
		btnNewButton_2_1.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_3.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Afsa\\Desktop\\project\\P8.PNG"));
		lblNewLabel_3.setBounds(73, 11, 475, 313);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_1981886222776");
		panel_4.setBackground(new Color(255, 255, 255));
		
		JButton btnNewButton_2_2 = new JButton("Back");
		btnNewButton_2_2.setBounds(465, 373, 89, 35);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.validate();
			}
		});
		panel_4.setLayout(null);
		btnNewButton_2_2.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_4.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Afsa\\Desktop\\project\\p7.PNG"));
		lblNewLabel_2.setBounds(87, 62, 521, 338);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("BMI Chart");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_5.setBounds(26, 29, 446, 71);
		panel_4.add(lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(255, 255, 255));
		layeredPane.add(panel_6, "name_2008157985867");
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Afsa\\Desktop\\project\\p12.PNG"));
		lblNewLabel_8.setBounds(54, 41, 473, 329);
		panel_6.add(lblNewLabel_8);
		
		JButton btnNewButton_2_3 = new JButton("Back");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.validate();
			}
		});
		btnNewButton_2_3.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton_2_3.setBounds(454, 371, 89, 35);
		panel_6.add(btnNewButton_2_3);
		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 274, 430);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(0, 51, 51));
		
		JButton btnNewButton_1 = new JButton("Calculate BMI");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.validate();

			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(0, 106, 274, 37);
		panel.add(btnNewButton_1);
		
		JButton btnAbout = new JButton("BMI Chart");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.validate();

			}
		});
		btnAbout.setForeground(Color.BLACK);
		btnAbout.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnAbout.setBackground(Color.WHITE);
		btnAbout.setBounds(0, 250, 274, 37);
		panel.add(btnAbout);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(0, 298, 274, 37);
		panel.add(btnExit);
		
		JButton btnBmiChart = new JButton("BMI  Formula");
		btnBmiChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.validate();

			}
		});
		btnBmiChart.setForeground(Color.BLACK);
		btnBmiChart.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnBmiChart.setBackground(Color.WHITE);
		btnBmiChart.setBounds(0, 202, 274, 37);
		panel.add(btnBmiChart);
		
		JButton btnNewButton_1_1 = new JButton("Basic Info");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_6);
				layeredPane.repaint();
				layeredPane.validate();
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(0, 154, 274, 37);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("BMI Calculator Application by 19sw01");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_6.setBounds(0, 11, 274, 19);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
