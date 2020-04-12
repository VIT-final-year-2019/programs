// 

// 

public class CountingSort
{
    public static void main(final String[] args) {
        final int[] a = { 1, 4, 1, 2, 7, 5, 2 };
        final int[] count = new int[10];
        for (int i = 0; i < a.length; ++i) {
            final int[] array = count;
            final int n = a[i];
            ++array[n];
        }
        for (int i = 1; i < count.length; ++i) {
            count[i] += count[i - 1];
        }
        final int[] output = new int[a.length];
        for (int j = 0; j < a.length; ++j) {
            output[count[a[j]] - 1] = a[j];
            --count[a[j]];
        }
        for (int j = 0; j < a.length; ++j) {
            System.out.println(output[j]);
        }
    }
}
