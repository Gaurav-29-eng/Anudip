public class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Student student = new Student("Anjali", 20, "Computer Science");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
    }
}
