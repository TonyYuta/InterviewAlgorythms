package AlgorythmsHandsOnExperience;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class W3resourceCom {

    public static void main(String[] args) {
        W3resourceCom w3 = new W3resourceCom();
        //w3.sumMultiplySubtractDivideRemainderOfTwo();
        //w3.capacityArrayList();
        w3.treeSet();
    }

    private void sumMultiplySubtractDivideRemainderOfTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();
        System.out.println("Sum = " + (first + second));
        System.out.println("Mul = " + (first * second));
        System.out.println("Sub = " + (first - second));
        System.out.println("Div = " + (first / second));
        System.out.println("Mod = " + (first % second));
    }

    private void capacityArrayList() {
        ArrayList c1 = new ArrayList();
        c1.add("yellow");
        c1.add("green");
        System.out.println("first c1: " + c1);
        System.out.println("capac c1: " + c1.size());
        c1.ensureCapacity(4);
        System.out.println("capac c1: " + c1.size());
    }

    private void treeSet() {
        Set<String> ts = new TreeSet<>();
        ts.add("ba");
        ts.add("ab");
        ts.add("cd");
        ts.add("dc");
        System.out.println("ts: " + ts);
        System.out.println("first: " + ((TreeSet<String>) ts).first());
        System.out.println("last: " + ((TreeSet<String>) ts).last());
    }

}
