package geektime.spring.springbucks.jpademo.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class People {

    private String name;
    private String sex;
    private int age;
}
