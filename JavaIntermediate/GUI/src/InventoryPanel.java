import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class InventoryPanel extends JPanel {
	
	public InventoryPanel() {
		super();
		this.setSize(new Dimension(400,200));
		initialize();
		setLayout(new GridLayout());
		setVisible(true);
	}

	private void initialize() {
		Object[][] data = 
			{{"Bricks", new Double(9.99)},
			{"Dynamite", new Double(19.87)},
			{"Shovels", new Double(14.67)},
			{"Hydrochloric Acid - 2 Gallons", new Double(25.66)},
			{"Ski Mask", new Double(3.87)}};
		String[] columns = {"Item", "Price"};
		JTable itemTable = new JTable(data, columns);
		add(itemTable);
			
		
	}
}
	
	
