/*
 * Name: ARYAN KUMAR GUPTA
 * Reg No: 2241007050
 * PS LINK: https://cses.fi/problemset/task/1094
 */


import java.util.*;
import java.io.*;
public class Q4_1094 {
	public static BufferedReader br;
	public static StringTokenizer st;
	public static FastReader in = new FastReader();
	public static int n = in.nextInt();
	public static long[] arr = new long[n];
	public static long ans = 0;
	
	public static void main(String[] args) throws IOException{
		input();
		System.out.println(ans);
	}
	
	public static void input() {
		
		arr[0] = in.nextLong();
		for(int i = 1; i < n; i++) {

			long curr = in.nextLong();
			arr[i] = Math.max(arr[i-1], curr);
			ans += Math.max(0, (arr[i-1] - curr));
		}
	}

	static class FastReader{
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}