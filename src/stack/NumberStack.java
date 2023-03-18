package stack;

import java.util.Scanner;
import java.util.Stack;

public class NumberStack {
    public static void intReverseStack(Scanner scanner) {
        //Khai báo mảng gốc và mảng đảo ngược với kiểu dữ liệu Integer
        Stack<Integer> numberStack = new Stack<>();
        Stack<Integer> numberReverseStack = new Stack<>();
        System.out.print("Nhập kích thước của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < size; i++) {
            //Vòng lặp for, push từng phần tử vào mảng
            System.out.printf("Nhập phần tử thứ %d: ", (i + 1));
            numberStack.push(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Mảng ban đầu là: " + numberStack);

        for (int i = 0; i < size; i++) {
            //Pop để xoá và lấy phần tử cuối trong mảng => push lại vào mảng đảo ngược
            int popNumber = numberStack.pop();
            numberReverseStack.push(popNumber);
        }
        System.out.println("Mảng đảo ngược là: " + numberReverseStack);
    }

}
