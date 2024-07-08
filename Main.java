/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
     
        while (i<n1 && j <n2)
        {

            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        
        if(n1>n2){
            while (i < n1)
            arr3[k++] = arr1[i++];
        }
   
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
     
    public static void main (String[] args) 
    {
        int[] arr1 = {1, 2, 5, 7};
        int n1 = arr1.length;
     
        int[] arr2 = {3, 4, 6, 8, 9};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];
         
        mergeArrays(arr1, arr2, n1, n2, arr3);
     
        System.out.println("merged arr");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
