package com.alevel.java.nix.array.main;

import com.alevel.java.nix.array.findelem.FindExtrem;
import com.alevel.java.nix.array.multiplicity.FindNum;
import com.alevel.java.nix.array.printer.Printer;
import com.alevel.java.nix.array.sort.BubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {8, 5, 1, 0, -4, 16, -9, -15, 7, 11, -10, 0};

        Printer.print(arr);

        System.out.println();
        System.out.println("Min value: " + FindExtrem.findMin(arr));
        System.out.println("Max value: " + FindExtrem.findMax(arr));

        BubbleSort.bubbleSort(arr);
        Printer.print(arr);

        System.out.println();

        FindNum.findNum(arr);
    }
}
