public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000, 2020, "NI12345");
        Employee e2 = new Employee("Alice", 50000, 2020, "NI12345");
        Employee e3 = new Employee("Bob", 60000, 2018, "NI67890");

        e1.print();

        System.out.println("e1 equals e2? " + e1.equals(e2)); // true
        System.out.println("e1 equals e3? " + e1.equals(e3)); // false
        System.out.println("e1 name: " + e1.getName());
    }
}
