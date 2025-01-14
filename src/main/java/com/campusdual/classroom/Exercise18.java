package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
		System.out.println("Introduce el tamaño del array:");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int size = scanner.nextInt();
		scanner.close();

		int[] array = createAndInitializeArray(size);

		showInlineArray(array);
	}

	public static int[] createAndInitializeArray(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("El tamaño del array debe ser mayor que cero.");
		}

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	public static void showInlineArray(int[] array) {
		// Recorrer y mostrar los elementos del array
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
