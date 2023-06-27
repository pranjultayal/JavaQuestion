public class CompanyFactory {

    int n;
    boolean f = false;

    public synchronized void produceItem(int n) {
        if (f) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception" + e.getMessage());
            }
        }
        this.n = n;
        System.out.println("Produced" + this.n);
        f = true;
        notify();
    }

    public synchronized void consumeItem() {
        if (!f) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception" + e.getMessage());
            }
        }
        System.out.println("Consumed" + this.n);
        f = false;
        notify();
    }
}
