package spring.di;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.di.entity.NewlecExam;
import spring.di.ui.Exam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
    @Bean
    public Exam exam() {
        return new NewlecExam();
    }
}