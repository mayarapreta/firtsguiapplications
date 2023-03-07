package firtsguiapplications;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PockeMoney {
	

	
		public static void main(String[] args) {
				
				JFrame frame = new JFrame ("Bank");
				
				final JLabel moneyLabel = new JLabel("Please input your Pocker money");
				moneyLabel.setBounds(213, -11, 224, 55);
				moneyLabel.setFont(new Font("Arial",Font.BOLD,12));
				
				final TextField moneyTextField = new TextField();
				moneyTextField.setBounds(199, 69, 224, 55);
				moneyTextField.setFont(new Font("Corbel", Font.BOLD, 17));
			
				
				final JLabel resultLabel = new JLabel("");
				resultLabel.setBounds(199, 130, 224, 55);
				resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
				
				JButton submitButton = new JButton("Submit");
				submitButton.setBounds(10, 208, 224, 55);
				JButton submitButton2 = new JButton("Cancel");
				submitButton2.setBounds(377, 208, 224, 55);
				
				submitButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						@SuppressWarnings("unused")
						String JLabel = String.valueOf(moneyTextField.getText().valueOf(resultLabel.getText()));
					moneyTextField.setText("");resultLabel.setText("");
					}
				});
				
				submitButton.setFont(new Font("Arial",Font.BOLD,15));
				submitButton2.setFont(new Font("Arial",Font.BOLD,15));
			

					
				submitButton.addActionListener(new ActionListener(){
				@Override
				
				public void actionPerformed(ActionEvent e) {
					
					int money = Integer.parseInt(moneyTextField.getText());
					
					if(money >= 100 && money <= 200){
						
						resultLabel.setText("Can buy Barbie DreamHorse");
						
					}else if(money >= 50 && money < 100){
						
						resultLabel.setText("Can buy LeGo");
						
					}else  {
						resultLabel.setText("Need to continue to save money");
					}
					
					
				}
				});
				frame.getContentPane().setLayout(null);
				frame.getContentPane().add(moneyLabel);
				frame.getContentPane().add(resultLabel);
				frame.getContentPane().add(moneyTextField);
				frame.getContentPane().add(submitButton);
				frame.getContentPane().add(submitButton2);
				
				JLabel label = new JLabel("");
				label.setBounds(448, 55, 224, 55);
				frame.getContentPane().add(label);
				
				frame.setSize(648,299);
				
				frame.setVisible(true);
				}
			
			
	

	
	
	}

