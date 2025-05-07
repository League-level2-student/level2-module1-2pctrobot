package _02_array_list_guestbook;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	static // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	ArrayList<String> names;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		names = new ArrayList<String>();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Add Name");
		button2.setText("View Name");
		frame.setSize(100, 100);
		button1.addActionListener(null);
		button2.addActionListener(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		// TODO Auto-generated method stub
		if(buttonClicked.getText().equals("Add Name")) {
			String addition = JOptionPane.showInputDialog("Give me a name");
			names.add(addition);
		}
	}
}

