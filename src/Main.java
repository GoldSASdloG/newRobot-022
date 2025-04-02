import homeWork.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Robot robot= new Robot(5,5);

        System.out.println("Первое перемещение");
        robot.move(0, 8);

        System.out.println("Второе перемещение");
        robot.move(7, 11);

        Human vasy = new Human(34, "Vasy", "man");
        vasy.print();
    }
}