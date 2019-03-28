import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int fact1=1,fact2=1,fact3=1;
      int ld = n%10;
       int sd = ((n/10)%10);
     int fd = n/100;
      for(int i=1;i<=fd;i++)
      {
        fact1 = fact1*i;
	}
      //System.out.println(fact1);
       for(int i=1;i<=sd;i++)
      {
        fact2 = fact2*i;
	  }
     // System.out.println(fact2);
 
       for(int i=1;i<=ld;i++)
      {
        fact3 = fact3*i;
       }
     // System.out.println(fact3);
      
      int ans = fact1+fact2+fact3;
       //System.out.println(ans);
      if(n==ans)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
 }
}  