package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BST tree = new BST();
        int[] data = {50,30,70,20,40,60,80,35,45,65};
        for(int v : data) tree.insert(v);
        AsciiTreePrinter.print(tree.root);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to insert to the BST: ");
        int userNum = sc.nextInt();
        tree.insert(userNum);

        System.out.println("BTS after inserting " + userNum+ ":");
        AsciiTreePrinter.print(tree.root);
    }
}
