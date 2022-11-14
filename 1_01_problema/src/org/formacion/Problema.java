package org.formacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problema {
	
	public static void main (String[] args) throws InterruptedException {
		Comparator<String> comparadorLongitud = (o1, o2) -> o1.length() - o2.length();
		long startTime = System.currentTimeMillis();
		List<String> nombres = Arrays.asList("Juan", "Antonia", "Pedro");
				//.stream().sorted(comparadorLongitud).collect(Collectors.toList());
		Collections.sort(nombres,comparadorLongitud);
/*
		List<String> nombres = Arrays.asList("Juan", "Antonia", "Pedro");

		Comparator<String> comparadorLongitud =
				(o1, o2) -> o1.length() - o2.length();
		Collections.sort(nombres,comparadorLongitud);
*/
		System.out.println(nombres);
		long endTime = System.currentTimeMillis();

		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in milliseconds: " + timeElapsed);
	}

}
