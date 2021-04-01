package tests;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String letter = "A";
        Random randomGenerator = new Random();
        Deque<String> objectQue = new ArrayDeque<>();
        List<String> even = new ArrayList<>();
        List<String> odd = new ArrayList<>();
        for(int n=0; n<50; n++) {
            String randoms = randomGenerator.nextInt(50) + letter;
            objectQue.add(randoms);
            if(randoms % 2 == 0)
                { even.add(randoms); }
            else
                { odd.add(randoms); }
            }
        System.out.println("RANDOMS: " + objectQue);
        System.out.println("EVEN: " + even);
        System.out.println("ODD: " + odd);

    }
}

