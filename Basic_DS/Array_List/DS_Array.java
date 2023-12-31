import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class DS_Array {

    static class PrimeCount {

        PrimeCount() throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(br.readLine());
            boolean[] a = new boolean[number + 1];
            Arrays.fill(a, true);

            a[0] = a[1] = false;

            for (int i = 2; i * i <= number; i++) {
                if (a[i]) {
                    for (int j = i * i; j <= number; j += i) {
                        a[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i <= number; i++) {
                if (a[i]) {
                    count++;
                }
            }

            System.out.println("소수의 개수: " + count);
        }
    }

    public void answer() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());

            for (int j = 0; j < s; j++) {
                int data = Integer.parseInt(st.nextToken());
                System.out.print(data + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        DS_Array.PrimeCount pc = new DS_Array.PrimeCount();
        pc.answer();
    }
}