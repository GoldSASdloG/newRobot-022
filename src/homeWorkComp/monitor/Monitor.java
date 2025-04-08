package homeWorkComp.monitor;

public class Monitor {
    private MonitorTupe monitorTupe;
    private Chastota chastota;
    private double weight;

    public Monitor(MonitorTupe monitorTupe, Chastota chastota, double weight) {
        this.monitorTupe = monitorTupe;
        this.chastota = chastota;
        this.weight = weight;
    }

    public MonitorTupe getMonitorTupe() {
        return monitorTupe;
    }

    public void setMonitorTupe(MonitorTupe monitorTupe) {
        this.monitorTupe = monitorTupe;
    }

    public Chastota getChastota() {
        return chastota;
    }

    public void setChastota(Chastota chastota) {
        this.chastota = chastota;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "monitorTupe=" + monitorTupe +
                ", chastota=" + chastota +
                ", weight=" + weight +
                '}';
    }
}
