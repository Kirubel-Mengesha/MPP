package ThreadLab;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new PrimeThreads(1,100000);
        Thread t2 = new PrimeThreads(100001,200000);
        Thread t3 = new PrimeThreads(200001,300000);
        Thread t4 = new PrimeThreads(300001,400000);
        Thread t5 = new PrimeThreads(400001,500000);
        Thread t6 = new PrimeThreads(500001,600000);
        Thread t7 = new PrimeThreads(600001,700000);
        Thread t8 = new PrimeThreads(700001,800000);
        Thread t9 = new PrimeThreads(800001,900000);
        Thread t10 = new PrimeThreads(900001,1000000);



        t1.start();
       // t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
       // t10.start();


    }
}
