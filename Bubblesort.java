package project;
public class Bubblesort {  
    public void bubbleSort(int[] numeros) {  
        int n = numeros.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(numeros[j-1] > numeros[j]){  
                                 //swap elements  
                                 temp = numeros[j-1];  
                                 numeros[j-1] = numeros[j];  
                                 numeros[j] = temp;  
                         }  
                          
                 }  
         }  
        
          
         System.out.println("Arreglo Despues de Bubble Sort");  
         for(int i=0; i < numeros.length; i++){  
                 System.out.print(numeros[i] + " ");  
                 
  
    } 
    }
}
   