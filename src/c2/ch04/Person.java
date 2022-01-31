package c2.ch04;

public class Person {
    
    String name;
    int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sanggil";
        p.age = 32;

        Person p1 = p.getPerson();
        System.out.println(p);
        System.out.println(p1);
    }
}
