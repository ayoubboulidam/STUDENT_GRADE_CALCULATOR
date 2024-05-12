import java.util.ArrayList;

// View
class SubjectView {
    public void displaySubjects(ArrayList<String> subjects) {
        System.out.println("Subjects:");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }

    public void displayMarks(ArrayList<String> subjects, ArrayList<Integer> marks) {
        System.out.println("Marks:");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i) + ": " + marks.get(i));
        }
    }

    public void displayAverage(int average) {
        System.out.println("Average percentage is: " + average);
    }
}