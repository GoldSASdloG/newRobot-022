package carEnumLesson;

public class Wheels {
    private double radius;
    private int count;

    public Wheels(double radius, int count) {
        this.radius = radius;
        this.count = count;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "radius=" + radius +
                ", count=" + count +
                '}';
    }
}
