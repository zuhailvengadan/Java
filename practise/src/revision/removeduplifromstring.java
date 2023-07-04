package revision;

public class removeduplifromstring {
	public static void main(String[] args) {
	String a="how are you maan";
	char b[]=a.toCharArray();
      char z='a';
     for (int i = 0; i < b.length; i++) {
    	
		for (int j = i+1; j < b.length; j++) {
			
			if (b[i]==b[j]) {
				b[i]=b[i];
				b[i]=(char) i++;
			}
		}
		System.out.println(b[i]);
	}
}
}