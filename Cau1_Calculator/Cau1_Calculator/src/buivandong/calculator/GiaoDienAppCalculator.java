package buivandong.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GiaoDienAppCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btndot;
	private JButton btn00;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnEqual;
	private JButton btnPercent;
	private JButton btnChia;
	private JButton btnNhan;
	private JButton btnTru;
	private JButton btnCong;

	/**
	 * Launch the application.
	 */
	
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienAppCalculator frame = new GiaoDienAppCalculator();
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
	public GiaoDienAppCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(57, 10, 459, 81);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(51, 204, 153));
		btnBack.addActionListener(new ActionListener() {
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
		btnBack.setFont(new Font("Dialog", Font.BOLD, 30));
		btnBack.setBounds(57, 108, 76, 61);
		contentPane.add(btnBack);
		
		btn7 = new JButton("7");
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(0, 153, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 24));
		btn7.setBounds(57, 189, 76, 61);
		contentPane.add(btn7);
		
		btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(0, 153, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 24));
		btn4.setBounds(57, 277, 76, 61);
		contentPane.add(btn4);
		
		btn1 = new JButton("1");
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(0, 153, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 24));
		btn1.setBounds(57, 378, 76, 61);
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(0, 153, 255));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 24));
		btn0.setBounds(57, 478, 76, 61);
		contentPane.add(btn0);
		
		btnClear = new JButton("C");
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(255, 0, 102));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 24));
		btnClear.setBounds(182, 107, 76, 61);
		contentPane.add(btnClear);
		
		btn8 = new JButton("8");
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBackground(new Color(0, 153, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 24));
		btn8.setBounds(182, 189, 76, 61);
		contentPane.add(btn8);
		
		btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(0, 153, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 24));
		btn5.setBounds(182, 277, 76, 61);
		contentPane.add(btn5);
		
		btn2 = new JButton("2");
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(0, 153, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 24));
		btn2.setBounds(182, 378, 76, 61);
		contentPane.add(btn2);
		
		btndot = new JButton(".");
		btndot.setForeground(new Color(255, 255, 255));
		btndot.setBackground(new Color(0, 153, 255));
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Dialog", Font.BOLD, 24));
		btndot.setBounds(182, 478, 76, 61);
		contentPane.add(btndot);
		
		btn00 = new JButton("00");
		btn00.setForeground(new Color(255, 255, 255));
		btn00.setBackground(new Color(0, 153, 255));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Dialog", Font.BOLD, 24));
		btn00.setBounds(310, 107, 76, 61);
		contentPane.add(btn00);
		
		btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(0, 153, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 24));
		btn9.setBounds(310, 189, 76, 61);
		contentPane.add(btn9);
		
		btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(0, 153, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 24));
		btn6.setBounds(310, 277, 76, 61);
		contentPane.add(btn6);
		
		btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(0, 153, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 24));
		btn3.setBounds(310, 378, 76, 61);
		contentPane.add(btn3);
		
		btnEqual = new JButton("=");
		btnEqual.setForeground(new Color(255, 255, 255));
		btnEqual.setBackground(new Color(0, 153, 255));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
			}
		});
		btnEqual.setFont(new Font("Dialog", Font.BOLD, 24));
		btnEqual.setBounds(310, 478, 76, 61);
		contentPane.add(btnEqual);
		
		btnPercent = new JButton("%");
		btnPercent.setForeground(new Color(255, 255, 51));
		btnPercent.setBackground(new Color(51, 204, 153));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Dialog", Font.BOLD, 30));
		btnPercent.setBounds(440, 478, 76, 61);
		contentPane.add(btnPercent);
		
		btnChia = new JButton("/");
		btnChia.setForeground(new Color(255, 255, 51));
		btnChia.setBackground(new Color(51, 204, 153));
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnChia.setFont(new Font("Dialog", Font.BOLD, 30));
		btnChia.setBounds(440, 378, 76, 61);
		contentPane.add(btnChia);
		
		btnNhan = new JButton("*");
		btnNhan.setForeground(new Color(255, 255, 51));
		btnNhan.setBackground(new Color(51, 204, 153));
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnNhan.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNhan.setBounds(440, 277, 76, 61);
		contentPane.add(btnNhan);
		
		btnTru = new JButton("-");
		btnTru.setForeground(new Color(255, 255, 51));
		btnTru.setBackground(new Color(51, 204, 153));
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnTru.setFont(new Font("Dialog", Font.BOLD, 30));
		btnTru.setBounds(440, 189, 76, 61);
		contentPane.add(btnTru);
		
		btnCong = new JButton("+");
		btnCong.setForeground(new Color(255, 255, 51));
		btnCong.setBackground(new Color(51, 204, 153));
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnCong.setFont(new Font("Dialog", Font.BOLD, 30));
		btnCong.setBounds(440, 107, 76, 61);
		contentPane.add(btnCong);
	}
}
