/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4_for_while;

/**
 *
 * @author chiemhv
 * là vòng lặp xác định được số lần lặp từ điểm min tới điểm max 
 * vòng lặp xac định thoả mãn 1 điều kiện nào đó 
 */
public class a1_for {
 
    public static void main(String[] args){
        int sum=0;
        for(int i=0; i<10;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
