/*
 * Name: ARYAN KUMAR GUPTA
 * Reg No: 2241007050
 * PS LINK: https://cses.fi/problemset/task/1083
 */

import java.util.Scanner;
public class Q2_1083 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        sc.nextLine(); 
        int arr[] = new int[n + 1]; 
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] found = new boolean[n + 1]; 

        for (int num : arr) {
            if (num >= 1 && num <= n) {
                found[num] = true; 
            }
        }
    
        for (int i = 1; i <= n; i++) {
            if (!found[i]) {
                System.out.println(i); 
            }
        }
    }
}
