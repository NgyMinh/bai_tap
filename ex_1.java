package bai_tap;

public class ex_1 {
    private double radius;
    public String color;

    ex_1() {
        radius = 1.0;
        color = "red";
    }

    public ex_1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}