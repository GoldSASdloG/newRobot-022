package homeWorkComp.memory;

public class Memory {
    private MemoryType type;
    private double weight;

    public Memory(MemoryType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public MemoryType getType() {
        return type;
    }

    public void setType(MemoryType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "type=" + type +
                ", weight=" + weight +
                '}';
    }
}
