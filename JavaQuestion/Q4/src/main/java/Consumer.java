public class Consumer extends Thread {
    CompanyFactory c;

    Consumer(CompanyFactory c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            this.c.consumeItem();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}