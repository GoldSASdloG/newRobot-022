package homeWork;

public class Human {
    private int age;
    private String name;
    private String gender;

    public Human(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void print(){
        System.out.println("Поступил новый человек по Имени - " + name + ", Возраст - " + age + " лет, Пол - " + gender);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
