package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringStack {
    public static void stringReverse(Scanner scanner) {
        //Khai báo stack lưu trữ dữ liệu
        Stack<String> stringStack = new Stack<>();
        System.out.print("Nhập chuỗi ký tự: ");
        String str = scanner.nextLine();
        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            //Push thêm dữ liệu vào Stack
            stringStack.push(String.valueOf(str.charAt(i)));
        }
        System.out.println("Chuỗi ban đầu là: " + str);
        for (int i = 0; i < str.length(); i++) {
            //Pop xoá dữ liệu và cộng chuỗi
            String text = stringStack.pop();
            reverseStr += text;
        }
        System.out.println("Chuỗi sau đảo ngược là: " + reverseStr);
    }
}
