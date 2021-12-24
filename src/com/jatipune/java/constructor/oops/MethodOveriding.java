package com.jatipune.java.constructor.oops;

public class MethodOveriding {

	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.area();
		Shapes myTringle=new Tringle();
		myTringle.area();
		Shapes myRectangle=new Rectangal();
		 myRectangle.area();
		Shapes myCircle=new Circle();
		myCircle.area();
		
	}
		

	}


class Shapes{
	public void area() {
		System.out.println("Area of the shapes");
	  }
}
	class Tringle extends Shapes{
		public void area() {
			System.out.println("Tringle is 1/2*base*height");
		}
	}
	class Rectangal extends Shapes{
	public void area() {
				System.out.println("Rectangal is base*height");
		}
	}
	class Circle extends Shapes{
		public void area() {
					System.out.println("Circle is 3.14*radius*radius");
			}
	}

	