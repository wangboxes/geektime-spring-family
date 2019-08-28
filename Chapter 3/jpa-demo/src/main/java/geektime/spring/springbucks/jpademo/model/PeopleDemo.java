package geektime.spring.springbucks.jpademo.model;

/**
 * @describe：
 * @Date：2019/8/28 12:39
 * @author：wbx
 */
public class PeopleDemo {

    public static void main(String[] args) {
        People people = People.builder().name("张三").age(18).sex("男").build();
        System.out.println("people = " + people);

    }
}
