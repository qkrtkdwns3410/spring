package spring.di.ui;

import spring.di.entity.NewlecExam;

public class GridExamConsole implements ExamConsole {
    private Exam exam;
    
    public GridExamConsole() {
    }
    
    @Override
    public void print() {
        System.out.println("--------------------------------------------");
        System.out.printf("[        total is %3d          ][           avg is %3.2f         ]\n", exam.total(), exam.avg());
        System.out.println("--------------------------------------------");
    }
    
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
    
    public GridExamConsole(Exam exam) {
        this.exam = exam;
    }
}
