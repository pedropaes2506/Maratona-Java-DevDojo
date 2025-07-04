package Concorrencia;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    public static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
        .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s), executor))
        .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
        .map(CompletableFuture::join)
        .collect(Collectors.toList());

        System.out.println(prices);
        long end = System.currentTimeMillis();
        executor.shutdown();
        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));
    }
}
