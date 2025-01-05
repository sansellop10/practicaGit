import java.util.Scanner;
import java.util.ArrayList;

public class PracticaGit{
    static ArrayList <Integer> lista = new ArrayList<>();
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Introduce numero en decimal para convertirlo a binario: ");
        int numero = in.nextInt();
        
        ArrayList<Integer> lista1 = ConversorBinario(numero);

        System.out.print("El numero "+numero+" en binario es: ");
        for(int i = (lista1.size()-1); i>=0; i--){
            System.out.print(lista.get(i));
        }
        in.close();
    }
    public static ArrayList<Integer> ConversorBinario(int numeroDecimal){
      
        do {
            lista.add(numeroDecimal % 2);
            numeroDecimal/=2;
        } while (numeroDecimal>0);

        return lista;
    }
}