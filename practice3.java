package New.Git.Practice;

import java.util.Scanner;

public class practice3 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int b = in.nextInt();
            int c = in.nextInt();
            sum = c + b;
            System.out.println(sum);
        }
        in.close();
    }
}
