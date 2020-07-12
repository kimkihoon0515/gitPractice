package New.Git.Practice;

import java.util.Scanner;

public class num10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        in.close();
        for(int i=0;i<a.length;i++){
            if(a[i]<X){
                System.out.println(a[i]+" ");
            }
        }

    }
}
