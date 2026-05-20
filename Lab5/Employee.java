public class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String niNumber;

    public Employee() {
        super();
        annualSalary = 0.0;
        startYear = 0;
        niNumber = "Not set.";
    }

    public Employee(String name, double salary, int year, String ni) {
        super(name);
        annualSalary = salary;
        startYear = year;
        niNumber = ni;
    }

    public double getAnnualSalary() { return annualSalary; }
    public int getStartYear() { return startYear; }
    public String getNiNumber() { return niNumber; }

    public void setAnnualSalary(double s) { annualSalary = s; }
    public void setStartYear(int y) { startYear = y; }
    public void setNiNumber(String ni) { niNumber = ni; }

    @Override
    public void print() {
        super.print();
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Start Year: " + startYear);
        System.out.println("NI Number: " + niNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            return this.getName().equals(e.getName())
                && this.annualSalary == e.annualSalary
                && this.startYear == e.startYear
                && this.niNumber.equals(e.niNumber);
        }
        return false;
    }
}
