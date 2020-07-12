package New.Git.Practice;

import java.util.Scanner;

public class num2438 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        for(int i=1 ; i<a+1;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
