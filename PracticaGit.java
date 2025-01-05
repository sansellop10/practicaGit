import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
public class PracticaGit{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList<>();
        
        System.out.print("Introduce numero en decimal para convertirlo a binario: ");
        int numero = in.nextInt();
        int num = numero;
        do {
            lista.add(num % 2);
            num/=2;
        } while (num>0);

        System.out.print("El numero "+numero+" en binario es: ");
        for(int i = (lista.size()-1); i>=0; i--){
            System.out.print(lista.get(i));
        }
    }
}