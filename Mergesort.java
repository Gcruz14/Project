package project;

public class Mergesort {
	public  void mergesort(int numeros[]) {
		int n = numeros.length;
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = numeros[i];
		}
		for (int i = mid; i < n; i++) {
			right[i - mid] = numeros[i];
		}
		mergesort(left);
		mergesort(right);
		merge(numeros, left, right);
		System.out.println("Arreglo Despues de Merge Sort");
		for(int f=0; f < numeros.length; f++){  
	        System.out.print(numeros[f] + " ");
		}
	}

	public void merge(int  numeros[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				numeros[k] = left[i];
				i++;
			} else {
				numeros[k] = right[i];
				j++;
			}
			k++;
		}
		while (i < nL) {
			numeros[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			numeros[k] = right[j];
			j++;
			k++;
		}
	}

}

