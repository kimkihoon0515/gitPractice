package New.Git.Practice;

import java.util.Scanner;

public class num2742 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        for(int i=0;i<a;i++)
        {
            System.out.println(a-i);
        }
    }
}
