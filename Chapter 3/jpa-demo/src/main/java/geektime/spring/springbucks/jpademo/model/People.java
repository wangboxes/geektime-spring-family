package geektime.spring.springbucks.jpademo.model;

import lombok.Builder;
import lombok.ToString;
//编译后的代码在test包中
@Builder
@ToString
public class People {

    private String name;
    private String sex;
    private int age;
}
