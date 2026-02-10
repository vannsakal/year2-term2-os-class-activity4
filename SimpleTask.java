class SimpleTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // Changed to 1s for quicker testing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
