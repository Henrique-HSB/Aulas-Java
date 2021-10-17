package array;


import java.util.ArrayList;
import java.util.Scanner;

    public class Listanomecontains {
    
    public static void main (String[] args){ 
    
        ArrayList<String> nomes; 
        nomes = new ArrayList<String>(); 
    
        System.out.println("Digite o nome"); 
        Scanner scan = new Scanner(System.in); 
    
        String nome = null;
    
        for (int i=0; i<10; i++){ 
            nome = scan.nextLine();
            
            if( nomes.contains(nome) ) { 
                //contains: serve para verificar se na sua Collection (o teu ArrayList) possui um determinado elemento
                System.out.println("ESTE NOME JÁ EXISTE!");
                i--;
            } else {
                nomes.add(nome);
            }
            System.out.println("Digite o nome"); 
        }//fim do for 
    
        for (int i=0; i<nomes.size(); i++){ 
            System.out.println(nomes.get(i)); 
        }//fim do for 
        scan.close();
    }//fim do método main 
}
    