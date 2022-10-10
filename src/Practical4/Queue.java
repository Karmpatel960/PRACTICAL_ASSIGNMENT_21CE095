package Practical4;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {

    private final ArrayList<Integer> arr;
    private final int size;

    Scanner sc = new Scanner(System.in);

    Queue(int size){
        System.out.println("Enter elements for Queue: ");
        this.size = size;
        arr = new ArrayList<>(size);
        for (int i=0;i<size;i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    public void enqueue(int v){
        arr.add(v);
    }

    public int dequeue(){
        arr.remove(3);
        return arr.get(3);
    }

    public boolean empty(){
        return arr.isEmpty();
    }

    public void getSize() {
    }

    public void display(){
        System.out.println(arr);
    }
}

