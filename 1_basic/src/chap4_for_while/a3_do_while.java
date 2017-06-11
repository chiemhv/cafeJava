/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4_for_while;

/**
 *
 * @author chiemhv
 * cơ chế: 
 * do-while : nó sẽ thực thi trước --> rồi mới kiểm tra đk sau 
 * ---> bét nhất là nó sẽ thực thi được 1 lần. 
 */
public class a3_do_while {
    public static void main(String[] args){
      //TH1: LẶP VĨNH VIỄN
      int x =10;
      do{
          System.out.println("x la 10");
          
      }while(x==10);
      // TH2: THỰC HIỆN DO 1 LẦN,
      int y =2;
      do{
          System.out.println("y la 2");
      }while(y==2);
    }
}
