// Kelas yang memiliki tanggung jawab spesifik (Single Responsibility Principle)
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Kelas ini hanya menggunakan Rectangle tanpa bergantung pada banyak kelas lain (Low CBO)
class ShapePrinter {
    public void printShapeInfo(Rectangle rectangle) {
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}

// Main class untuk menjalankan program
public class main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        ShapePrinter printer = new ShapePrinter();
        printer.printShapeInfo(rect);
    }
}
