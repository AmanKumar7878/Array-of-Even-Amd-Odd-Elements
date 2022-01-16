import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddElementsInArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i <3 ; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(arr[i][j]%2==0)
                {
                    ar1.add(arr[i][j]);
                }
                else
                {
                    ar2.add(arr[i][j]);
                }
            }

        }
        System.out.println("Array of Even Elements:");
        for (Integer res:ar1)
        {
            System.out.print(res+" ");

        }
        System.out.println();
        System.out.println("Array of odd Elements:");
        for(Integer res1:ar2)
        {
            System.out.print(res1+" ");

        }


    }
}