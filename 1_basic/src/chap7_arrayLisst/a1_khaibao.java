/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap7_arrayLisst;

import java.util.ArrayList;

/**
 *
 * @author chiemhv
 * điểm yếu array: là kích thước mảng cố định
 * array list khắc phục điểm yếu này
 */
public class a1_khaibao {
    
   public static void main(String[] args){
        // khai báo 
         ArrayList<String> names = new ArrayList<>();
        // lấy kích thước 
        int sizename = names.size();
        System.out.println(sizename);
        // gán giá trị phần tử
        names.add("xin chào");
        names.add("deo hieu sao bjo chưa ngu");
        // hiển thị các phần tử trong mảng 
            System.out.println(names);
            
        
         
    }
}
