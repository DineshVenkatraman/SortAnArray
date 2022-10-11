import java.util.Scanner;
public class SortAnArray {
   public void SortArr()
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the limit");
       int n=s.nextInt();
       int arr[] =new int[n];
       for(int i=0;i<arr.length;i++)
       {
           System.out.println("Enter the "+(i+1)+" Element ");
           arr[i]=s.nextInt();
       }
       int temp=0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]>arr[j])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       for(int no:arr)
           System.out.println(no+" ");
   }

}
