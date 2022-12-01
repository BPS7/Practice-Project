package z;

public class ar {
	public static void main(String[] args) {
		 int[]a= {2,2,2,2,4,1};
		 int sumDouble=0;
		 int multiply=0;
		 for(int i=0;i<a.length;i++) {
			 sumDouble= sumDouble+a[i]*2;	 
			 
		 }
		 for(int j=0;j<a.length;j++) {
			 for(int k=1;k<a.length;k++) {
				 
			 multiply=a[j]*a[k];
			 if(multiply>sumDouble) {
				 System.out.println(true);
			 }
			 else {
				 System.out.println(false);
			 }
		 }
		
		 
	}

}
}