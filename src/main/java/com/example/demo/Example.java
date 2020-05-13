package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class Example {

	public static void main(String[] args) {

		// System.out.println(TransactionStatus.AML_BLOCKED.getTxGroup());
		/*
		 * String a = "[Account / Credit]"; System.out.println(a.replaceAll("[/ ]",
		 * "_")); System.out.println(EnumUtils.isValidEnum(TransactionStatus.class,
		 * "PY"));
		 * 
		 */
		// Create the first list
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(1);
		lista.add(3);

		// Create the second list
		List<Integer> listb = new ArrayList<Integer>();
		listb.add(2);
		listb.add(1);
		listb.add(2);

		// BiConsumer to compare both lists
		BiConsumer<List<Integer>, List<Integer>> equals = extracted();
		equals.accept(lista, listb);
	}

	private static BiConsumer<List<Integer>, List<Integer>> extracted() {
		BiConsumer<List<Integer>, List<Integer>> equals = (list1, list2) -> {
			if (list1.size() != list2.size()) {
				System.out.println("False");
			} else {
				for (int i = 0; i < list1.size(); i++)
					if (list1.get(i) != list2.get(i)) {
						System.out.println("False");
						return;
					}
				System.out.println("True");
			}
		};
		return equals;
	}

}
