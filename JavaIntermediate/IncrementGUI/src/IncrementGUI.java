import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class IncrementGUI 
	extends JFrame
	implements ActionListener
	{
	
	IncrementGUI model;
	int current_value = 50;
	
	public IncrementGUI() {
		super("Increment Game");
		initializeFrame();
		initializeComponents();
		
	}
	public void initializeFrame() {
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void initializeComponents() {
		createIncreaseButton();
		createDecreaseButton();
		createCurrentNumberField();
	}
	
	private void createIncreaseButton() {
		JButton button = new JButton("Increase the current value by 1");
		button.setActionCommand("increasevalue");
		
	}
	private void createDecreaseButton() {
		JButton button = new JButton("Decrease the current value by 1");
		button.setActionCommand("decreasevalue");
		
	}
	private void createCurrentNumberField() {
		JTextArea area = new JTextArea(1,1);

	}
	@Override
	public void actionPerformed(ActionEvent a) {
		if (a.getSource() == area) {
			
		} else {
			String action = a.getActionCommand();
			if (action.equals("increasevalue")) {
				current_value = current_value + 1;
			}
			if (action.equals("decreasevalue")) {
				current_value = current_value - 1;
			}
		}
	
	}
}
