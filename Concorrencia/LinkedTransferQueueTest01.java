package Concorrencia;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.remainingCapacity());
        System.out.println(tq.add("Pedro"));
        System.out.println(tq.offer("Pedro"));
        System.out.println(tq.offer("Pedro", 10, TimeUnit.SECONDS));
        tq.put("Pedro");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Pedro");
        }
        System.out.println(tq.tryTransfer("Pedro"));
        System.out.println(tq.tryTransfer("Pedro", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
    }
}
