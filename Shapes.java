
class Figure {
enum Shape { RECTANGLE, CIRCLE, SQUARE };
final Shape shape;
public double sidelength1;
public double basewidth1;
public double perimeter1;
public double length;
public double width;
public double radius;

Figure(double radius) {
shape = Shape.CIRCLE;
this.radius = radius;
}
Figure(double length, double width) {
shape = Shape.RECTANGLE;
this.length = length;
this.width = width;
}

Figure(double sidelength1, double basewidth1, double perimeter1) {
shape = Shape.SQUARE;
this.length = sidelength1;
this.width = basewidth1;
this.perimeter1 = length+length+length+length;
}

double area() {
switch(shape) {
case SQUARE:
	return length * length;
case RECTANGLE:
	return length * width;
case CIRCLE:
	return Math.PI * (radius * radius);
default:
	throw new AssertionError();
}
}
}