package exercice4;

public class romain {

 public static void main(String[] args) {
	for(int i=1;i<51;i++) {
		 afficher(i);
	 }
 }

public static void afficher(int j) {
 
// for(int a=0;a<4;a++) {
	 
	 if(j==1) System.out.println('I');
	 else {
		 if(j==5)System.out.println('V');
		 if(j==10)System.out.println('X');
		 if(j==50)System.out.println('L');
		 if(j==2||j==3){ afficher(j+1) ;}
	 }
}
}
//}
