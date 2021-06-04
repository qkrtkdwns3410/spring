package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
    private Exam exam;
    
    public GridExamConsole() {
    }
    
    public GridExamConsole(Exam exam) {
        this.exam = exam;
    }
    
    @Override
    public void print() {
        System.out.println("--------------------------------------------");
        System.out.printf("[        total is %3d          ][           avg is %3.2f         ]\n", exam.total(), exam.avg());
        System.out.println("--------------------------------------------");
    }
    
    @Override
    @Autowired
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
