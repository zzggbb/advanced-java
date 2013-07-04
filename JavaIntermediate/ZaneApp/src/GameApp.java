import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



@SuppressWarnings("serial")
public class GameApp extends JFrame implements ActionListener {
	
	GameAppModel model;
	
	public GameApp() {
		super("Game App");
		init();
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void initializeComponents() {
		createButton1();
		createButton2();
		createTextField1();
	}
	public void init() {
		model = new GameAppModel();
		this.setLayout(new FlowLayout());
		this.setSize(getSize());
		initializeComponents();
	}
	public void createButton1() {
		JButton button = new JButton("Button 1");
		button.setActionCommand("What is this");
		button.addActionListener(this);
		add(button);
	}
	public void createButton2() {
		JButton button = new JButton("Button 2");
		button.setActionCommand("What");
		button.addActionListener(this);
		add(button);
	}
	public void createTextField1() {
		JCheckBox box1 = new JCheckBox();
		add(box1);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}