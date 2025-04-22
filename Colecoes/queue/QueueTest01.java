package Colecoes.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        for (String string : fila) {
            System.out.println(string);
        }

        System.out.println("============");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
