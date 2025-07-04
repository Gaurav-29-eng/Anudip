package Lab 1 Assignments;

public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();
        // emp.age = 35.5; // ❌ Compile-time error: possible lossy conversion
        emp.age = (int) 35.5; // ✅ Fixed by casting
        System.out.println("Successfully started");
    }
}

