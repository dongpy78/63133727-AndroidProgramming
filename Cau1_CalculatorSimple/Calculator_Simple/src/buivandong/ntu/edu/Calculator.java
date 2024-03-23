package buivandong.ntu.edu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.synth.SynthTextFieldUI;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String anwser;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(43, 20, 368, 66);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 24));
		btnBackspace.setBounds(43, 96, 64, 53);
		contentPane.add(btnBackspace);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_7.setBounds(43, 172, 64, 53);
		contentPane.add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_4.setBounds(43, 251, 64, 53);
		contentPane.add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_1.getText();
				textField.setText(number);
			}
		});
		
		
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_1.setBounds(43, 324, 64, 53);
		contentPane.add(btn_1);
		
		JButton btn_0 = new JButton("0");
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_0.setBounds(43, 398, 64, 53);
		contentPane.add(btn_0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnClear.setBounds(141, 96, 64, 53);
		contentPane.add(btnClear);
		
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_00.getText();
				textField.setText(number);
			}
		});
		btn_00.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_00.setBounds(243, 96, 64, 53);
		contentPane.add(btn_00);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_plus.setBounds(347, 96, 64, 53);
		contentPane.add(btn_plus);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_8.setBounds(141, 172, 64, 53);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_9.setBounds(243, 172, 64, 53);
		contentPane.add(btn_9);
		
		JButton btn_tru = new JButton("-");
		btn_tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn_tru.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_tru.setBounds(347, 172, 64, 53);
		contentPane.add(btn_tru);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_5.setBounds(141, 251, 64, 53);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_6.setBounds(243, 251, 64, 53);
		contentPane.add(btn_6);
		
		JButton btn_nhan = new JButton("*");
		btn_nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_nhan.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_nhan.setBounds(347, 251, 64, 53);
		contentPane.add(btn_nhan);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_2.setBounds(141, 324, 64, 53);
		contentPane.add(btn_2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn3.setBounds(243, 324, 64, 53);
		contentPane.add(btn3);
		
		JButton btn_chia = new JButton("/");
		btn_chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_chia.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_chia.setBounds(347, 324, 64, 53);
		contentPane.add(btn_chia);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_dot.getText();
				textField.setText(number);
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_dot.setBounds(141, 398, 64, 53);
		contentPane.add(btn_dot);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String anwser;
				second = Double.parseDouble(textField.getText());
				
				if(operation=="+") {
					result = first + second;
					anwser = String.format("%.2f", result);
					textField.setText(anwser);
				} else if(operation=="-") {
					result = first - second;
					anwser = String.format("%.2f", result);
					textField.setText(anwser);
				} else if(operation=="*") {
					result = first * second;
					anwser = String.format("%.2f", result);
					textField.setText(anwser);
				} else if(operation=="/") {
					result = first / second;
					anwser = String.format("%.2f", result);
					textField.setText(anwser);
				} else if(operation=="%") {
					result = first % second;
					anwser = String.format("%.2f", result);
					textField.setText(anwser);
				}
				
				
				
				
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_equal.setBounds(243, 398, 64, 53);
		contentPane.add(btn_equal);
		
		JButton btn_percent = new JButton("%");
		btn_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn_percent.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_percent.setBounds(347, 398, 64, 53);
		contentPane.add(btn_percent);
	}
}