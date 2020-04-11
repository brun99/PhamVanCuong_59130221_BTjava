/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.java;

/**
 *
 * @author Cuong Pham
 */
public abstract class SinhVienPoly {
    public String HoTen;
    public String Nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String HoTen, String Nganh) {
        this.HoTen = HoTen;
        this.Nganh = Nganh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    public abstract double getDiem();
    public  String getHocLuc(){
        if(getDiem() < 5)   return "Yếu";
        if(5<=getDiem() && getDiem()<6.5) return "Trung Bình";
        if(6.5<=getDiem() && getDiem()<7.5) return "Khá";
        if(7.5<=getDiem() && getDiem()<9) return "Giỏi";
        return "Xuất Sắc";
    }
    public void Xuat(){
    System.out.println("Họ Tên SV :" +HoTen);
    System.out.println("Ngành Học :" +Nganh);
    System.out.println("điểm môn học :" + getDiem());
    System.out.println("Học Lực SV :" + getHocLuc());
    }
}
