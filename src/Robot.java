public class Robot {
    private int x;
    private int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x = print(this.x, x, "X");
        this.y = print(this.y, y, "Y");
    }
    private int print(int start, int end, String axisName){
        while (start < end) {
            System.out.println("робот двигается по оси " + axisName + " от " + start + " до " + (++start));
        } return start;
    }
}
