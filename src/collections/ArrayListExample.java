package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Rohan");
		arrayList.add("Reena");
		arrayList.add("Rahul");

		System.out.println("The size of arraylist is " + arrayList.size());

		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}

		System.out.println("The first element of arraylist is " + arrayList.get(0));

		arrayList.remove(0);

		System.out.println("The size of arraylist after removing first element is " + arrayList.size());

		// for loop
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}

		// for loop
		System.out.println("Second type of for loop");
		for (String name : arrayList) {
			System.out.println(name);
		}

		// Iterator
		System.out.println("Using Iterator");

		Iterator it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// set method for replace element
		arrayList.set(0, "Maggie");
		arrayList.set(1, "Amelia");
		// cannot use set method for adding element
		// arrayList.set(2, "Maggie");
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}

		// sort on acending order
		System.out.println("Sorting.........");
		Collections.sort(arrayList);
		for (int index = 0; index < arrayList.size(); index++) {
			System.out.println(arrayList.get(index));
		}

	}

}
