public class Потоки {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(3000);

        System.out.println(" - Сколько я проспал? \n - " + ((System.currentTimeMillis()-start)) / 1000 + " секунды");
    }
}
