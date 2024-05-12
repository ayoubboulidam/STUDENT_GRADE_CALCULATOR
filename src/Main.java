import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        // Initialize MVC components
        SubjectModel model = new SubjectModel();
        SubjectView view = new SubjectView();
        SubjectController controller = new SubjectController(model, view);

        // Add subjects
        controller.addSubject("Mathematics");
        controller.addSubject("English");
        controller.addSubject("Physics");
        controller.addSubject("Chemistry");
        controller.addSubject("Biology");
        controller.addSubject("History");
        controller.addSubject("Geography");
        controller.addSubject("Computer Science");
        controller.addSubject("Economics");
        controller.addSubject("Art");

        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter marks
        System.out.println("Enter Your marks for each Subject -- between 0 and 100");

        // Getting marks for each subject
        for (String subject : model.getSubjects()) {
            System.out.print("Mark for " + subject + " is: ");
            int mark = scanner.nextInt();
            scanner.nextLine();
            controller.addMark(mark);
        }

        // Displaying subjects, marks, and average
        controller.displaySubjects();
        controller.displayMarks();
        controller.displayAverage();

        // Closing scanner
        scanner.close();
    }
}