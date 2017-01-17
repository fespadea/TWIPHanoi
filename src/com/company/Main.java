package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Give me a number.");
        Scanner num = new Scanner(System.in);
        int numb = num.nextInt();
        Hanoi.solve(numb);
    }
}
