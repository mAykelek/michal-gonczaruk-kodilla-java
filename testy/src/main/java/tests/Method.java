package tests;

import java.util.*;

class Method {
    List<String> evens;
    List<String> odds;

    public Method() {
        evens = new ArrayList<>();
        odds = new ArrayList<>();
    }
    public void getList(Deque<Integer> objectQue) {
        while (objectQue.size() > 0){
            Integer poll = objectQue.poll();
            if(poll % 2 == 0) {
                evens.add(poll + "A");
            } else {
                odds.add(poll + "A");
            }
        }
        System.out.println(evens);
        System.out.println(odds);
    }
}