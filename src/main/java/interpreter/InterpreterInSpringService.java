package interpreter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class InterpreterInSpringService implements ApplicationRunner {

    @Value("#{SpEL}")
    private String value;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(value);
    }
}
