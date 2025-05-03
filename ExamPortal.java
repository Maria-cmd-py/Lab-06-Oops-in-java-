class StudentExam {
    private String studentName;
    private String examId;
    private int score;
    // Setters with validation
    public void setStudentName(String name) {
        if (!name.isEmpty()) {
            studentName = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }
    public void setExamId(String id) {
        if (!id.isEmpty()) {
            examId = id;
        } else {
            System.out.println("Error: Exam ID cannot be empty!");
        }
    }
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Error: Score must be 0-100!");
        }
    }
    // Display result
    public void displayResult() {
        System.out.println("\n--- Exam Result ---");
        System.out.println("Student: " + studentName);
        System.out.println("Exam ID: " + examId);
        System.out.println("Score: " + score);
        System.out.println("Result: " + (score >= 50 ? "PASS" : "FAIL"));
    }
}
public class ExamPortal {
    public static void main(String[] args) {
        StudentExam exam = new StudentExam();
        exam.setStudentName("Ali Ahmed");
        exam.setExamId("EXAM001");
        exam.setScore(85);
        exam.displayResult();
    }
}