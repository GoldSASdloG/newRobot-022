package homeWorkComp.hard;

public class HardDisk {
    private TypeHard typeHard;
    private int volume;
    private double weight;

    public HardDisk(TypeHard typeHard, int volume, double weight) {
        this.typeHard = typeHard;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeHard getTypeHard() {
        return typeHard;
    }

    public void setTypeHard(TypeHard typeHard) {
        this.typeHard = typeHard;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "typeHard=" + typeHard +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
