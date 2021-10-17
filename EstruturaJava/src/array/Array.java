package array;//package com.company;

public class Array {
    

    public static void main(String[] args) {
        
        
    
//        [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    /*
        int[] array = {32, 55 ,100, 22, 69, 48, 74, 97, 1, 85, 9000};
       
                
        for (int i = 0; i < array.length; i++) {
            //
            System.out.printf("%8d%8d%n", i, array[i]);
            //o 8 depois da virgula da 8 espaços antes de aparecer o valor
            //o d está indicando qual o tipo da variavel
        }
    }
    */
    
        
//        [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    
        int[] array = { 32, 27,56, 76, 89, 87, 65, 78 };
        
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5s %5s %n", counter, array[counter]);
        }
        
//        System.out.printf("%s %s %n", "Index", "Value");
    
    }
    
     
}
