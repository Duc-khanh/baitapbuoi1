import java.util.Scanner;

public class danhgianangluchoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" nhập điểm chuyên cần ");
        double diemChuyenCan = scanner.nextDouble();

        System.out.print(" Nhập điểm kiểm tra ");
        double diemKiemTra = scanner.nextDouble();

        System.out.print(" nhap điểm thi học kỳ ");
        double diemThi = scanner.nextDouble();

        double diemTrungBinh = (diemChuyenCan + diemKiemTra + diemThi) / 3;

        String xepLoai = "";

        if (diemTrungBinh >= 8.5) {
            xepLoai = "A";
        } else if (diemTrungBinh >= 7 && diemTrungBinh < 8.5) {
            xepLoai = "B";
        } else if (diemTrungBinh >= 5.5 && diemTrungBinh < 7) {
            xepLoai = "C";
        } else if (diemTrungBinh >= 4  && diemTrungBinh < 5.5) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }
        System.out.println("Xếp loại điểm của sv là: " + xepLoai);
    }
}