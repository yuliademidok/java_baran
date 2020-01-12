package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");

		double l = 10;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
	}

	public static void hello (String somebody){
		System.out.println("Hello " + somebody + "!");
	}

	public static double area (double l) {
		return  l * l;
	}
}
