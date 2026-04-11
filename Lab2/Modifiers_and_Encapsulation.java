class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }
}

public class Modifiers_and_Encapsulation {
    public static void main(String[] args) {
        Student s = new Student("Alice", 10);
        System.out.println(s.getName() + ": " + s.getAge());
    }
}