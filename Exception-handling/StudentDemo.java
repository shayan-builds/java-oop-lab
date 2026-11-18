
class NotEligibleException extends Exception {
    NotEligibleException(String message) {
        super(message);
    }
}

class Student {
    String usn, name;
    int sem;

    Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    void calculatePercentage(double totalMarks, double maxMarks)
            throws NotEligibleException {

        double percentage = (totalMarks / maxMarks) * 100;

        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage < 40) {
            throw new NotEligibleException(
                "Student is not eligible"
            );
        }
        else if (percentage > 80) {
            System.out.println("Class: Distinction");
        }
        else if (percentage >= 60) {
            System.out.println("Class: First Class");
        }
        else {
            System.out.println("Class: Second Class");
        }
    }
}

public class StudentDemo {
    public static void main(String args[]) {

        Student s = new Student("1BM24CS001", "Rahul", 3);

        try {
            s.calculatePercentage(350, 500);
        }
        catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
