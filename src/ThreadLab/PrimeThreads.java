package ThreadLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeThreads extends Thread{
    int start;
    int end;


    public PrimeThreads(int start, int end) {
        this.start = start;
        this.end = end;
    }
 @Override
    public void run(){
     System.out.println("thread starts");
     List<Integer> primes = new ArrayList<>();
       for (int i = start; i<=end; i++) {
           if (isPrime(i)) {
               primes.add(i);

           }
       }


     Collections.sort(primes);
     System.out.println("Prime numbers in sorted order:");
     for (int prime : primes) {
         System.out.println(prime);
     }

     System.out.println("Thread ends");

   }

    public boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i+=2 ){
            if (n%i==0){
                return  false;
            }
        }
        return true;

    }

}

