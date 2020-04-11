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
public class SinhVienBiz extends SinhVienPoly{
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMarketing, double diemSales) {
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    SinhVienBiz(int i, int i0, String pham_Van_chi, String it) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSales)/3;
    }
    
    
}
