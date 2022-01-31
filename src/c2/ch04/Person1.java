package c2.ch04;

public class Person1 {
    String name;
    int age;

    public Person1() {
        this("이름없음", 1);
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
