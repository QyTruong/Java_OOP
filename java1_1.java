import btth1_java.*;
import java.util.*;

public class java1_1 {
    public static void menu(){
        for (int i = 1; i <= 5 ; i++)
            System.out.println(i + ".Bai " + i);
        System.out.println("===================");
    }
    public static void main(String[] args) {
        menu();
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Hay chon muc ban muon xem (0 - thoat): ");
            try {
                choice = sc.nextInt();
            } catch (NoSuchElementException e) {
                System.out.println("Không có giá trị đầu vào hợp lệ.");
            }
            
            switch (choice) {
                case 1: {
                    bt1_1.DoanSo();
                    break;
                }
                case 2: {
                    System.out.println("Ket qua la: " + bt2_1.GiaiPt());
                    break;
                }
            }
            if (choice == 0)
                break;

        } while (1 != 0);
        sc.close();
    }
}
