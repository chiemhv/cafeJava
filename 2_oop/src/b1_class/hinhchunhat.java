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
public class hinhchunhat extends hinhhoc{
    private float chieucao;
    
    public float getChieuCao(){
        return chieucao;
    }
    public void setChieuCao(float chieucao) throws Exception{
        if(chieucao<=0){
            new Exception("xin chao");
        }else{
            this.chieucao = chieucao;
        }
    }
    public static void main(String[] args) throws Exception{
        hinhchunhat hinh = new hinhchunhat();
        hinh.setName("hinh vuong");
        hinh.setChieuDai(10);
        hinh.setChieuRong(20);
        hinh.setChieuCao(100);
        hinh.TinhDienTich(10, 20);
       System.out.println(hinh.getName()+"----"+hinh.TinhDienTich(20, 20));
    }
}
