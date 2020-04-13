/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4.java;

/**
 *
 * @author Cuong Pham
 */
public class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTX;
    protected String soXe;
    protected double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
     public void hienThiTT(){
        System.out.print("\nMã số chuyến : " + maSoChuyen);
        System.out.print("\ntên TX : " + hoTenTX);
        System.out.print("\nSố xe: : " + soXe);
        System.out.print("\ndoanh thu : " + doanhThu);
        
        
     }
}