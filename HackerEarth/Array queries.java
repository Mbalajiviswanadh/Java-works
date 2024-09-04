package HackerEarth;
import java.util.*;

class Main {
    static long mod = 998244353;

    public static long func(int[] a, int[] b, int n, int m) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res += (long) a[i] * b[j] * (i + 1 + j + 1);
                res %= mod;
            }
        }
        return res;
    }

    public static long[] array_queries(int n, int m, int[] a, int[] b, int q, int[][] queries) {
        long[] results = new long[q + 1];
        long funval = func(a, b, n, m);
        results[0] = funval;

        for (int i = 0; i < q; i++) {
            int type = queries[i][0];
            int x = queries[i][1] - 1; // Convert to 0-based index
            int y = queries[i][2] - 1; // Convert to 0-based index

            if (type == 1) {
                int temp = a[x];
                a[x] = b[y];
                b[y] = temp;
            } else if (type == 2) {
                int temp = a[x];
                a[x] = a[y];
                a[y] = temp;
            } else if (type == 3) {
                int temp = b[x];
                b[x] = b[y];
                b[y] = temp;
            }

            funval = func(a, b, n, m);
            results[i + 1] = funval;
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }

            int q = sc.nextInt();
            int[][] queries = new int[q][3];
            for (int i = 0; i < q; i++) {
                queries[i][0] = sc.nextInt();
                queries[i][1] = sc.nextInt();
                queries[i][2] = sc.nextInt();
            }

            long[] results = array_queries(n, m, a, b, q, queries);
            for (long result : results) {
                System.out.print(result + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
