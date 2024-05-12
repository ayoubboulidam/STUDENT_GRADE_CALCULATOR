import java.util.ArrayList;

// Model
class SubjectModel {
    private ArrayList<String> subjects = new ArrayList<>();
    private ArrayList<Integer> marks = new ArrayList<>();

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public int calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }
}
