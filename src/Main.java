import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1. Add Student");
System.out.println("2. View Students");
System.out.println("3. Update Student");
System.out.println("4. Delete Student");
System.out.println("5. Exit");
System.out.print("Choose: ");


            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
    case 1:
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        service.addStudent(name, email, course);
        break;

    case 2:
        service.viewStudents();
        break;

    case 3:
        System.out.print("Enter Student ID to update: ");
        int uid = sc.nextInt();
        sc.nextLine();

        System.out.print("New Name: ");
        String newName = sc.nextLine();
        System.out.print("New Email: ");
        String newEmail = sc.nextLine();
        System.out.print("New Course: ");
        String newCourse = sc.nextLine();

        service.updateStudent(uid, newName, newEmail, newCourse);
        break;

    case 4:
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        service.deleteStudent(id);
        break;

    case 5:
        System.out.println("Exiting...");
        sc.close();
        return;

    default:
        System.out.println("Invalid choice");
}

        }
    }
}
