# Student-Management-System-
This is a terminal-based student record management tool built using Object-Oriented Programming (OOP) principles. It provides basic functionality to add, view, and delete student records based on class and roll number. The system uses C++ Vector to manage data dynamically, allowing flexible and efficient storage of student entries.

* Working ->
1. Class Definitions
Student Class:
-> Fields: Stores student details like name, class, roll number, parent's names, address, and contact number.
-> input() method: Takes input from the user via the terminal.
-> output() method: Displays all stored student information in a formatted way.

StudentManagementSystem Class:
-> Contains the main() method to run the application.
-> Uses a Vector<Student> to dynamically store multiple student records.

2. Program Flow in main()
➤ Step 1: Menu Display
Repeatedly shows a menu with 4 options:
-> Add Student
-> Get Student Details
-> Delete Student Details
-> Exit

➤ Step 2: User Input
Takes user's choice and performs actions using a switch statement.

3. Functional Breakdown
Option 1: Add Student
-> Creates a new Student object.
-> Calls the input() method to fill in details.
-> Adds the object to the Vector.

Option 2: Get Student Details
-> Prompts for class and roll number.
-> Searches the Vector for a matching record.
-> If found, calls output() to display the details.
-> If not, displays "Student not found".

Option 3: Delete Student Details
-> Prompts for class and roll number.
-> Searches and removes the matching student from the Vector.
-> If deleted, confirms deletion.
-> If not found, shows "Student not found".

Option 4: Exit
-> Closes the scanner and terminates the program.

4. Key Features Used
-> Object-Oriented Design: Encapsulation through the Student class.
-> Dynamic Data Management: Vector used to store and manage student records.

