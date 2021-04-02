package tests;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

class Main {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        Deque<Integer> objectQue = new ArrayDeque<>();
        for (int n = 0; n < 50; n++) {
            int randoms = randomGenerator.nextInt(50);
            objectQue.add(randoms);
        }
        Method method = new Method();
        method.getList(objectQue);
    }
}


