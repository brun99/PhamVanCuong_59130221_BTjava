/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4.java;
import java.util.ArrayList;
/**
 *
 * @author Cuong Pham
 */

public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> DSCX = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    
    public void themCX(ChuyenXe cx){
        DSCX.add(cx);
    }
    
    public void inDS(){
        for(int i=0;i<DSCX.size(); i++){
            DSCX.get(i).hienThiTT();
        }
    }
    
    public double tinhDoanhThuNoiThanh(){
        double S = 0;
        for(int i=0;i<DSCX.size(); i++){
            if(DSCX.get(i)  instanceof ChuyenXeNoiThanh){
                S += DSCX.get(i).getDoanhThu();
            }
        }
        return S;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double S = 0;
        for(int i=0;i<DSCX.size(); i++){
            if(DSCX.get(i)  instanceof ChuyenXeNgoaiThanh){
                S += DSCX.get(i).getDoanhThu();
            }
        }
        return S;
    }
    
     public double tongDoanh(){
        double S = 0;
        for(int i=0;i<DSCX.size(); i++){
            S = DSCX.get(i).getDoanhThu();
        }
        return S;
    }
    
}
