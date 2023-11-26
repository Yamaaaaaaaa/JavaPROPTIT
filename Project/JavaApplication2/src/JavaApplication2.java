import java.util.Scanner;

public class Arrayy{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
        for(int i = 1; i <= 10; i++)
        {
            a[i] = sc.nextInt();
            System.out.print(a[i]+" ");
        }
    }
}
