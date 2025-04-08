package homeWorkComp;

import homeWorkComp.hard.HardDisk;
import homeWorkComp.keyboard.Keyboard;
import homeWorkComp.memory.Memory;
import homeWorkComp.monitor.Monitor;
import homeWorkComp.processor.Processor;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDisk hardDisk;
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer(Processor processor,
                    Memory memory,
                    HardDisk hardDisk,
                    Monitor monitor,
                    Keyboard keyboard) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", hardDisk=" + hardDisk +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                '}';
    }
    public double ollWeight(){
        return hardDisk.getWeight() +
                keyboard.getWeight() +
                memory.getWeight() +
                monitor.getWeight() +
                processor.getWeight();
    }
}
