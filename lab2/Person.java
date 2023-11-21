package lab2;
import java.util.Scanner;

public class Person {
    private String ten;
    private String gioitinh;
    private int ngaysinh;
    private String diachi;
//    public Person(String ten, String gioitinh, int ngaysinh,String diachi){
//        this.ten = ten;
//        this.ngaysinh = ngaysinh;
//        this.gioitinh = gioitinh;
//        this.diachi = diachi;
//    }

    public String getten(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getGioitinh(){
        return gioitinh;
    }
    public void setGioitinh(String gioitinh){
        this.gioitinh= gioitinh;
    }
    public int getNgaysinh(){
        return ngaysinh;
    }
    public void setNgaysinh(int ngaysinh){
        this.ngaysinh = ngaysinh;
    }
    public String getdiachi(){
        return diachi;
    }
    public void setDiachi(String diachi){
        this.diachi = diachi;
    }

    public void nhapthongtin() {
        Scanner a = new Scanner(System.in);
        System.out.println("nhap ten:");
        this.ten = a.nextLine();
        System.out.println("nhap ngaysinh:");
        this.ngaysinh = a.nextInt();
        a.nextLine();
        System.out.println("nhap gioi tinh: ");
        this.gioitinh = a.nextLine();
        System.out.println("nhap dia chi:");
        this.diachi = a.nextLine();
    }
    public void inthongtin(){
        System.out.println("ten: "+ this.ten);
        System.out.println("Ngaysinh:"+ this.ngaysinh);
        System.out.println("Gioi tinh:"+ this.gioitinh);
        System.out.println("Dia chi: "+ this.diachi);
    }

}
