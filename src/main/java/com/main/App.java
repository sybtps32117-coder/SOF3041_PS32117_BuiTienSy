//Đây là class app dùng để xử lý các phép toám cơ bản
//không in ra màn hình
//Được gọi từ JUnit Test để kiểm tra đúng/sai

package com.main;

public class App {

    // Cộng - sô nguyên a và b
    public static int add(int a, int b) {
        return a + b;
    }

    // Trừ
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Nhân
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Chia
    public static int divide(int a, int b) {
        //khong thể chia cho 0
        if (b == 0) {
            // Nếu b = 0 thì ném lỗi ra ngoài
            throw new IllegalArgumentException("Không được chia cho 0");
        }
        //Nếu B khác 0 thực hiện phép tính
        return a / b;
    }
}
