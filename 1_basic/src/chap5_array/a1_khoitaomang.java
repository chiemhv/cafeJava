/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap5_array;

/**
 *
 * @author chiemhv
 * mảng để lưu trữ 1 tập dữ liệu 
 * có 2 cách khởi tạo  mảng: 
 * cách 1: khởi tạo trước gán gía trị sau
 * cách 2: vừa khởi tạo vừa gán giá trị
 */
public class a1_khoitaomang {
    
    public static void main(String[] args){
        // CÁCH 1 : THEO CHUẢN 
        int[] diem = new int[5];
        diem[0]=2;
        diem[1]=3;
        diem[2]=5;
        diem[3]=6;
        diem[4]=10;
        System.out.println("gia tri la :"+diem[1]);
       // CÁCH 2: VỪA TẠO VỪA GÁN LUÔN 
       int[] SBD = {0, 1, 5, 3, 6, 9};
       System.out.println("gia tri pt thu 2 la:"+SBD[1]);
    }
    
}
