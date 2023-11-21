package lab2;

import java.util.Scanner;

public class Giaovien extends Person{
    private String danhsachlop;
    private double mucluong;
    private int somon;
    private String cacmon;
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner c = new Scanner(System.in);
        System.out.println("nhap danh sach lop:");
        danhsachlop = c.nextLine();
        System.out.println("nhap luong:");
        mucluong = c.nextDouble();
        System.out.println("nhap so mon:" );
        somon = c.nextInt();
        c.nextLine();
        System.out.println("nhap cac mon:");
        cacmon = c.nextLine();

    }
    @Override
    public void inthongtin(){
        System.out.println("danh sach lop:"+danhsachlop);
        System.out.println("luong:"+mucluong);
        System.out.println("so mon:"+somon);
        System.out.println("cac mon:"+cacmon);

    }

}
