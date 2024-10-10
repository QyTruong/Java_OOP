package btth1_java;

import java.util.*;;

public class bt1_1 {
    public static void DoanSo(){
        Scanner sc = new Scanner(System.in);
        int rd = (int) (Math.random() * 100);
        int a;
        do {
            System.out.print("Hay nhap so ma ban du doan: ");
            a = sc.nextInt();
            if (a > rd)
                System.out.println("So ban doan lon hon!");
            else if (a < rd)
                System.out.println("So ban doan nho hon!");
        } while (a != rd);
        System.out.println("Ban da doan dung");
        sc.close();
    }
}
