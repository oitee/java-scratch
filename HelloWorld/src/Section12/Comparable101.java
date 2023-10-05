package Section12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Comparable101 {
    public static void main(String args[]) {
        //Trying out `compareTo` on a primitive type
        Integer five = 5;
        Integer[] nums = {100, 10, 11, -10, 1, 0, 5};
        for (Integer n : nums) {
            int val = n.compareTo(five);
            String message;
            if (val == 0) {
                message = "equal to";
            } else if (val >= 1) {
                message = "greater than";
            } else {
                message = "less than";
            }
            System.out.println(n + " is " + message + " " + five);
        }

        // Trying out `compareTo` on a custom type
        System.out.println("Comparing students using compareTo");
        Student tim = new Student("Tim");
        Student[] students = new Student[]{(new Student("John")), (new Student("Eve")), (new Student("Xuan")), (new Student("Pea")), (new Student("Tim"))};
        for (Student s : students) {
            int val = s.compareTo(tim);
            String message;
            if (val == 0) {
                message = "equal to";
            } else if (val >= 1) {
                message = "greater than";
            } else {
                message = "less than";
            }
            System.out.println(s.toString() + " is " + message + " " + tim.toString());
        }
        System.out.println("Xuan".compareTo("Tim"));
        System.out.println("Comparing students by their GPA using Comparator.......");
        Comparator<Student> gpaComparator = new GPAComparator();

        for (Student s : students) {
            int val = gpaComparator.compare(s, tim);
            String message;
            if (val == 0) {
                message = "equal to";
            } else if (val >= 1) {
                message = "greater than";
            } else {
                message = "less than";
            }
            System.out.println(s.toString() + " is " + message + " " + tim.toString());
        }
        System.out.println("Now sorting students on the basis of gpa");
        Arrays.sort(students, gpaComparator);
        System.out.println(Arrays.toString(students));
        System.out.println("Now sorting them in descending order");
        Arrays.sort(students, gpaComparator.reversed());
        System.out.println(Arrays.toString(students));

    }
}

class GPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        Double gpa1 = (Double) s1.gpa;
        Double gpa2 = (Double) s2.gpa;
        return gpa1.compareTo(gpa2);
    }
}

class Student implements Comparable<Student> {
    String name;
    private static Random random = new Random();
    private static int LAST_ID = 1000;
    private int id;
    double gpa;

    public Student(String n) {
        id = LAST_ID++;
        gpa = random.nextDouble(1.00, 4.00);
        name = n;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    @Override
    public String toString() {
        return name + "(GPA: " + gpa + ", ID: " + id + ")";
    }

}