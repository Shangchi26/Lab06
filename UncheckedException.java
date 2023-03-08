import java.util.Scanner;

public class UncheckedException {
    public UncheckedException(){

    }

    public static void main(String[] args) {
        int i, n = 2;
        int a[] = new int[n];

        java.util.Scanner input = new java.util.Scanner(System.in);

        for (i = 0; i <= n; i++){
            try {
                System.out.printf("a[%d] = ", i);
                a[i] = input.nextInt();
            } catch (Exception e) {
                System.out.printf("An exception occorrend: " + e);
            }
        }
    }
}
//please correct the above code to be able to catch every Exception that