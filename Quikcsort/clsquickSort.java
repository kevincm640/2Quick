public class clsquickSort {

    public static void quickSort(int A[], int izq, int der) {

        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (A[i] <= pivote && i < j)
                i++;
            while (A[j] > pivote)
                j--;

            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;

            }
        }
        A[izq] = A[j];
        A[j] = pivote;

        if (izq < j - 1)
            quickSort(A, izq, j - 1);

        if (j + 1 < der)
            quickSort(A, j + 1, der);
    }

    public static void impriMir(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println(" ");
    }

    public static void main(String[] args) {

        int[] A = { 1, 8, 2, 12, 4, 9, 7, 3, 5, 6 };
        int n = A.length;

        System.out.println("ARREGLO ORIGINAL");
        impriMir(A);

        System.out.println("ARREGLO ORDENADO W/QUICKSORT");
        quickSort(A, 0, n-1);

        impriMir(A);

    }

}