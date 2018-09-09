import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class Main {
    private static final FutureProvider futureProvider = new FutureProvider();
    private static final CombindFunctionImpl combineFunction = new CombindFunctionImpl();

    public static void main (String[] args){
        CompletableFuture<ClassA> classAfuture = futureProvider.retrieveClassA();
        CompletableFuture<ClassB> classBfuture = futureProvider.retrieveClassB();
        CompletableFuture<ClassC> classCfuture = futureProvider.retrieveClassC();

        System.out.println("starting completable futures ...");
        long startTime = System.nanoTime();

        ABCData ABCData = CompletableFuture.allOf(classAfuture, classBfuture, classCfuture)
                .thenApply(ignored ->
                        combineFunction.combind(
                                classAfuture.join(),
                                classBfuture.join(),
                                classCfuture.join())
                ).join();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("completable futures are complete...");
        System.out.println("duration:\t" + Duration.ofNanos(duration).toString());
        System.out.println("result:\t" + ABCData);
    }
}
