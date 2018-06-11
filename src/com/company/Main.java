package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        Main mainClass = new Main();
        mainClass.testingList();

    }

    private void testingList() {
        nameList = new ArrayList<>();
        nameList.add("Crystal");
        nameList.add("Chris");
        nameList.add("Bin");
        nameList.add("Luke");

        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("here is my name!");
        System.out.println(nameList.get(2));

        System.out.println("Crystal got removed!");
        nameList.remove(0);

        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println();
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }

        System.out.println("number?");
        int numberToRemove = input.nextInt() - 1;
        if (numberToRemove >= nameList.size() || numberToRemove < 0) {
            System.out.println("Invalid Number!");
        } else {
            nameList.remove(numberToRemove);
        }
        System.out.println();
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }
    }
}
