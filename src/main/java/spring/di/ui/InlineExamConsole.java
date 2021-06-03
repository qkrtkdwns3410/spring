package spring.di.ui;

public class InlineExamConsole implements ExamConsole {
    private Exam exam;
    
    public InlineExamConsole() {
    }
    
    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }
    
    @Override
    public void print() {
        System.out.printf("total: %d and avg: %f", exam.total(),exam.avg());
    }
    
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    
    }
}
