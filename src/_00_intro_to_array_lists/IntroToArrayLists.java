package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("also");
		names.add("eggplant");
		names.add("gregarious");
		names.add("else");
		names.add("beetlejuice");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for (String curword : names) {
			System.out.println(curword);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < names.size(); i+=2){
				String s = names.get(i);
				System.out.println(s);
			
			
		}
		//6. Print all the Strings in reverse order.
		for (String curword : names.reversed()) {
			System.out.println(curword);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (String curword : names) {
			if(curword.contains("e")) {
				System.out.println(curword);
			}
			
		}
	}
}
