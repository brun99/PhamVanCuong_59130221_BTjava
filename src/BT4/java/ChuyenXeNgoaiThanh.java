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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgay;

    public ChuyenXeNgoaiThanh(String noiDen, int soNgay, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    @Override
    public void hienThiTT(){
        super.hienThiTT();
        System.out.println("\nNơi đến: "+ noiDen);
        System.out.println("\nSố Ngày: "+ soNgay);
    }
}