public class RepresentingTriangle {
    public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
		
		Point point1 = new Point(2, 1);
		Point point2 = new Point(4, 4);
		Point point3 = new Point(9, 1);
		Triangle triangle3 = new Triangle(point1, point2, point3);		
		
		System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
		System.out.println("Area of triangle1 is "+triangle1.calculateArea());
		
		System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
		System.out.println("Area of triangle2 is "+triangle2.calculateArea());
		
		System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
		System.out.println("Area of triangle3 is "+triangle3.calculateArea());
		
		//Create more objects of Triangle class for testing your code      

	}
}

class Point{
    //Reuse the code of Method Overloading - Exercise 1
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance() {
        double distance = Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate);
        return Math.round(distance * 100.0) / 100.0;
    }

    public double calculateDistance(Point point) {
        double xDiff = this.xCoordinate - point.xCoordinate;
        double yDiff = this.yCoordinate - point.yCoordinate;
        double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return Math.round(distance * 100.0) / 100.0;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }
    
}

class Triangle {
    //Implement your code here
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        this.point1 = new Point(0, 0);
        this.point2 = new Point(1, 1);
        this.point3 = new Point(2, 5);
    }

    public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate) {
        this.point1 = new Point(point1XCoordinate, point1YCoordinate);
        this.point2 = new Point(point2XCoordinate, point2YCoordinate);
        this.point3 = new Point(point3XCoordinate, point3YCoordinate);
    }
    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public double calculatePerimeter() {
        double side1 = this.point1.calculateDistance(point2);
        double side2 = this.point2.calculateDistance(point3);
        double side3 = this.point3.calculateDistance(point1);
        return Math.round((side1 + side2 + side3) * 100.0) / 100.0;
    }


    public double calculateArea() {
        double side1 = this.point1.calculateDistance(point2);
        double side2 = this.point2.calculateDistance(point3);
        double side3 = this.point3.calculateDistance(point1);
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)) * 100.0) / 100.0;
    }

    public Point getPoint1() {
        return point1;
    }
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }
    public Point getPoint2() {
        return point2;
    }
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    public Point getPoint3() {
        return point3;
    }
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Triangle\npoint1: "+this.point1.toString()+"\npoint2: "+this.point2.toString()+"\npoint3: "+this.point3.toString();
    }

}      

    
