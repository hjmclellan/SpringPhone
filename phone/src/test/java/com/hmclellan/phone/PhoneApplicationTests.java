package com.hmclellan.phone;

//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhoneApplicationTests {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("s9", 99, "verizon", "Ring Ring Ring!!");
        IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing!");

        s9.displayInfo();
        System.out.println(s9.unlock());
        System.out.println(s9.ring());

        iphoneTen.displayInfo();
        System.out.println(iphoneTen.unlock());
        System.out.println(iphoneTen.ring());
    }
}
