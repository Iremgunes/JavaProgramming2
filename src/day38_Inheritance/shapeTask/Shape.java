package day38_Inheritance.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    public  double area(){

        return 0;

    }

    public double perimeter(){

        return 0;
    }
}
