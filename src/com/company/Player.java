package com.company;
import java.util.Scanner;

/**
 * Created by Александр on 20.02.2017.
 */
public class Player {
    Scanner chek = new Scanner(System.in);
    public int []play()
    {
        int i[] = new int[2];
        i[0] = chek.nextInt();
        i[1] = chek.nextInt();
        return i;
    }
}
