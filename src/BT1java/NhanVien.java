/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1java;

/**
 *
 * @author Cuong Pham
 */
public class NhanVien {
    String Ten;
    int Tuoi;
    String DiaChi;
    double TienLuong;
    int Gio;

    public NhanVien() {
    }

    public NhanVien(String Ten, int Tuoi,String DiaChi, double TienLuong, int Gio) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.Gio = Gio;
      
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public int getGio() {
        return Gio;
    }

    public void setGio(int Gio) {
        this.Gio = Gio;
    }
    


    public void getThongTin(){
        System.out.println("Ten Nhan Vien :" + Ten);
        System.out.println("Tuoi :" + Tuoi);
        System.out.println("Dia chi :" + DiaChi);
        System.out.println("Tien Luong  :" + TienLuong);
        System.out.println("Tong gio lam :" + Gio);
        System.out.println("Tien Thuong :" + TinhThuong());
    }
    public double TinhThuong(){
        if(Gio < 100)
            return 0;
        else if(100 <= Gio && Gio < 200)
            return TienLuong * 0.1;
        return TienLuong * 0.2;
    }
}
