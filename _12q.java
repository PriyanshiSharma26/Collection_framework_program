//How would you sort an ArrayList of custom objects, like a Student class, based on their marks?



import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Overriding toString() method to display student information
    @Override
    public String toString() {
        //return "Student{name='" + name + "', marks=" + marks + "}";
        return "name" +name +" "+"marks:"+marks;
    }

    // Implementing the compareTo method to sort based on marks
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;  // Sort by marks in ascending order
    }
}

 
 class sortStudents {
    public static void main(String[] args) {
        // Creating an ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));

        // Sorting the list using Comparable
        Collections.sort(students);  // Since Student implements Comparable

        // Printing the sorted list
        System.out.println("Sorted Students (by marks): " + students);
    }
}
