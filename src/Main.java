import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List to store subjects
        ArrayList<String> subjects = new ArrayList<>();
        // Adding subjects to the list
        addSubjects(subjects);

        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter marks
        System.out.println("Enter Your marks for each Subject -- between 0 and 100");

        // List to store marks
        ArrayList<Integer> marks = new ArrayList<>();
        // Getting marks for each subject
        getMarks(scanner, subjects, marks);

        // Displaying marks for each subject
        displayMarks(subjects, marks);

        // Calculating average
        int average = calculateAverage(marks);
        // Displaying average
        System.out.println("Average percentage is: " + average);

        // Closing scanner
        scanner.close();
    }

    // Method to add subjects to the list
    private static void addSubjects(ArrayList<String> subjects) {
        subjects.add("Mathematics");
        subjects.add("English");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("History");
        subjects.add("Geography");
        subjects.add("Computer Science");
        subjects.add("Economics");
        subjects.add("Art");
    }

    // Method to get marks for each subject
    private static void getMarks(Scanner scanner, ArrayList<String> subjects, ArrayList<Integer> marks) {
        for (String subject : subjects) {
            System.out.print("Mark for " + subject + " is: ");
            int mark = scanner.nextInt();
            scanner.nextLine();
            marks.add(mark);
        }
    }

    // Method to display marks for each subject
    private static void displayMarks(ArrayList<String> subjects, ArrayList<Integer> marks) {
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Your Mark for " + subjects.get(i) + " is " + marks.get(i));
        }
    }

    // Method to calculate average marks
    private static int calculateAverage(ArrayList<Integer> marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }
}
