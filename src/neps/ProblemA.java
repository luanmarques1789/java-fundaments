package neps;

import java.util.Scanner;

public class ProblemA {

    public static void print(char msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int o1, p1, b1, o2, p2, b2;

        o1 = scan.nextInt();
        p1 = scan.nextInt();
        b1 = scan.nextInt();
        o2 = scan.nextInt();
        p2 = scan.nextInt();
        b2 = scan.nextInt();
        scan.close();

        if (o1 == o2 && p1 == p2 && b1 == b2) {
            throw new Error("Entrada inválida");

        } else if (o1 > o2) {
            print('A');
        } else if (o2 > o1) {
            print('B');
        } else {
            if (p1 > p2) {
                print('A');
            } else if (p2 > p1) {
                print('B');
            } else {
                if (b1 > b2) {
                    print('A');
                } else {
                    print('B');
                }
            }
        }

    }
}
