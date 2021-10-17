package lambda;


import java.util.Arrays;
import java.util.List;

public class ArrayLambida {
    public static void main(String[] arg) {


        System.out.println("Imprime todos os elementos da lista!");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //for(Integer n: list) {
          //  System.out.println(n);
        //}

        //mesmo codigo usando Lambida
        list.forEach(n -> System.out.println(n));




    }
}
