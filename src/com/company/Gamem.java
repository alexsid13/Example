package com.company;

/**
 * Created by Александр on 20.02.2017.
 */
public class Gamem {
    private int[][] Matr = new int[7][7];

    public void newGame() {
        for (int an = 0; an < 7; an++) {
            for (int an1 = 0; an1 < 7; an1++) {
                Matr[an][an1] = 0;
            }
        }

       boolean f = true;

        Dotcom n1 = new Dotcom();
        Dotcom n2 = new Dotcom();
        Dotcom n3 = new Dotcom();
        Matr = n1.appear(Matr);
        Matr = n2.appear(Matr);
        Matr = n3.appear(Matr);
        for (int hj = 0; hj < 7; hj++) {
            for (int hj1 = 0; hj1 < 7; hj1++) {
                System.out.print(Matr[hj][hj1] + " ");
            }
            System.out.println();
        }

        System.out.println();
        Player s = new Player();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        while (true) {
            if(flag1 && flag2 && flag3)
            {
                System.out.println("Конец игры");
                break;
            }
            int []check = s.play();
            if(Matr[check[0]][check[1]] == 1)
            {
                Matr[check[0]][check[1]] = 0;
                System.out.println("Попал");
                for(int i = 0; i < 3;i++) {
                    if(n1.xy[i][0] == check[0]) {
                        if(n1.xy[i][1] == check[1]) {
                            n1.setLife(n1.getLife() - 1);
                            if (n1.getLife() == 0) {
                                flag1 = true;
                                System.out.println("Убил");
                            }
                            continue;
                        }
                    }
                    if(n2.xy[i][0] == check[0]) {
                        if(n2.xy[i][1] == check[1]) {
                            n2.setLife(n2.getLife() - 1);
                            if (n2.getLife() == 0) {
                                flag2 = true;
                                System.out.println("Убил");
                            }
                            continue;
                        }
                    }
                    if(n3.xy[i][0] == check[0]) {
                        if(n3.xy[i][1] == check[1]) {
                            n3.setLife(n3.getLife() - 1);
                            if (n3.getLife() == 0) {
                                flag3 = true;
                                System.out.println("Убил");
                            }
                            continue;
                        }
                    }

                }


            }
            else
                System.out.println("Мимо");

        }


    }
}
