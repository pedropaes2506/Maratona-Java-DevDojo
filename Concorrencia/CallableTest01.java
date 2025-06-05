package Concorrencia;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

class RandomNumberCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa callable...\n", Thread.currentThread().getName());
        }
        return String.format("%s finished and the random number is %d\n", Thread.currentThread().getName(), num);
    }

}

public class CallableTest01 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);

        String s = future.get();
        System.out.printf("Program finished %s\n", s);
        executorService.shutdown();
    }
}
