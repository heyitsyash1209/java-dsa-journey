package DSA.Tree.Heaptree;

import java.util.PriorityQueue;

public class priority{
    public static void main(String[] args) {
    PriorityQueue <Integer> pq = new PriorityQueue<>();
    pq.add(10);
    pq.add(40);
    pq.add(60);
    pq.peek();
    pq.remove(10);
    System.out.println(pq);
    }
}