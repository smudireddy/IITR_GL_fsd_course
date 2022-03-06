package com.iitr.fsd.week2.collections.arraylist.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class ArrayListTraversal {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add(0, "Purple");
		
		ArrayListTraversal.printList(colors);
		
		colors.set(1, "Pink");
		
		ArrayListTraversal.printList(colors);
		
		colors.remove("Green");
		ArrayListTraversal.printList(colors);
		
		Predicate<String> pr = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.startsWith("Pi");
			}
		};
		
		colors.removeIf(pr);
		ArrayListTraversal.printList(colors);
		
		colors.clear();
		ArrayListTraversal.printList(colors);
		
		String names[] = new String[] {"Suresh", "Ramesh"};
		ArrayList<String> items = new ArrayList<String>(Arrays.asList(names));
		
		colors.addAll(items);
		ArrayListTraversal.printList(colors);
		
		
		
	}
	
	public static void printList(List<String> list) {
		
//		Using for loop
		System.out.println("\n ---------------------\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("---> " + list.get(i));
		}
		
		System.out.println("\n ---------------------\n");
//		using for-each
		for(String element:list ) {
			System.out.println("---> " + element);
		}
		
		System.out.println("\n ---------------------\n");
//		Using Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("----> " + it.next());
		}
		
		System.out.println("\n ---------------------\n");
//		Using List Iterator
		
		ListIterator<String> listIt = list.listIterator(list.size());
		while(listIt.hasPrevious()) {
			System.out.println("----> " + listIt.previous());
		}
		
		System.out.println("\n ---------------------\n");
//		Using iterator foreach()
		Iterator<String> it1 = list.iterator();
		it1.forEachRemaining(a->{
			System.out.println("----> " + a);
		});
		
		System.out.println("\n ---------------------\n");
//		Using for-each
		list.forEach(a->{
			System.out.println("----> " + a);
		});
	}

}
