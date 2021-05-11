public class mianji {
    public interface Shape {
        public double area();
    }
    class Square implements Shape {
        double a;
        public Square(double a) {
            this.a=a;
        }
        public double area() {
            return a*a;
        }
    }
    class Rectangle implements Shape {
        double a;
        double b;
        public Rectangle(double a,double b) {
            this.a=a;
            this.b=b;
        }
        public double area() {
            return a*b;
        }
    }
    class Circle implements Shape {
        double radius;
        public Circle(double radiys) {
            this.radius=radius;
        }
        public double area() {
            return Math.PI*radius*radius;
        }
    }
}
