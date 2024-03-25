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
		setBounds(100, 100, 672, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(47, 10, 575, 81);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("\uF0E7");
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
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 19));
		btnBack.setBounds(57, 108, 76, 61);
		contentPane.add(btnBack);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn7.setBounds(55, 202, 76, 61);
		contentPane.add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn4.setBounds(57, 310, 76, 61);
		contentPane.add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn1.setBounds(60, 413, 76, 61);
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn0.setBounds(59, 519, 76, 61);
		contentPane.add(btn0);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnClear.setBounds(197, 108, 76, 61);
		contentPane.add(btnClear);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn8.setBounds(195, 202, 76, 61);
		contentPane.add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn5.setBounds(197, 310, 76, 61);
		contentPane.add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn2.setBounds(200, 413, 76, 61);
		contentPane.add(btn2);
		
		btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 19));
		btndot.setBounds(199, 519, 76, 61);
		contentPane.add(btndot);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn00.setBounds(363, 108, 76, 61);
		contentPane.add(btn00);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn9.setBounds(361, 202, 76, 61);
		contentPane.add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn6.setBounds(363, 310, 76, 61);
		contentPane.add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn3.setBounds(366, 413, 76, 61);
		contentPane.add(btn3);
		
		btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnEqual.setBounds(365, 519, 76, 61);
		contentPane.add(btnEqual);
		
		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnPercent.setBounds(528, 519, 76, 61);
		contentPane.add(btnPercent);
		
		btnChia = new JButton("/");
		btnChia.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnChia.setBounds(529, 413, 76, 61);
		contentPane.add(btnChia);
		
		btnNhan = new JButton("*");
		btnNhan.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNhan.setBounds(526, 310, 76, 61);
		contentPane.add(btnNhan);
		
		btnTru = new JButton("-");
		btnTru.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnTru.setBounds(524, 202, 76, 61);
		contentPane.add(btnTru);
		
		btnCong = new JButton("+");
		btnCong.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnCong.setBounds(526, 108, 76, 61);
		contentPane.add(btnCong);
	}
}
