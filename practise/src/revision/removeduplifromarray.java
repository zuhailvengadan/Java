package revision;

import java.util.Arrays;

public class removeduplifromarray {

	public static void main(String[] args) {
		int n=121,temp=n,sum=0,rem=0;
		int a[]= {12,9,45,12,12,78,78,32,12};
		Arrays.sort(a);
			System.out.println(Arrays.toString(a));
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]) {
				a[i]=a[i];
				a[i]=i++;
			}
		}
		System.out.println(a[i]);
	}
}
}
