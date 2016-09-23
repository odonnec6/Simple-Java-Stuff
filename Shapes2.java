
abstract class Shape{
	
	double area;
	
	abstract double getArea();
	
}
class Circle extends Shape{
	
	double radius;
	
	Circle(){
		radius = 1.0;
	}
	
	Circle(double Newradius){
		radius = Newradius;
	}
	
	double getArea(){
		area = radius * radius * Math.PI;
		return area;
	}

	
}

class Square extends Shape{
	double length;
	double width;
	
	Square(){
		length = 1.0;
		width = 1.0;
	}
	
	Square(double NewLength){
		length = NewLength;
		width = NewLength;
	}
	
	double getArea(){
		area = length * width;
		return area;
	}
	
}

class Rectangle extends Shape {
	double length;
	double width;
	
	Rectangle(){
		length = 1.0;
		width = 1.0;
	}
	
	Rectangle(double NewLength, double NewWidth){
		length = NewLength;
		width = NewWidth;
	}
	
	double getArea(){
		area = length * width;
		return area;
	}
	
}


