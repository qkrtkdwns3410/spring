package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.ui.ExamConsole;

public class program {
    public static void main(String[] args) {
        //스프링에게 지시하는 방법으로 코드를 변경할 예정입니다.
//        Exam exam = new NewlecExam();
////        ExamConsole console = new InlineExamConsole(exam); //DI입니다.
//        ExamConsole console = new GridExamConsole(exam);
//        console.setExam(exam);
    
        ApplicationContext context =
                new AnnotationConfigApplicationContext(NewlecDIConfig.class);
//                new ClassPathXmlApplicationContext("setting.xml");

//        Exam exam = context.getBean(Exam.class);
//        System.out.println(exam.toString());
//        ExamConsole console = (ExamConsole) context.getBean("console");
        ExamConsole console = context.getBean(ExamConsole.class);
        console.print();

//        List<Exam> exams = (List<Exam>) context.getBean("exams");
//        exams.add(new NewlecExam(1, 1, 1, 1));

//        for (Exam e : exams) {
//            System.out.println(e);
//        }
    }
}
