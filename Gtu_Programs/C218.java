package gtupapers;

import java.util.Scanner;

/*
    Write a method for computing XY doing repetitive multiplication. X and y are of
    type integer and are to be given as command line arguments. Raise and handle
    exception(s) for invalid values of X and y.
 */
class Data {

    int x, y;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void compute() {
        int mul = 1;
        for (int i = 1; i <= y; i++) {
            mul = x * mul;
        }
        System.out.println(mul);
    }

}

public class C218 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Data d2 = new Data(a, b);
        d2.compute();

    }
}
