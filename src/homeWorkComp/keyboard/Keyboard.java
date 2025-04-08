package homeWorkComp.keyboard;

public class Keyboard {
    private Illuminate illuminate;
    private BattonCount battonCount;
    private String name;
    private double weight;

    public Keyboard(Illuminate illuminate, BattonCount battonCount, String name, double weight) {
        this.illuminate = illuminate;
        this.battonCount = battonCount;
        this.name = name;
        this.weight = weight;
    }

    public Illuminate getIlluminate() {
        return illuminate;
    }

    public void setIlluminate(Illuminate illuminate) {
        this.illuminate = illuminate;
    }

    public BattonCount getBattonCount() {
        return battonCount;
    }

    public void setBattonCount(BattonCount battonCount) {
        this.battonCount = battonCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "illuminate=" + illuminate +
                ", battonCount=" + battonCount +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
