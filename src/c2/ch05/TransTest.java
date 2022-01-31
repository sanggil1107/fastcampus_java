package c2.ch05;

public class TransTest {
    
    public static void main(String[] args) {

        Student s1 = new Student("Yang", 5000);
        Student s2 = new Student("Choi", 10000);

        Bus bus100 = new Bus(100);
        Subway subway2 = new Subway(2);

        s1.takeBus(bus100);
        s2.takeSubway(subway2);
        s2.takeBus(bus100);

        s1.showInfo();
        s2.showInfo();

        bus100.showBusInfo();
        subway2.showSubwayInfo();
    }
}
