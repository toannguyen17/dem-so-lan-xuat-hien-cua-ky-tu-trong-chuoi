package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        String string = scanner.nextLine();
        System.out.print("\nNhập ký tự muốn đếm: ");
        char kyTu = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi " + string + "là: " + count);
    }
}
