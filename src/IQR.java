import java.util.Scanner;

//8 8 10 11 11 11 11 12 13 16 17
//0 1  2  3  4  5  6  7  8  9  10

public class IQR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements ");
		int N = 11;
		double[] a = {8,8,10,11,11,11,11,12,13,16,17};
	/*	for(int i = 0; i<N; i++) {
			a[i] = sc.nextInt();
		}*/
		double Q1,Q2,Q3,IQR;
		if(N%2 == 0) {
			int mid = N/2;
			Q2 = (a[mid-1] + a[mid])/2;
			Q1 = a[mid/2];
			Q3 = a[mid + mid/2];
		}else {
			int mid = (N-1)/2;
			Q2 = a[mid];
			Q1 = (a[(mid - 1)/2] + a[(mid + 1)/2])/2;
			Q3 = (a[mid + (mid - 1)/2] + a[mid + (mid + 1)/2])/2;
		}
		IQR = Q3 - Q1;
		System.out.println("Q1 = " + Q1);
		System.out.println("Q2 = " + Q2);
		System.out.println("Q3 = " + Q3);
		System.out.println("IQR = " + IQR);
	}
}
