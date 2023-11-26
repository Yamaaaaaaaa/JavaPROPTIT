/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] a = new int[n+5];
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] > 0 && a[i] % 2 != 0) res += a[i];
        }
        System.out.println(res);
	}
}

