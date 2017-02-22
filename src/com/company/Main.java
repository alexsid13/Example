package com.company;

public class Main {
    Integer i = 1;
    int j = 1;
    public void go()
    {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {

        //Gamem g1 = new Gamem();
     //   g1.newGame();
        Main t = new Main();
        t.go();
    }
}
