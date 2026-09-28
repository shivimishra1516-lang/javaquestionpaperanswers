import java.util.HashSet;

class Main {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> students = new HashSet<>();

        // Add students
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");
        students.add("Shivi");

        // Duplicate will not be added
        students.add("Rahul");

        // Display total number
        System.out.println("Total Students: " + students.size());

        // Remove one student
        students.remove("Aman");

        // Display all students
        System.out.println("Registered Students:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}