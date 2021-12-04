package austin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("austin.mapper")
@SpringBootApplication
public class AustinApplication {

    public static void main(String[] args) {
        SpringApplication.run(AustinApplication.class, args);
    }
}
