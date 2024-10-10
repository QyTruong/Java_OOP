package btth1_java;

import java.util.*;

public class bt2_1 {
    public static double GiaiPt(){
        double res = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap x: ");
        int x = sc.nextInt();

        System.out.print("Nhap mang: ");
        int []a = new int [n+1];
        for (int i = 0; i <= n; i++)
            a[i] = sc.nextInt();
        
        for (int i = 2; i >= 0; i--){
            res += a[i]*Math.pow(x,i);
        }

        sc.close();
        return res;
    }
}
