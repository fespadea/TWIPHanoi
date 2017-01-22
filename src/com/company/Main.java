package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Tower of Hanoir Game.\nThis program will solve the puzzle for you.\nPlease input number of disks to solve for.");
        Scanner num = new Scanner(System.in);
        int numb = num.nextInt();
        System.out.println("Instructions:");
        Hanoi.solve(numb);
    }
}
