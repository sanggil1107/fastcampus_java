package c2.ch01;

class UserInfo {
    public String userId;
    public String userPassword;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo() {

    }

    public UserInfo(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다."; 
    }
}

public class UserInfoTest {

    public static void main(String[] args) {
        UserInfo yang = new UserInfo();
        yang.userId = "1234";
        yang.userPassword = "asdf";
        yang.userName = "Yang";
        yang.phoneNumber = "01015684486";
        yang.userAddress = "Seoul";

        System.out.println(yang.showUserInfo());

        UserInfo kim = new UserInfo("4444", "1qaz", "Kim");
        System.out.println(kim.showUserInfo());
    }
}