package oop2.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Human human1 = new Human("Peter");
        Human human2 = new Human("John");
        Human human3 = new Human("Willy");
        Human human4 = new Human("Polly");
        Human human5 = new Human("Olga");
        Market queue = new Market();

        queue.acceptToMarket(human1);
        queue.acceptToMarket(human2);
        queue.acceptToMarket(human3);
        queue.acceptToMarket(human4);
        queue.acceptToMarket(human5);
//        System.out.println(queue);
        queue.update();
        queue.update();
        queue.update();
        queue.update();
    }
}
