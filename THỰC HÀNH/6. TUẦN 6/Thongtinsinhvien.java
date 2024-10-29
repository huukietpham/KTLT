public class Thongtinsinhvien {
    public static void main(String[] args) {
        String hoTen1 = "Phạm Hữu Kiệt";
        String ngaySinh1 = "14/09/2006";
        String diemTongKet1 = "5.5";
        String tuoi1 = "18";
        Float diemTongKet1Float = Float.parseFloat(diemTongKet1);
        int tuoi1Int = Integer.parseInt(tuoi1);
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen1 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh1 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet1Float + " (Float)");
        System.out.println("Tuổi: " + tuoi1Int + " (Int)");
        System.out.println("-----HẾT-----");
        String hoTen2 = "Phạm Hữu Kiệt";
        String ngaySinh2 = "14/09/2006";
        Float diemTongKet2 = 5.5f;
        int tuoi2 = 18;
        String diemTongKet2String = Float.toString(diemTongKet2);
        String tuoi2String = Integer.toString(tuoi2);
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen2 + " (String)");
        System.out.println("Ngày sinh: " + ngaySinh2 + " (String)");
        System.out.println("Điểm tổng kết: " + diemTongKet2String + " (String)");
        System.out.println("Tuổi: " + tuoi2String + " (String)");
        System.out.println("-----HẾT-----");
    }
}
