package cv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ascoltaSend implements ActionListener{
	private JTextField t;
	private String lettera;
	private JFrame f;
	private JButton b;
	
	public ascoltaSend(JTextField t, String lettera, JFrame f, JButton b) {
		this.t = t;
		this.lettera = lettera;
		this.f = f;
		this.b = b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(t.getText().equalsIgnoreCase(lettera)) {
			b.setText(lettera);
			b.setEnabled(false);
			
			int id = WindowEvent.WINDOW_CLOSING;
	        WindowEvent close = new WindowEvent(f, id);
	        f.dispatchEvent(close);
		}
		
	}

}
