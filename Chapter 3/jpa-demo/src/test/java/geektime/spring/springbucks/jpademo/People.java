package geektime.spring.springbucks.jpademo;


public class People {

    private String name;
    private String sex;
    private int age;

    People(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    //生成的builder()方法
    public static People.PeopleBuilder builder() {
        return new People.PeopleBuilder();
    }

    //生成的内部类
    public static class PeopleBuilder {
        private String name;
        private String sex;
        private int age;

        PeopleBuilder() {
        }

        public People.PeopleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public People.PeopleBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public People.PeopleBuilder age(int age) {
            this.age = age;
            return this;
        }

        //生成的build()方法
        public People build() {
            return new People(this.name, this.sex, this.age);
        }

        public String toString() {
            return "People.PeopleBuilder(name=" + this.name + ", sex=" + this.sex + ", age=" + this.age + ")";
        }
    }


    public String toString() {
        return "People(name=" + this.name + ", sex=" + this.sex + ", age=" + this.age + ")";
    }

}
