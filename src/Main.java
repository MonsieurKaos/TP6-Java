import fr.morin.math.Fibonacci;
import fr.morin.ps4.*;
import java.util.ArrayList;
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
        System.out.println("Le i le plus grand tel que F(i)< 12586269025 est : " + F1.dernierPlusPetit(1000000));

        F1.shuffleFibo(fibonacciN);
        System.out.println(F1.isInFibo(12586269025L));
        F1.sortFibo(fibonacciN);

        //Exercice 2

        JeuPS4 J1 = new JeuPS4("God of War", 18);
        JeuPS4 J2 = new JeuPS4("Rayman", 7);
        System.out.println(J1.toString());
        System.out.println(J2.toString());

        MesJeux MJ1 = new MesJeux();
        MJ1.ajouterJeu(J1);
        MJ1.ajouterJeu(J2);

        MJ1.retirerJeu(J1);
        MJ1.retirerJeu("Rayman 2");

        MesJeux2 MJ2 = new MesJeux2();
        MJ2.add(J1);
        MJ2.remove(J1);

        MJ1.ajouterJeu("God of War", 18);
        MJ1.ajouterJeu(J1);

        //Exercice 3



    }
}