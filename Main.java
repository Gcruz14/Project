package project;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero de términos");
		int n = sc.nextInt();
		int numeros[] = new int[n];
              for (int x=0; x<n; x++){
              numeros[x] = (int) (Math.random()*n)+1; 
              System.out.print(numeros[x]);
              }
              System.out.println("");
              System.out.println("Seleccione una opcion: 1-BubbleSort, 2-MergeSort, 3-HeapSort");
              int s= sc.nextInt();
              switch(s) {
              case 1:
            	  Bubblesort b=new Bubblesort();
            	  b.bubbleSort(numeros);
               break;
              case 2:
	           	   Mergesort m = new Mergesort();
	           	   m.mergesort(numeros);           	   
           	   break;
              case 3:
           	   Heapsort h= new Heapsort();
           	  h.heapSort(numeros);
          	   break;
              }
       }

}

	
