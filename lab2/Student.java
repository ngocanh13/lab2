package lab2;

import java.util.Scanner;

public class Student extends Person{
    private String maSv;
    private float diemthi;
    private String email;
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner b = new Scanner(System.in);
        System.out.println("nhap ma sinh vien:");
        this.maSv = b.nextLine();
        System.out.println("nhap diem thi:");
        this.diemthi = b.nextInt();
        b.nextLine();
        System.out.println("nhap email:");
        this.email = b.nextLine();
    }
    @Override
    public void inthongtin(){
        System.out.println("ma sinh vien:"+ this.maSv);
        System.out.println("diem thi: "+ this.diemthi);
        System.out.println("email: "+ this.email);
    }
    double diemtb;
    public boolean hocbong(double diemtb){
        if(diemtb> 8.0){
            return true;
        }return false;
    }

}
