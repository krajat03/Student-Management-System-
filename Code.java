import java.util.Scanner;
import java.util.Vector;

class Student {
    String name;
    int studentClass;
    int roll;
    String fatherName;
    String motherName;
    String address;
    long contactNumber;
    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.print("-> Enter Name of Student: ");
        name = scanner.nextLine();

        System.out.print("-> Enter Class: ");
        studentClass = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("-> Enter Roll Number: ");
        roll = scanner.nextInt();
        scanner.nextLine();

        System.out.print("-> Enter Father's Name: ");
        fatherName = scanner.nextLine();

        System.out.print("-> Enter Mother's Name: ");
        motherName = scanner.nextLine();

        System.out.print("-> Enter Address: ");
        address = scanner.nextLine();

        System.out.print("-> Enter Contact Number: ");
        contactNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline
    }

    public void output() {
        System.out.println("\n************ Details of Student ************");
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Roll Number: " + roll);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("********************************************\n");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Student> s = new Vector<>();

        while (true) {
            System.out.print(
                "1) Add Student\n2) Get Student Details\n3) Delete Student Details\n4) Exit\n-> Enter an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    Student student = new Student();
                    student.input();
                    s.add(student);
                    System.out.println("Student added successfully!\n");
                    break;

                case 2:
                    if (s.isEmpty()) {
                        System.out.println("### No Students to display\n");
                    } else {
                        System.out.print("-> Enter Class: ");
                        int searchClass = scanner.nextInt();
                        System.out.print("-> Enter Roll Number: ");
                        int searchRoll = scanner.nextInt();

                        boolean found = false;
                        for (Student std : s) {
                            if (std.studentClass == searchClass && std.roll == searchRoll) {
                                std.output();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("### Student not found\n");
                        }
                    }
                    break;

                case 3:
                    if (s.isEmpty()) {
                        System.out.println("### No Students available\n");
                    } else {
                        System.out.print("-> Enter Class: ");
                        int searchClass = scanner.nextInt();
                        System.out.print("-> Enter Roll Number: ");
                        int searchRoll = scanner.nextInt();

                        boolean deleted = false;
                        for (int i = 0; i < s.size(); i++) {
                            Student std = s.get(i);
                            if (std.studentClass == searchClass && std.roll == searchRoll) {
                                s.remove(i);
                                System.out.println("Deleted successfully!\n");
                                deleted = true;
                                break;
                            }
                        }
                        if (!deleted) {
                            System.out.println("### Student not found\n");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("### Invalid input, try again.\n");
            }
        }
    }
}

