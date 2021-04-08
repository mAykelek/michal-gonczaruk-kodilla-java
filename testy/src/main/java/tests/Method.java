package tests;

import java.util.*;

class Method {
    List<String> all;
    List<String> evens;
    List<String> odds;

    public Method() {
        all = new ArrayList<>();
        evens = new ArrayList<>();
        odds = new ArrayList<>();
    }
    public void getList(Deque<String> objectQue) {
        while (objectQue.size() > 0){
            String poll = objectQue.poll();
            all.add(poll);
            int pollLength = poll.length();
            if(pollLength % 2 == 0) {
                evens.add(poll);
            } else {
                odds.add(poll);
            }
        }
        System.out.println("All objects: " + all + "\n");
        System.out.println("Evens: " + evens + "\n");
        System.out.println("Odds: " + odds);
    }
}