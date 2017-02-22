package com.company;

/**
 * Created by Александр on 20.02.2017.
 */
public class Dotcom {
    private int life = 3;
    private  int b1;
    private int c1;
    public int [][] xy = new int[3][2];
    public int getLife()
    {
        return life;
    }
    public void setLife(int u)
    {
        life = u;
    }

    public int[][] appear(int[][] a)
    {
        int b = (int)(Math.random()*5);
        int c = (int)(Math.random()*5);
        int f = (int)(Math.random()*2);
        if(f == 1) {
            while(a[b][c] != 0 || a[b][c+1] !=0 || a[b][c+2] != 0)
            {
                b = (int)(Math.random()*5);
                c = (int)(Math.random()*5);
            }
                b1 = b;
                c1 = c;
                for (int j = c; j < c + 3; j++) {
                    if (a[b][j] == 0) {
                        a[b][j]++;
                        if (j == c) {
                            if (j > 0) {
                                a[b][j - 1] = 2;
                                if (b > 0)
                                    a[b - 1][j - 1] = 2;
                                if (b < 6)
                                    a[b + 1][j - 1] = 2;
                            }
                        }
                        if (j == c + 2) {
                            if (j < 6) {
                                a[b][j + 1] = 2;
                                if (b > 0)
                                    a[b - 1][j + 1] = 2;
                                if (b < 6)
                                    a[b + 1][j + 1] = 2;
                            }
                        }
                        if (b > 0)
                            a[b - 1][j] = 2;
                        if (b < 6)
                            a[b + 1][j] = 2;


                    } else {
                        b = (int) (Math.random() * 5);
                        c = (int) (Math.random() * 5);
                        j = c;
                    }

                }

        }
        else
        {
            while(a[b][c] != 0 || a[b+1][c] !=0 || a[b+2][c] != 0)
            {
                b = (int)(Math.random()*5);
                c = (int)(Math.random()*5);
            }
                b1 = b;
                c1 = c;
                for (int j = b; j < b + 3; j++) {
                    if (a[j][c] == 0) {
                        a[j][c]++;
                        if (j == b) {
                            if (j > 0) {
                                a[j - 1][c] = 2;
                                if (c > 0)
                                    a[j - 1][c - 1] = 2;
                                if (b < 6)
                                    a[j - 1][c + 1] = 2;
                            }
                        }
                        if (j == b + 2) {
                            if (j < 6) {
                                a[j + 1][c] = 2;
                                if (c > 0)
                                    a[j + 1][c - 1] = 2;
                                if (b < 6)
                                    a[j + 1][c + 1] = 2;
                            }
                        }
                        if (c > 0)
                            a[j][c - 1] = 2;
                        if (c < 6)
                            a[j][c + 1] = 2;

                    } else {
                        b = (int) (Math.random() * 5);
                        c = (int) (Math.random() * 5);
                        j = b;
                    }
                }
        }
        for(int i = 0; i < 3;i++)
        {
            if (f == 1){
                xy[i][0] = b1;
                xy[i][1] = c1;
                c1++;
            }
            else {
                xy[i][0] = b1;
                xy[i][1] = c1;
                b1++;
            }
        }
        return a;

    }
}
