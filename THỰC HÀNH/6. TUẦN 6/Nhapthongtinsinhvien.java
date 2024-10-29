import java.util.Scanner;
public class Nhapthongtinsinhvien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên (Trường hợp 1):");
        String hoTen1 = scanner.nextLine();
        System.out.println("Nhập ngày sinh (Trường hợp 1):");
        String ngaySinh1 = scanner.nextLine();
        System.out.println("Nhập điểm tổng kết (dạng chuỗi) (Trường hợp 1):");
        String diemTongKet1 = scanner.nextLine();
        System.out.println("Nhập tuổi (dạng chuỗi) (Trường hợp 1):");
        String tuoi1 = scanner.nextLine();
        Float diemTongKet1Float = Float.parseFloat(diemTongKet1);
        int tuoi1Int = Integer.parseInt(tuoi1);
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet1Float + " (Float)");
        System.out.println("Tuổi: " + tuoi1Int + " (Int)");
        System.out.println("-----HẾT-----");
        System.out.println("Nhập họ và tên (Trường hợp 2):");
        String hoTen2 = scanner.nextLine();
        System.out.println("Nhập ngày sinh (Trường hợp 2):");
        String ngaySinh2 = scanner.nextLine();
        System.out.println("Nhập điểm tổng kết (dạng số thực) (Trường hợp 2):");
        Float diemTongKet2 = scanner.nextFloat();
        System.out.println("Nhập tuổi (dạng số nguyên) (Trường hợp 2):");
        int tuoi2 = scanner.nextInt();
        String diemTongKet2String = Float.toString(diemTongKet2);
        String tuoi2String = Integer.toString(tuoi2);
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet2String + " (String)");
        System.out.println("Tuổi: " + tuoi2String + " (String)");
        System.out.println("-----HẾT-----");
        scanner.close();
    }
}