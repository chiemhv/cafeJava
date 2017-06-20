/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_dahinh;

/**
 *
 * @author chiemhv
 */
public class hinhvuong extends hinh{
    private  float cao;

    public float getCao() {
        return cao;
    }

    public void setCao(float cao) {
        this.cao = cao;
    }
@Override
    public void hienthi(){
        super.hienthi();
        System.out.println("the deo nao la the deo nao");
    }
    public static void main(String[] args){
        hinhvuong hinh = new hinhvuong();
        hinh.setName("hinh vuong nhe");
        hinh.setDai(10);
        hinh.setRong(10);
        hinh.setCao(20);
        hinh.hienthi();
    }
}
