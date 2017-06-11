/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chap1_variAndConst;

/**
 *
 * @author chiemhv
 */
public class vari {
    static int a, b ;
    public static void main(String[] args){
        a = 10;
        b = 20;
        int c = a +b;
        System.out.println(c);
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        int sum =1;
        for(int i=1; i<=8;i++){
            sum = sum*2;
            
        }
        System.out.println(sum);
    }
    
}
