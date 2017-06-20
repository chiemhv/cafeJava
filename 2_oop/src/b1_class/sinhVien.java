/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_class;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chiemhv
 */
public class sinhVien {
    
//b1: create new instances
   private String name;
   private String SBD;
   private float diemToan;
   private float diemVan;
//b2: create method get/set
   public static void main(String[] args){
       try {
           sinhVien sv = new sinhVien();
           sv.setName("hà văn chiêm");
           sv.setSBD("CH");
           sv.setDiemToan(10);
           sv.setDiemVan(9);
           float tb = sv.diemTB(sv.getDiemToan(), sv.getDiemVan());
           
          System.out.println(sv.getName()+" có SBD "+sv.getSBD()+" có điểm TB là: "+tb);
       } catch (Exception ex) {
           Logger.getLogger(sinhVien.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
   public String getName(){
       return name;
   }
   public void setName(String name)throws Exception{
       if(name.trim().equals("")){
           new Exception("NAME NO RỖNG");
       }else{
          this.name = name;
       }
    }
   public String getSBD(){
        return SBD;
   }
   public void setSBD(String SBD) throws Exception{
       if(SBD.trim().equals("")){
           new Exception(" so bao danh không hợp lệ");
       }else{
           this.SBD=SBD;
       }
   }
   public float getDiemToan(){
       return diemToan;
   }
   public void setDiemToan(float diemToan) throws Exception{
       if(diemToan <0 && diemToan>10){
           new Exception("diem toan khong họp ");
       }else{
           this.diemToan = diemToan;
       }
   }
   public float getDiemVan(){
       return diemVan;
   }
   public void setDiemVan(float diemVan) throws Exception{
       if(diemVan<0 && diemVan>10){
           new Exception("diem van khong hop le");
       }else{
           this.diemVan = diemVan;
       }
   }
//method khoi tao doi tuong
   public sinhVien(){}// loại ko tham số
   public sinhVien(String name, String SBD, float diemToan, float diemVan) throws Exception{
       setName(name);
       setSBD(SBD);
       setDiemVan(diemToan);
       setDiemToan(diemVan);
   }
// method bussiness
   public float diemTB(float diemToan, float diemVan) throws Exception{
       float tb = (diemToan+diemVan)/2;
       return tb;
   }
}
