package Concorrencia;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        //searchPricesWithDiscount(service);
        searchPricesWithDiscountAsync(service);
    }

    @SuppressWarnings("unused")
    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        //stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
        .map(service::getPriceSync)
        .map(Quote::newQuote)
        .map(service::applyDiscount)
        .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        
        List<CompletableFuture<String>> completableFutures = stores.stream()
        .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
        .map(cf -> cf.thenApply(Quote::newQuote))
        .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
        .collect(Collectors.toList());

        completableFutures.stream()
        .map(CompletableFuture::join)
        .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));
    }
}
