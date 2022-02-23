package ru.stqa.pft.sandbox;


public class MyFirstProgram {


	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Sergey");

		Square s = new Square(5);
		System.out.println("Площадь квардрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(5, 10);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}




}
