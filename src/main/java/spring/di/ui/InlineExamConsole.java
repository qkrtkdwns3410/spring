package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("console")
public class InlineExamConsole implements ExamConsole {
    @Autowired(required = false)
    @Qualifier("exam1")
    private Exam exam;
    
    public InlineExamConsole(Exam exam) {
        System.out.println("overloaded constructor");
        this.exam = exam;
    }
    
    public InlineExamConsole() {
        System.out.println("constructor");
    } //기본 생성자
    
    
    @Override
    public void print() {
        if (exam == null) {
            System.out.printf("total: %d and avg: %f", 0, 0.0);
        } else {
            System.out.printf("total: %d and avg: %f", exam.total(), exam.avg());
        }
    }
    
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
