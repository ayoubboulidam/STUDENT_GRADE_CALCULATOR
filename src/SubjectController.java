// Controller
class SubjectController {
    private SubjectModel model;
    private SubjectView view;

    public SubjectController(SubjectModel model, SubjectView view) {
        this.model = model;
        this.view = view;
    }

    public void addSubject(String subject) {
        model.addSubject(subject);
    }

    public void addMark(int mark) {
        model.addMark(mark);
    }

    public void displaySubjects() {
        view.displaySubjects(model.getSubjects());
    }

    public void displayMarks() {
        view.displayMarks(model.getSubjects(), model.getMarks());
    }

    public void displayAverage() {
        view.displayAverage(model.calculateAverage());
    }
}