package z;



public class prc {
	public static void main(String[] args) {
		
	
	// String reverse
//	String n="Bhanu";
//	String rev="" ;
//	for(int i =n.length()-1;i>=0;i--){
//         rev=rev+n.charAt(i);
//}
//System.out.print(rev);

//	int n =121;
//	int r=0;
//	int z=n;
//	int sum=0;
//	while(z>0){
//	r=z%10;
//	sum=(sum*10)+r;
//	z=z/10;
//	}
//	
//	if(sum==n){
//	System.out.print("NO. is palindrome");
		
	
		
//		for(int i=1;i<=100;i++){
//			int z=i;
//			int sum = 0;
//			while(z>0) {
//				int r=z%10;
//				 sum=(sum*10)+r;
//				z=z/10;
//			}
//			if(sum==i) {
//				System.out.println(i);
//			}

		  

//		int [] a={1,2,3,4,5,6,7,8,9};
//		int max=0;
//
//		for(int i=0;i<a.length;i++){
//		for(int j=i+1;j<a.length;j++){
//		if(a[i]<a[j]){
//		max=a[j];
//		}
//		
//}
//		
//}System.out.print(max);
		
		//fabonic series -  0 1 1 2 3 5 8 13

//		int a =0;
//		int b=1;
//		int c=0;
//		System.out.print(a+","+b);
//		for(int i=0; i<=11; i++)
//		{
//		
//		c=a+b;
//		System.out.print(","+c);
//		a=b;
//		b=c;
//		}
//		int a[]={1,2,3,4,5,6,7,8,9};
//		for(int i=0; i<a.length; i++)
//		{
//		for(int j=1+i; j<a.length; j++)
//		{
//		if(a[i]<a[j]){
//	    int temp = a[i];  
//		a[i]=a[j];      
//		a[j]=temp;    
//		}
//		}
//		}
//		
//		System.out.println(Arrays.toString(a));
		
		// Split alpha, numeric, special from string
		
//		String str = "bhanu123@#%";
//		StringBuilder aplha = new StringBuilder(), number = new StringBuilder(),special = new StringBuilder();
//		for(int i=0; i<str.length();i++) {
//			if(Character.isAlphabetic(str.charAt(i))) {
//			aplha.append(str.charAt(i));
//			}
//			else if (Character.isDigit(str.charAt(i))) {
//				number.append(str.charAt(i));
//			}
//			else {
//				special.append(str.charAt(i));
//			}
//		}
//		System.out.println(aplha);
//		System.out.println(number);
//		System.out.println(special);
		
		
		String n= "aQbc#$24@57";
		// print only special charater
	System.out.println(n.replaceAll("[a-zA-Z0-9]", ""));
	//print only number
	System.out.println(n.replaceAll("[^0-9]", ""));
	//print only character
	System.out.println(n.replaceAll("[^a-zA-Z]", ""));
	//print all except special character
	System.out.println(n.replaceAll("[^a-zA-Z0-9]", ""));
	}
}
