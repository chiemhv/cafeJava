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
public class hinh {
    private String name;
    private float dai;
    private float rong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
// 
    public hinh(){
        
    }
    public hinh(String name, float dai, float rong){
        this.name = name;
        this.dai = dai;
        this.rong = rong;
    }
// 
@Override
    public String toString(){
        return name;
    }
//
    public float dientich(float dai, float rong){
        float dientich = dai*rong;
        return dientich;
    }
    public void hienthi(){
        System.out.println(name);
        System.out.println(dai);
        System.out.println(rong);
    }
}
