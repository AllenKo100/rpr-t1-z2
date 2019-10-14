package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    static int sumaCifara(int broj){
        int suma=0;
        int cifra=0;

        do{
            cifra=broj%10;
            suma+=cifra;
            broj=broj/10;
        }while(broj!=0);

        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        System.out.println("Brojevi od 1 do n djeljivi sa sumom cifara su: ");

        for(int i=1; i<=n; i++){
            if(i%sumaCifara(i)==0) System.out.println(" " + i);
        }
    }
}
