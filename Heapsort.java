package project;
public class Heapsort{

	     public void heapSort(int [ ] numeros) {
	        int length = numeros.length;

	        buildMaxHeap(numeros, length);
	        for(int i = length - 1; i > 0; i--) {
	            int temp = numeros[0];
	            numeros[0] = numeros[i];
	            numeros[i] = temp;
	            maxHeapify(numeros, 1, i);
	        }
	     }


	    private void buildMaxHeap(int[] numeros, int heapSize) {
	        if(numeros == null) {
	            throw new NullPointerException("null");
	        }
	        if(numeros.length <=0 || heapSize <= 0) {
	            throw new IllegalArgumentException("illegal");
	        }
	        if(heapSize > numeros.length) {
	            heapSize = numeros.length;
	        }

	        for(int i = heapSize/2; i > 0; i--) {
	            maxHeapify(numeros, i, heapSize);
	        }
	    }

	    private void maxHeapify(int[] numeros, int index, int heapSize) {
	        int l = index * 2;
	        int r = l + 1;
	        int largest;

	        if(l <= heapSize && numeros[l - 1] > numeros[index - 1]) {
	            largest = l;
	        } else {
	            largest = index;
	        }

	        if(r <= heapSize && numeros[r - 1] > numeros[largest - 1]) {
	            largest = r;
	        }

	        if(largest != index) {
	            int temp = numeros[index - 1];
	            numeros[index - 1] = numeros[largest - 1];
	            numeros[largest - 1] = temp;
	            maxHeapify(numeros, largest, heapSize);
	        }
	    }
	}
