package in.shivamagarwal.problems;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] % 2 > a[j] % 2) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            if (a[i] % 2 == 0) i++;
            if (a[j] % 2 == 1) j--;
        }

        return a;
    }
}
