package c3.ch01;

public class CustomerTest {
    
    public static void main(String[] args) {

        // Customer c = new Customer();
        // c.setCustomerName("이순신");
        // c.setCustomerID(10010);
        // c.bonusPoint = 1000;
        // System.out.println(c.showCustomerInfo());

        // VIPCustomer v = new VIPCustomer();
        // v.setCustomerName("세종대왕");
        // v.setCustomerID(10020);
        // v.bonusPoint = 10000;
        // System.out.println(v.showCustomerInfo());

        Customer c = new Customer(10010, "이순신");
        c.bonusPoint = 1000;
        System.out.println(c.showCustomerInfo());

        VIPCustomer v = new VIPCustomer(10020, "세종대왕");
        v.bonusPoint = 10000;
        System.out.println(v.showCustomerInfo());

        int pricec = c.calcPrice(10000);
        int pricev = v.calcPrice(10000);

        System.out.println(c.showCustomerInfo() + " 지불금액은 " + pricec + "원 입니다.");
        System.out.println(v.showCustomerInfo() + " 지불금액은 " + pricev + "원 입니다.");

        Customer n = new VIPCustomer(10030, "나몰라");
        n.bonusPoint = 10000;
        int pricen = n.calcPrice(10000);
        System.out.println(n.showCustomerInfo() + " 지불금액은 " + pricen + "원 입니다.");
    }
}
