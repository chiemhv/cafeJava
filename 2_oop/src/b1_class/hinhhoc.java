/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_class;

/**
 *
 * @author chiemhv
 */
public class hinhhoc {
// instances
    private String name;
    private float chieuDai;
    private float chieuRong;
// get/set
    public String getName(){
        return name;
    }
    public void setName(String name)throws Exception{
        if(name.trim().equals("")){
            new Exception("name nhap sai roi");
        }else{
            this.name = name;
        }
    }
    public float getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(float chieuDai) throws Exception{
        if(chieuDai <=0){
            new Exception("chieu dai khong hop ");
        }else{
            this.chieuDai = chieuDai;
        }
    }
    public float getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(float chieuRong){
        if(chieuRong<=0){
            new Exception("lôi chiue rong roi");
        }else{
            this.chieuRong= chieuRong;
        }
    }
// create 
    public hinhhoc(){
        
    }
    public hinhhoc(String name, float chieuDai, float chieuRong){
        this.name = name;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
// method string 
@Override
    public String toString(){
        return name;
    }
// nghiệp vụ
    public float TinhDienTich(float chieuDai, float chieuRong){
       float dienTich = chieuDai*chieuRong;
       return dienTich;
    }
}
