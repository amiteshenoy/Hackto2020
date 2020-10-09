import java.util.Scanner;
 
class BubbleSort
{
 public static void main(String...s)
 {
  int a[]=new int[20],n,i,j,temp;
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter how many elements:");
  n=sc.nextInt();
 
  System.out.println("nEnter elements of array:");
  
  for(i=0;i<n;++i)
   a[i]=sc.nextInt();
 
  for(i=1;i<n;++i)
   for(j=0;j<n-i;++j)
   {
    if(a[j]>a[j+1])
    {
     temp=a[j];
     a[j]=a[j+1];
     a[j+1]=temp;
    }
   }
 
  System.out.println("nArray after bubble sort:");
 
  for(i=0;i<n;++i)
   System.out.print(a[i]+" "); 
 }
}  