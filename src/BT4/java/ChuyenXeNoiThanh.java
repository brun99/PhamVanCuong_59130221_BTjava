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
public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private double soKm;

    public ChuyenXeNoiThanh(int soTuyen, double soKm, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
    
    @Override
    public void hienThiTT(){
        super.hienThiTT();
        System.out.println("\nSố tuyến " +soTuyen);
        System.out.println("\nSố km " +soKm);
    }
  
}
