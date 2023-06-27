public class ProducerConsumerMain {

    public static void main(String[] args) {
        CompanyFactory comp = new CompanyFactory();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();
    }
}
