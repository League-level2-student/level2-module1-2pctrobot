package _01_array_list_visualizer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

import _01_array_list_visualizer.data.ArrayList;

public class VisualArrayLists implements ActionListener {
	Timer timer;
	JFrame frame = new JFrame();
	
	ArrayList<String> list = new ArrayList<String>();

	public void addThingsToList() {
		// 1. Add a bunch of items to our list (4 or 5 should be enough!)
		list.add("V1");
		list.add("V2");
		list.add("Minos");
		list.add("Sisyphus");
		list.add("Gabriel");
		// 2. Set one item in our list to be something different
		list.add("Jakito");
		// 3. Remove something from our list
		Random ran = new Random();
		int number1 = ran.nextInt(list.size());
		list.remove(number1);
		// 4. Print the size of our list
		for(int i = 0; i < list.size(); i++){
			String s = list.get(i);
			System.out.println(s);
		}
		// 5. Check if our list contains a specific thing of your choice
		//	  and print whether it is in the list or not.
		if(list.contains("Jakito")) {
			System.out.println("Ja");
		} else {
			System.out.println("Nein");
		}
		// 6. Get a specific item from our list and print it out
		System.out.println(list.get(3));
		// 7. Clear our list of all items
		list.clear();
		// 8. Print the size of our list again
		for(int i = 0; i < list.size(); i++){
			String s = list.get(i);
			System.out.println(s);
		}
	}
	
	
	/*
	 * ------------DONT CHANGE ANYTHING BELOW THIS LINE-----------------------------------------
	 */
	public static void main(String[] args) {
		VisualArrayLists vcc = new VisualArrayLists();
		vcc.setup();
	}

	void setup() {
		timer = new Timer(1000 / 60, this);
		timer.start();
		frame.setVisible(true);
		frame.setTitle("LEAGUE ArrayList Visualizer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(list.displayPanel);
		frame.pack();
		addThingsToList();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		list.draw();
	}
}
