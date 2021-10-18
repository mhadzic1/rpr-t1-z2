package ba.unsa.etf.rpr.tutorijal01;
import java.util.Scanner;

public class Main {
    static int SumaCifara(int x){
        int suma = 0;

        while(x != 0){
            suma = suma + (x%10);
            x=x/10;
        }

        return suma;
    }

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    System.out.println("Unesite broj n: ");
    int n = sc.nextInt();

    for(int i = 1; i <=n; i++){
            if(i % SumaCifara(i) == 0) { System.out.println(i);}
        }
    }
}
