package fr.morin.math;

import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {
    private ArrayList<Long> resulFibonacci = new ArrayList<Long>();


    public ArrayList<Long> getResulFibonacci() {
        return resulFibonacci;
    }

    public void setResulFibonacci(ArrayList<Long> resulFibonacci) {
        this.resulFibonacci = resulFibonacci;
    }

    public void initFibo() {
        resulFibonacci.add(0L);
        resulFibonacci.add(1L);

        for (int i = 2; i < 80; i++) {
            long nextFibonacci = resulFibonacci.get(i - 1) + resulFibonacci.get(i - 2);
            resulFibonacci.add(nextFibonacci);
        }
    }

    public boolean isInFibo(long number) {
        if (resulFibonacci.contains(number)) {
            System.out.println(resulFibonacci.indexOf(number));
            return true;
        }
        return false;
    }

    public void numbPairImpair(ArrayList<Long> fibonacciN) {
        int pai = 0;
        int imp = 0;
        for (int i = 0; i < fibonacciN.size(); i++) {
            if (fibonacciN.get(i) % 2 == 0) {
                pai = pai + 1;
            } else {
                imp = imp + 1;
            }
        }
        System.out.println("Nombre de résultat pair : " + pai);
        System.out.println("Nombre de résultat impair : " + imp);
    }

    public int dernierPlusPetit(long number) {
        for (int i = 0; i < resulFibonacci.size(); i++) {
            if (resulFibonacci.get(i+1)>=number) {
                return i;
            }
        }
        return 0;
    }
    public void shuffleFibo(ArrayList<Long> FibonacciN){
        Collections.shuffle(FibonacciN);
    }

    public void sortFibo(ArrayList<Long> FibonacciN){
        Collections.sort(FibonacciN);
    }

}
