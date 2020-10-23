package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        Carte carte=new Carte("Fratii Karamazov", "Feodor Dostoievski", 1880, 1200);
        Biblioteca biblioteca=new Biblioteca();

        biblioteca.add(carte);
        biblioteca.add(new Carte("Procesul", "F. Kafka", 1910, 350));
        biblioteca.add(new Carte("endere s game ", "gigi contra", 1920, 656));
biblioteca.sort();
       // System.out.println(carte);
       // System.out.println(biblioteca);

        Thread thr=new MyThread();
thr.setName("alupigus");
         thr.start(); //alocam resurse pt un nou tred, se adauga in lista de planificare si incepe sa se ruleze comanda run anterioara
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<20;i++){
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(100 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).start();}

        try {
            thr.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
