package stackPractice;

public class Student {
    private String lastName;
    private String firstName;
    private int age;

    public Student(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayStudent() {
        System.out.print("Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLastName() {
        return lastName;
    }
}
