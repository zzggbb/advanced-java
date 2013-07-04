import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Skype extends JFrame implements ActionListener{

	ChatClient client;
	JTextArea pane;
	JTextField field;
	private JScrollPane scroll;

	public static void main(String[] args) {
		new Skype();
	}

	public Skype() {
		super("Skype Istant Messenger");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(new Dimension(400,600));
		setLayout(new BorderLayout());
		client = new ChatClient();     

		initialize();

		Timer t = new Timer();
		t.schedule(new UpdateTask(), 0, 100);

		setVisible(true);
	}

	private void initialize() {
		pane = new JTextArea(30,30);
		scroll = new JScrollPane(pane);
		add(scroll, BorderLayout.CENTER);

		field = new JTextField(20);
		field.addActionListener(this);
		add(field, BorderLayout.SOUTH);
	}

	public void update() {
		String contents = pane.getText();
		pane.setText(contents + client.getUpdate());
		JScrollBar scrollbar = scroll.getVerticalScrollBar();
		scrollbar.setValue(scrollbar.getMaximum());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == field) {
			String message = field.getText();
			if (message != "") {
				client.submit(message);
				field.setText("");
			}
		}

	}

	class UpdateTask extends TimerTask {
		public void run() {
			update();
		}
	}
}