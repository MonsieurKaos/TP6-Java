import fr.morin.math.Fibonacci;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fibonacci F1 = new Fibonacci();
        F1.initFibo();
        ArrayList<Long> fibonacciN = F1.getResulFibonacci();
        for (int i = 0; i < fibonacciN.size(); i++) {
            System.out.println(fibonacciN.get(i) + " ");
        }
        System.out.println(fibonacciN.get(50));
        System.out.println(F1.isInFibo(4182));
        System.out.println(F1.isInFibo(832040));
        System.out.println(fibonacciN.get(40));

        F1.numbPairImpair(F1.getResulFibonacci());
    }
}