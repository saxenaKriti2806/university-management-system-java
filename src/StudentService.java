import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private int idCounter = 1;

    public void addStudent(String name, String email, String course) {
        students.add(new Student(idCounter++, name, email, course));
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(
                s.getId() + " | " + s.getName() + " | " +
                s.getEmail() + " | " + s.getCourse()
            );
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student deleted if ID existed.");
        public void updateStudent(int id, String name, String email, String course) {
    for (Student s : students) {
        if (s.getId() == id) {
            s.setName(name);
            s.setEmail(email);
            s.setCourse(course);
            System.out.println("Student updated successfully!");
            return;
        }
    }
    System.out.println("Student not found.");
}

    }
}
