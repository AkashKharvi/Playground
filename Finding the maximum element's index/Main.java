 import java.util.Scanner;
class Main
{
  public static void main(String []args){
    int max=0;
    int s=0;
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int i=0;i<arr_size;i++)
    {
      arr[i]=in.nextInt();
  }
    arry_find(arr,arr_size,0,0);
}
  public static void arry_find(int arr[],int arr_size,int max,int s)
  {
max=0;
    s=0;
    for(int i=1;i<arr_size;i++)
    {
if(arr[i]> max)
   {
     max=arr[i];
  s=i;
   }
   }
   System.out.println(s);
  }  
} 
     
