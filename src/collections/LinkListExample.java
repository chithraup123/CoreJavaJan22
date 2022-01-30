package collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		LinkedList<String> linkList = new LinkedList<String>();
		
		linkList.add("Michael");
		linkList.add("Smith");
		linkList.add("Joe");
		//add items in firt, last , inb/w
		linkList.addFirst("Sara");
		linkList.addFirst("Catherine");
		
		System.out.println(linkList);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int index=0; index<linkList.size(); index++) {
			System.out.println(linkList.get(index));
		}

	}

}
