class FirstTask implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First " + i);
        }
    }
}

class MainTask {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstTask());
        firstThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main " + i);
        }
    }
}
