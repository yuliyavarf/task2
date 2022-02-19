package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fr1 = new FileReader("src/file1.txt");
        FileReader fr2 = new FileReader("src/file2.txt");

        Scanner sc1 = new Scanner(fr1);
        float x = Float.parseFloat(sc1.next());
        float y = Float.parseFloat(sc1.next());
        float r = Float.parseFloat(sc1.next());

        float r2 = (float) Math.pow(r, 2);

        Scanner sc2 = new Scanner(fr2);
        int count = 0;

        if (sc2.hasNext()) {
            for (int i = 0; i < 200; i++) {
                float x1 = Float.parseFloat(sc2.next());
                float y1 = Float.parseFloat(sc2.next());

                float hypotenuse = (float) (Math.pow((x - x1), 2) + Math.pow((y - y1), 2));

                if (r2 == hypotenuse) {
                    System.out.println(count + " - точка лежит на окружности");
                }

                else if (r2 > hypotenuse) {
                    System.out.println(count + " - точка внутри");
                }

                else {
                    System.out.println(count + " - точка снаружи");
                }

                ++count;
                i++;
            }
            return;
        }
        fr1.close();
        fr2.close();
        sc1.close();
        sc2.close();
    }
}
