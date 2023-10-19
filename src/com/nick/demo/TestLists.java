package com.nick.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    public void arrayListMethod(){

        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(2);
        scoreList.add(3);
        System.out.println(scoreList);
        scoreList.remove(0);
        scoreList.set(0,5);
        System.out.println(scoreList);
        System.out.println(scoreList.get(0));

    }

    public void studentArrayList(){

        List<Student> studentArray = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            new Student("Player"+1, i);
            studentArray.add(0,0);
        }

    }

    public void linkedListMethod(){

        LinkedList<Integer> scoreList2 = new LinkedList<>();
        scoreList2.add(2);
        scoreList2.add(3);
        System.out.println(scoreList2);
        scoreList2.remove(0);
        scoreList2.set(0,5);
        System.out.println(scoreList2);
        scoreList2.addFirst(6);
        System.out.println(scoreList2.get(0));
        System.out.println(scoreList2.get(1));


    }





}