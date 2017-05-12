/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
/**
 *
 * @author oc ssc
 */
public class rubiksTest{
    public static void main(String[] args){
          initialize();
//        rubiks r=new rubiks();
//
////        r.initCube();
//        
////        r.showstatus();
//        r.moveRightUp();
////        r.moveTopClock();
//         r.moveTopClock();
//        r.moveRightDown();
////        r.moveTopAntiClock();
//////        r.moveTopAntiClock();
////        r.moveLeftUp();
//        r.moveBottomClock();
////        r.moveLeftDown();        
////        r.moveBottomAntiClock();
////        r.moveFrontClock();
//////        r.moveFrontAntiClock();
//        r.moveBackClock();
////        r.moveBackAntiClock();
//        r.moveLeftUp();
//////        showNextMove mov=new showNextMove("Hold your cube green face up and white face towards you.");
//        r.solveRubik();
////        
//        r.showstatus();
        
        
//        Scanner scanner=new Scanner(System.in);
//        movement mov=new movement();
//        int i=1;
//        int from=0;
//        int to=0;
//        while(i==1){
//            System.out.printf("%d\n",mov.getmovno(from, to) );
//            from=scanner.nextInt();
//            to=scanner.nextInt();
//            i=scanner.nextInt();
//        }
        
    }
//    @Override
//    public void actionPerformed(ActionEvent event) {
//        Object source = event.getSource();
//
//        if (source instanceof NewJFrame) System.out.println("You clicked a button!");
//    }
    public static void initialize(){
        rubiks rb=new rubiks();
        NewJFrame frame=new NewJFrame();
        rb.currentarray.removeAll(rb.currentarray);
        frame.setVisible(true);
        
        frame.pressContinue(rb);
       
        
    }
        
}
