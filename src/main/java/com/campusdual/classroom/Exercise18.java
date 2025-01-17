package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int length;
		int[] array;
		showInlineArray(createAndInitializeArray(Utils.integer("Escriba el tamaño del array: ")));
	}

	public static int[] createAndInitializeArray(int length) {
		if (length < 0) {
			System.out.println("El tamaño del array no puede ser negativo. Se creará un array vacío.");
			return new int[0];
		}
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
