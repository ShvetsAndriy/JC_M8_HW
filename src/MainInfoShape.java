import shapesclasses.*;

class MainInfoShape {
    public static void main(String[] args) {
        new GetNameOfShape().printName(new Line());
        new GetNameOfShape().printName(new Square());
        new GetNameOfShape().printName(new Circle());
        new GetNameOfShape().printName(new Trapezoid());
        new GetNameOfShape().printName(new Triangle());
    }
}

class GetNameOfShape {
    public void printName (Shape shape) {
        System.out.println(shape.getNameOfShape());
    }
}