package cholog.bean;

import org.springframework.stereotype.Component;

/*
어떤 어노테이션을 붙였을 때 Bean으로 생성되는지 학습하기
 */
@Component    //@Service, @Repository, @Controller 어노테이션들도 내부에 @Component를 포함 함
public class SpringBean {
    public String hello() {
        return "Hello";
    }
}
