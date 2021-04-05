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
            int pollLength = poll.length();
            if(pollLength == 2) {
                String afterpoll1 = poll.substring(0, 1);
                if(afterpoll1 % 2 == 0) {
                    evens.add(poll + "A");
                } else {
                    odds.add(poll + "A");
                }
            }
            if(pollLength == 3) {
                String afterpoll2 = poll.substring(0, 2);
                if(afterpoll2 % 2 == 0) {
                    evens.add(poll + "A");
                } else {
                    odds.add(poll + "A");
                }
            }
        }
        System.out.println("All objects: " + all + "\n");
        System.out.println("Evens: " + evens + "\n");
        System.out.println("Odds: " + odds);
    }
}