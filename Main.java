package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code he
        List<String> a=new LinkedList<String>();
        List<String> b=new LinkedList<String>();

        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIter=a.listIterator();
        Iterator<String> bIter=b.iterator();
        while(bIter.hasNext()){
            if(aIter.hasNext()){
                aIter.next();
            }
            aIter.add(bIter.next());
        }
        System.out.println(a);
    }
}
