package New.Git.Practice;

import java.util.Scanner;

public class num2438 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        for(int i=0 ; i<a;i++)
        {
            for(int j=a;j>i+1;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
