public class Main {  // wait() and notify()
        public static void main(String[] args) {
            Buffer buffer = new Buffer(10);

            Thread producerThread = new Thread(new Producer(buffer));
            Thread consumerThread = new Thread(new Consumer(buffer));

            producerThread.start();
            consumerThread.start();

            try {
                producerThread.join();
                consumerThread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
}

// In this example, we use the wait() and notify() methods for synchronization between the producer and consumer threads.