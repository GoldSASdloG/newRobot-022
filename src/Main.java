import carEnumLesson.Body;
import carEnumLesson.Car;
import carEnumLesson.Engine;
import carEnumLesson.Wheels;
import homeWork.Human;
import homeWorkComp.Computer;
import homeWorkComp.hard.HardDisk;
import homeWorkComp.hard.TypeHard;
import homeWorkComp.keyboard.BattonCount;
import homeWorkComp.keyboard.Illuminate;
import homeWorkComp.keyboard.Keyboard;
import homeWorkComp.memory.Memory;
import homeWorkComp.memory.MemoryType;
import homeWorkComp.monitor.Chastota;
import homeWorkComp.monitor.Monitor;
import homeWorkComp.monitor.MonitorTupe;
import homeWorkComp.processor.CoreCount;
import homeWorkComp.processor.Creator;
import homeWorkComp.processor.Frequency;
import homeWorkComp.processor.Processor;

public class Main {
    public static void main(String[] args) {
        Wheels wheels = new Wheels(17.0 , 4);
        Body body = new Body("Cabriolet");

        Car car = new Car(new Engine("Volvo", 4.5), body, wheels);

        System.out.println("обьем двигателя - " + car.getEngine().getVolume() + " litra");
        System.out.println(car);


        HardDisk disk = new HardDisk(TypeHard.RRG, 600, 200);
        Keyboard keyboard = new Keyboard(Illuminate.YES, BattonCount.BATTON_COUNT_77, "locatering", 400 );
        Memory memory = new Memory(MemoryType.DDR, 400);
        Monitor monitor = new Monitor(MonitorTupe.LASER, Chastota.TWO_HUNDRED, 1000);
        Processor processor = new Processor(Frequency.TWO_THOUSAND_FIVE_HUNDRED, CoreCount.FOUR, Creator.INTEL, 200);

        Computer computer = new Computer(processor, memory, disk, monitor, keyboard);
        System.out.println(computer.ollWeight());
        computer.toString();

    }
}