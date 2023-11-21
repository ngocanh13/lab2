package lab2;

public class Main {
    public static void main(String[] args) {
        Person a = new Person();
        Student b = new Student();
        Giaovien c = new Giaovien();
        a.setTen("Dang Ngoc Anh");
        a.setNgaysinh(13);
        a.setGioitinh("nu");
        a.setDiachi("Bac Ninh");
        System.out.println("ten:"+ a.getten());
        System.out.println("ngay sinh:"+ a.getNgaysinh());
        System.out.println("giơi tinh:"+ a.getGioitinh());
        System.out.println("dia chi:"+ a.getdiachi());
        a.nhapthongtin();
        a.inthongtin();

        b.nhapthongtin();
        b.inthongtin();

        c.nhapthongtin();
        c.inthongtin();
    }

}
