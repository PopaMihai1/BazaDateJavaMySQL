public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String hireDate;

    // Constructor
    public Person(int id, String firstName, String lastName, double salary, String hireDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Metoda de afișare a datelor persoanei
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nume: " + lastName + " " + firstName);
        System.out.println("Salariu: " + salary);
        System.out.println("Data angajare: " + hireDate);
        System.out.println("------------------------");
    }
}
