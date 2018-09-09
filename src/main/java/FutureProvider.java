import java.util.concurrent.CompletableFuture;

public class FutureProvider {
    public CompletableFuture<ClassA> retrieveClassA() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new ClassA();
        });
    }

    public CompletableFuture<ClassB> retrieveClassB() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new ClassB();
        });
    }

    public CompletableFuture<ClassC> retrieveClassC() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new ClassC();
        });
    }
}
