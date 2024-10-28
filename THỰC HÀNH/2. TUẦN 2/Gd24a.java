import java.util.Scanner;
public class Gd24a {
    public static void main(String[] args) {
        // Khai báo các biến
        String tenLop = "GD24A";
        int num1 = 10;
        double num2 = 5.5;
        System.out.println("Xin chào các bạn tân sinh viên lớp " + tenLop);
        System.out.println("Xin chào các bạn tân sinh viên lớp \"" + tenLop + "\"");
        System.out.println("Giá trị của num1 là " + num1);
        System.out.println("Giá trị của num2 là " + num2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên lớp của bạn: ");
        String nhapTenLop = scanner.nextLine();
        System.out.println("Xin chào các bạn tân sinh viên");
        System.out.println("lớp " + nhapTenLop);
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("STT: ");
        int stt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Họ và Tên: ");
        String hoVaTen = scanner.nextLine();
        System.out.print("Lớp: ");
        String lop = scanner.nextLine();
        System.out.println("STT   HỌ VÀ TÊN   LỚP");
        System.out.printf("%-6d%-12s%-10s%n", stt, hoVaTen, lop);
        scanner.close();
    }
}
