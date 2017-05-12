/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author oc ssc
 */
public class rubiks {
    ArrayList<cubbis> currentarray=new ArrayList();
    bfsVertex[] distanceArray=new bfsVertex[12];
    public rubiks(){
       //initialize as green top white front
        
        for(int i=0;i<=25;i++){
            cubbis currentcube=new cubbis();
            switch(i){
                case 0:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setleftcolor("red");
                    currentcube.setbackcolor("yellow");
                    currentarray.add(currentcube);
                    break;
                case 1:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setbackcolor("yellow");
                    currentarray.add(currentcube);
                    break;
                case 2:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setbackcolor("yellow");
                    currentcube.setrightcolor("orange");
                    currentarray.add(currentcube);
                    break;
                case 3:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setleftcolor("red");
                    currentarray.add(currentcube);
                    break;
                case 4:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentarray.add(currentcube);
                    break;
                case 5:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setrightcolor("orange");
                    currentarray.add(currentcube);
                    break;
                case 6:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setleftcolor("red");
                    currentcube.setfrontcolor("white");
                    currentarray.add(currentcube);
                    break;
                case 7:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setfrontcolor("white");
                    currentarray.add(currentcube);
                    break;
                case 8:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.settopcolor("green");
                    currentcube.setfrontcolor("white");
                    currentcube.setrightcolor("orange");
                    currentarray.add(currentcube);
                    break;
                case 9:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setleftcolor("red");
                    currentcube.setbackcolor("yellow");
                    currentarray.add(currentcube);
                    break;
                case 10:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setbackcolor("yellow");
                    currentarray.add(currentcube);
                    break;
                case 11:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setbackcolor("yellow");
                    currentcube.setrightcolor("orange");
                    currentarray.add(currentcube);
                    break;
                case 12:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setleftcolor("red");
                    currentarray.add(currentcube);
                    break;
                case 13:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setrightcolor("orange");
                    currentarray.add(currentcube);
                    break;
                case 14:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setleftcolor("red");
                    currentcube.setfrontcolor("white");
                    currentarray.add(currentcube);
                    break;
                case 15:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setfrontcolor("white");
                    currentarray.add(currentcube);
                    break;
                case 16:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setrightcolor("orange");
                    currentcube.setfrontcolor("white");
                    currentarray.add(currentcube);
                    break;
                case 17:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setleftcolor("red");
                    currentcube.setbackcolor("yellow");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 18:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setbackcolor("yellow");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 19:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setbackcolor("yellow");
                    currentcube.setrightcolor("orange");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 20:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setleftcolor("red");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 21:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 22:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setrightcolor("orange");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 23:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setleftcolor("red");
                    currentcube.setfrontcolor("white");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 24:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setfrontcolor("white");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                case 25:
                    currentcube.setposn(i);
                    currentcube.setcurposn(i);
                    currentcube.setfrontcolor("white");
                    currentcube.setrightcolor("orange");
                    currentcube.setbottomcolor("blue");
                    currentarray.add(currentcube);
                    break;
                      
                
            }
                    
        }
        
    }
//    public void initCube(){
////        currentarray.removeAll(currentarray);
////        NewJFrame frame=new NewJFrame();
////        frame.setVisible(true);
//        for(int i=0;i<26;i++){
//            cubbis cube=new cubbis();
//            cube=this.getItem(i);
//            currentarray.add(cube);
//            
//        }
//        
//       
//    }
    public void showstatus(){
//        cubbis c=new cubbis();
//        rubiksarray.set(2,c);
//        System.out.printf("posn is %d", c.getIndex());
//       int i=0;
            
            for(cubbis s:currentarray){
                
                System.out.printf("current posn %d,actual posn %d, topcolor %s, bottomcolor %s, left color %s, right color %s, front color %s, backcolor %s\n", 
                        s.getcurposn(),s.getIndex(),s.gettopcolor(),s.getbottomcolor(),s.getleftcolor(),s.getrightcolor(),s.getfrontcolor(),s.getbackcolor());
//                i++;
            }
        
    }
    public void moveRightUp(){
        showNextMove mov=new showNextMove("Move right face upwards.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(2);
        currentface[1]=currentarray.get(5);
        currentface[2]=currentarray.get(8);
        currentface[3]=currentarray.get(16);
        currentface[4]=currentarray.get(25);
        currentface[5]=currentarray.get(22);
        currentface[6]=currentarray.get(19);
        currentface[7]=currentarray.get(11);
        
        currentface[0].setbottomcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(null);
        currentarray.set(19, currentface[0]);
        currentface[0].setcurposn(19);
        
        currentface[1].setbackcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(11, currentface[1]);
        currentface[1].setcurposn(11);
        
        currentface[2].setbackcolor(currentface[2].gettopcolor());        
        currentface[2].settopcolor(currentface[2].getfrontcolor());
        currentface[2].setfrontcolor(null);
        currentarray.set(2, currentface[2]);
        currentface[2].setcurposn(2);
        
        currentface[3].settopcolor(currentface[3].getfrontcolor());
        currentface[3].setfrontcolor(null);      
        currentarray.set(5, currentface[3]);
        currentface[3].setcurposn(5);
        
        currentface[4].settopcolor(currentface[4].getfrontcolor());        
        currentface[4].setfrontcolor(currentface[4].getbottomcolor());
        currentface[4].setbottomcolor(null);
        currentarray.set(8, currentface[4]);
        currentface[4].setcurposn(8);
        
        currentface[5].setfrontcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(16, currentface[5]);
        currentface[5].setcurposn(16);
        
        currentface[6].setfrontcolor(currentface[6].getbottomcolor());        
        currentface[6].setbottomcolor(currentface[6].getbackcolor());
        currentface[6].setbackcolor(null);
        currentarray.set(25, currentface[6]);
        currentface[6].setcurposn(25);
        
        currentface[7].setbottomcolor(currentface[7].getbackcolor());   
        currentface[7].setbackcolor(null);
        currentarray.set(22, currentface[7]); 
        currentface[7].setcurposn(22);
    }
    public void moveRightDown(){
        showNextMove mov=new showNextMove("Move right face downwards.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(2);
        currentface[1]=currentarray.get(5);
        currentface[2]=currentarray.get(8);
        currentface[3]=currentarray.get(16);
        currentface[4]=currentarray.get(25);
        currentface[5]=currentarray.get(22);
        currentface[6]=currentarray.get(19);
        currentface[7]=currentarray.get(11);
        
        currentface[0].setfrontcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(null);
        currentarray.set(8, currentface[0]);
        currentface[0].setcurposn(8);
        
        currentface[1].setfrontcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(16, currentface[1]);
        currentface[1].setcurposn(16);
        
        currentface[2].setbottomcolor(currentface[2].getfrontcolor());        
        currentface[2].setfrontcolor(currentface[2].gettopcolor());
        currentface[2].settopcolor(null);
        currentarray.set(25, currentface[2]);
        currentface[2].setcurposn(25);
        
        currentface[3].setbottomcolor(currentface[3].getfrontcolor());
        currentface[3].setfrontcolor(null);      
        currentarray.set(22, currentface[3]);
        currentface[3].setcurposn(22);
        
        currentface[4].setbackcolor(currentface[4].getbottomcolor());        
        currentface[4].setbottomcolor(currentface[4].getfrontcolor());
        currentface[4].setfrontcolor(null);
        currentarray.set(19, currentface[4]);
        currentface[4].setcurposn(19);
        
        currentface[5].setbackcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(11, currentface[5]);
        currentface[5].setcurposn(11);
        
        currentface[6].settopcolor(currentface[6].getbackcolor());        
        currentface[6].setbackcolor(currentface[6].getbottomcolor());
        currentface[6].setbottomcolor(null);
        currentarray.set(2, currentface[6]);
        currentface[6].setcurposn(2);
        
        currentface[7].settopcolor(currentface[7].getbackcolor());   
        currentface[7].setbackcolor(null);
        currentarray.set(5, currentface[7]); 
        currentface[7].setcurposn(5);
    }
    public void moveLeftUp(){
        showNextMove mov=new showNextMove("Move left face upwards.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(0);
        currentface[1]=currentarray.get(3);
        currentface[2]=currentarray.get(6);
        currentface[3]=currentarray.get(14);
        currentface[4]=currentarray.get(23);
        currentface[5]=currentarray.get(20);
        currentface[6]=currentarray.get(17);
        currentface[7]=currentarray.get(9);
        
        currentface[0].setbottomcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(null);
        currentarray.set(17, currentface[0]);
        currentface[0].setcurposn(17);
        
        currentface[1].setbackcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(9, currentface[1]);
        currentface[1].setcurposn(9);
        
        currentface[2].setbackcolor(currentface[2].gettopcolor());        
        currentface[2].settopcolor(currentface[2].getfrontcolor());
        currentface[2].setfrontcolor(null);
        currentarray.set(0, currentface[2]);
        currentface[2].setcurposn(0);
        
        currentface[3].settopcolor(currentface[3].getfrontcolor());
        currentface[3].setfrontcolor(null);      
        currentarray.set(3, currentface[3]);
        currentface[3].setcurposn(3);
        
        currentface[4].settopcolor(currentface[4].getfrontcolor());        
        currentface[4].setfrontcolor(currentface[4].getbottomcolor());
        currentface[4].setbottomcolor(null);
        currentarray.set(6, currentface[4]);
        currentface[4].setcurposn(6);
        
        currentface[5].setfrontcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(14, currentface[5]);
        currentface[5].setcurposn(14);
        
        currentface[6].setfrontcolor(currentface[6].getbottomcolor());        
        currentface[6].setbottomcolor(currentface[6].getbackcolor());
        currentface[6].setbackcolor(null);
        currentarray.set(23, currentface[6]);
        currentface[6].setcurposn(23);
        
        currentface[7].setbottomcolor(currentface[7].getbackcolor());   
        currentface[7].setbackcolor(null);
        currentarray.set(20, currentface[7]);   
        currentface[7].setcurposn(20);
    }
    public void moveLeftDown(){
        showNextMove mov=new showNextMove("Move left face downwards.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(0);
        currentface[1]=currentarray.get(3);
        currentface[2]=currentarray.get(6);
        currentface[3]=currentarray.get(14);
        currentface[4]=currentarray.get(23);
        currentface[5]=currentarray.get(20);
        currentface[6]=currentarray.get(17);
        currentface[7]=currentarray.get(9);
        
        currentface[0].setfrontcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(null);
        currentarray.set(6, currentface[0]);
        currentface[0].setcurposn(6);
        
        currentface[1].setfrontcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(14, currentface[1]);
        currentface[1].setcurposn(14);
        
        currentface[2].setbottomcolor(currentface[2].getfrontcolor());        
        currentface[2].setfrontcolor(currentface[2].gettopcolor());
        currentface[2].settopcolor(null);
        currentarray.set(23, currentface[2]);
        currentface[2].setcurposn(23);
        
        currentface[3].setbottomcolor(currentface[3].getfrontcolor());
        currentface[3].setfrontcolor(null);      
        currentarray.set(20, currentface[3]);
        currentface[3].setcurposn(20);
        
        currentface[4].setbackcolor(currentface[4].getbottomcolor());        
        currentface[4].setbottomcolor(currentface[4].getfrontcolor());
        currentface[4].setfrontcolor(null);
        currentarray.set(17, currentface[4]);
        currentface[4].setcurposn(17);
        
        currentface[5].setbackcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(9, currentface[5]);
        currentface[5].setcurposn(9);
        
        currentface[6].settopcolor(currentface[6].getbackcolor());        
        currentface[6].setbackcolor(currentface[6].getbottomcolor());
        currentface[6].setbottomcolor(null);
        currentarray.set(0, currentface[6]);
        currentface[6].setcurposn(0);
        
        currentface[7].settopcolor(currentface[7].getbackcolor());   
        currentface[7].setbackcolor(null);
        currentarray.set(3, currentface[7]); 
        currentface[7].setcurposn(3);
    }
    public void moveTopClock(){
        showNextMove mov=new showNextMove("Move top face clockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(0);
        currentface[1]=currentarray.get(1);
        currentface[2]=currentarray.get(2);
        currentface[3]=currentarray.get(5);
        currentface[4]=currentarray.get(8);
        currentface[5]=currentarray.get(7);
        currentface[6]=currentarray.get(6);
        currentface[7]=currentarray.get(3);
        
        currentface[0].setrightcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(null);
        currentarray.set(2, currentface[0]);
        currentface[0].setcurposn(2);
        
        currentface[1].setrightcolor(currentface[1].getbackcolor());
        currentface[1].setbackcolor(null);      
        currentarray.set(5, currentface[1]);
        currentface[1].setcurposn(5);
        
        currentface[2].setfrontcolor(currentface[2].getrightcolor());        
        currentface[2].setrightcolor(currentface[2].getbackcolor());
        currentface[2].setbackcolor(null);
        currentarray.set(8, currentface[2]);
        currentface[2].setcurposn(8);
        
        currentface[3].setfrontcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(7, currentface[3]);
        currentface[3].setcurposn(7);
        
        currentface[4].setleftcolor(currentface[4].getfrontcolor());        
        currentface[4].setfrontcolor(currentface[4].getrightcolor());
        currentface[4].setrightcolor(null);
        currentarray.set(6, currentface[4]);
        currentface[4].setcurposn(6);
        
        currentface[5].setleftcolor(currentface[5].getfrontcolor());        
        currentface[5].setfrontcolor(null);
        currentarray.set(3, currentface[5]);
        currentface[5].setcurposn(3);
        
        currentface[6].setbackcolor(currentface[6].getleftcolor());        
        currentface[6].setleftcolor(currentface[6].getfrontcolor());
        currentface[6].setfrontcolor(null);
        currentarray.set(0, currentface[6]);
        currentface[6].setcurposn(0);
        
        currentface[7].setbackcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(1, currentface[7]);
        currentface[7].setcurposn(1);
    }
    public void moveTopAntiClock(){
        showNextMove mov=new showNextMove("Move top face anticlockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(0);
        currentface[1]=currentarray.get(1);
        currentface[2]=currentarray.get(2);
        currentface[3]=currentarray.get(5);
        currentface[4]=currentarray.get(8);
        currentface[5]=currentarray.get(7);
        currentface[6]=currentarray.get(6);
        currentface[7]=currentarray.get(3);
        
        currentface[0].setfrontcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(null);
        currentarray.set(6, currentface[0]);
        currentface[0].setcurposn(6);
        
        currentface[1].setleftcolor(currentface[1].getbackcolor());
        currentface[1].setbackcolor(null);      
        currentarray.set(3, currentface[1]);
        currentface[1].setcurposn(3);
        
        currentface[2].setleftcolor(currentface[2].getbackcolor());        
        currentface[2].setbackcolor(currentface[2].getrightcolor());
        currentface[2].setrightcolor(null);
        currentarray.set(0, currentface[2]);
        currentface[2].setcurposn(0);
        
        currentface[3].setbackcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(1, currentface[3]);
        currentface[3].setcurposn(1);
        
        currentface[4].setbackcolor(currentface[4].getrightcolor());        
        currentface[4].setrightcolor(currentface[4].getfrontcolor());
        currentface[4].setfrontcolor(null);
        currentarray.set(2, currentface[4]);
        currentface[4].setcurposn(2);
        
        currentface[5].setrightcolor(currentface[5].getfrontcolor());        
        currentface[5].setfrontcolor(null);
        currentarray.set(5, currentface[5]);
        currentface[5].setcurposn(5);
        
        currentface[6].setrightcolor(currentface[6].getfrontcolor());        
        currentface[6].setfrontcolor(currentface[6].getleftcolor());
        currentface[6].setleftcolor(null);
        currentarray.set(8, currentface[6]);
        currentface[6].setcurposn(8);
        
        currentface[7].setfrontcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(7, currentface[7]);
        currentface[7].setcurposn(7);
    }
    public void moveBottomClock(){
        showNextMove mov=new showNextMove("Move bottom face clockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(17);
        currentface[1]=currentarray.get(18);
        currentface[2]=currentarray.get(19);
        currentface[3]=currentarray.get(22);
        currentface[4]=currentarray.get(25);
        currentface[5]=currentarray.get(24);
        currentface[6]=currentarray.get(23);
        currentface[7]=currentarray.get(20);
        
        currentface[0].setrightcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(null);
        currentarray.set(19, currentface[0]);
        currentface[0].setcurposn(19);
        
        currentface[1].setrightcolor(currentface[1].getbackcolor());
        currentface[1].setbackcolor(null);      
        currentarray.set(22, currentface[1]);
        currentface[1].setcurposn(22);
        
        currentface[2].setfrontcolor(currentface[2].getrightcolor());        
        currentface[2].setrightcolor(currentface[2].getbackcolor());
        currentface[2].setbackcolor(null);
        currentarray.set(25, currentface[2]);
        currentface[2].setcurposn(25);
        
        currentface[3].setfrontcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(24, currentface[3]);
        currentface[3].setcurposn(24);
        
        currentface[4].setleftcolor(currentface[4].getfrontcolor());        
        currentface[4].setfrontcolor(currentface[4].getrightcolor());
        currentface[4].setrightcolor(null);
        currentarray.set(23, currentface[4]);
        currentface[4].setcurposn(23);
        
        currentface[5].setleftcolor(currentface[5].getfrontcolor());        
        currentface[5].setfrontcolor(null);
        currentarray.set(20, currentface[5]);
        currentface[5].setcurposn(20);
        
        currentface[6].setbackcolor(currentface[6].getleftcolor());        
        currentface[6].setleftcolor(currentface[6].getfrontcolor());
        currentface[6].setfrontcolor(null);
        currentarray.set(17, currentface[6]);
        currentface[6].setcurposn(17);
        
        currentface[7].setbackcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(18, currentface[7]);
        currentface[7].setcurposn(18);
    }
    public void moveBottomAntiClock(){
        showNextMove mov=new showNextMove("Move bottom face anticlockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(17);
        currentface[1]=currentarray.get(18);
        currentface[2]=currentarray.get(19);
        currentface[3]=currentarray.get(22);
        currentface[4]=currentarray.get(25);
        currentface[5]=currentarray.get(24);
        currentface[6]=currentarray.get(23);
        currentface[7]=currentarray.get(20);
        
        currentface[0].setfrontcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(currentface[0].getbackcolor());
        currentface[0].setbackcolor(null);
        currentarray.set(23, currentface[0]);
        currentface[0].setcurposn(23);
        
        currentface[1].setleftcolor(currentface[1].getbackcolor());
        currentface[1].setbackcolor(null);      
        currentarray.set(20, currentface[1]);
        currentface[1].setcurposn(20);
        
        currentface[2].setleftcolor(currentface[2].getbackcolor());        
        currentface[2].setbackcolor(currentface[2].getrightcolor());
        currentface[2].setrightcolor(null);
        currentarray.set(17, currentface[2]);
        currentface[2].setcurposn(17);
        
        currentface[3].setbackcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(18, currentface[3]);
        currentface[3].setcurposn(18);
        
        currentface[4].setbackcolor(currentface[4].getrightcolor());        
        currentface[4].setrightcolor(currentface[4].getfrontcolor());
        currentface[4].setfrontcolor(null);
        currentarray.set(19, currentface[4]);
        currentface[4].setcurposn(19);
        
        currentface[5].setrightcolor(currentface[5].getfrontcolor());        
        currentface[5].setfrontcolor(null);
        currentarray.set(22, currentface[5]);
        currentface[5].setcurposn(22);
        
        currentface[6].setrightcolor(currentface[6].getfrontcolor());        
        currentface[6].setfrontcolor(currentface[6].getleftcolor());
        currentface[6].setleftcolor(null);
        currentarray.set(25, currentface[6]);
        currentface[6].setcurposn(25);
        
        currentface[7].setfrontcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(24, currentface[7]);
        currentface[7].setcurposn(24);
    }
    public void moveFrontClock(){
        showNextMove mov=new showNextMove("Move front face clockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(6);
        currentface[1]=currentarray.get(7);
        currentface[2]=currentarray.get(8);
        currentface[3]=currentarray.get(16);
        currentface[4]=currentarray.get(25);
        currentface[5]=currentarray.get(24);
        currentface[6]=currentarray.get(23);
        currentface[7]=currentarray.get(14);
        
        currentface[0].setrightcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(null);
        currentarray.set(8, currentface[0]);
        currentface[0].setcurposn(8);
        
        currentface[1].setrightcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(16, currentface[1]);
        currentface[1].setcurposn(16);
        
        currentface[2].setbottomcolor(currentface[2].getrightcolor());        
        currentface[2].setrightcolor(currentface[2].gettopcolor());
        currentface[2].settopcolor(null);
        currentarray.set(25, currentface[2]);
        currentface[2].setcurposn(25);
        
        currentface[3].setbottomcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(24, currentface[3]);
        currentface[3].setcurposn(24);
        
        currentface[4].setleftcolor(currentface[4].getbottomcolor());        
        currentface[4].setbottomcolor(currentface[4].getrightcolor());
        currentface[4].setrightcolor(null);
        currentarray.set(23, currentface[4]);
        currentface[4].setcurposn(23);
        
        currentface[5].setleftcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(14, currentface[5]);
        currentface[5].setcurposn(14);
        
        currentface[6].settopcolor(currentface[6].getleftcolor());        
        currentface[6].setleftcolor(currentface[6].getbottomcolor());
        currentface[6].setbottomcolor(null);
        currentarray.set(6, currentface[6]);
        currentface[6].setcurposn(6);
        
        currentface[7].settopcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(7, currentface[7]);
        currentface[7].setcurposn(7);
    }
    public void moveFrontAntiClock(){
        showNextMove mov=new showNextMove("Move front face anticlockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(6);
        currentface[1]=currentarray.get(7);
        currentface[2]=currentarray.get(8);
        currentface[3]=currentarray.get(16);
        currentface[4]=currentarray.get(25);
        currentface[5]=currentarray.get(24);
        currentface[6]=currentarray.get(23);
        currentface[7]=currentarray.get(14);
        
        currentface[0].setbottomcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(null);
        currentarray.set(23, currentface[0]);
        currentface[0].setcurposn(23);
        
        currentface[1].setleftcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(14, currentface[1]);
        currentface[1].setcurposn(14);
        
        currentface[2].setleftcolor(currentface[2].gettopcolor());        
        currentface[2].settopcolor(currentface[2].getrightcolor());
        currentface[2].setrightcolor(null);
        currentarray.set(6, currentface[2]);
        currentface[2].setcurposn(6);
        
        currentface[3].settopcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(7, currentface[3]);
        currentface[3].setcurposn(7);
        
        currentface[4].settopcolor(currentface[4].getrightcolor());        
        currentface[4].setrightcolor(currentface[4].getbottomcolor());
        currentface[4].setbottomcolor(null);
        currentarray.set(8, currentface[4]);
        currentface[4].setcurposn(8);
        
        currentface[5].setrightcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(16, currentface[5]);
        currentface[5].setcurposn(16);
        
        currentface[6].setrightcolor(currentface[6].getbottomcolor());        
        currentface[6].setbottomcolor(currentface[6].getleftcolor());
        currentface[6].setleftcolor(null);
        currentarray.set(25, currentface[6]);
        currentface[6].setcurposn(25);
        
        currentface[7].setbottomcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(24, currentface[7]);
        currentface[7].setcurposn(24);
    }
    public void moveBackClock(){
        showNextMove mov=new showNextMove("Move back face clockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(0);
        currentface[1]=currentarray.get(1);
        currentface[2]=currentarray.get(2);
        currentface[3]=currentarray.get(11);
        currentface[4]=currentarray.get(19);
        currentface[5]=currentarray.get(18);
        currentface[6]=currentarray.get(17);
        currentface[7]=currentarray.get(9);
        
        currentface[0].setrightcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(null);
        currentarray.set(2, currentface[0]);
        currentface[0].setcurposn(2);
        
        currentface[1].setrightcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(11, currentface[1]);
        currentface[1].setcurposn(11);
        
        currentface[2].setbottomcolor(currentface[2].getrightcolor());        
        currentface[2].setrightcolor(currentface[2].gettopcolor());
        currentface[2].settopcolor(null);
        currentarray.set(19, currentface[2]);
        currentface[2].setcurposn(19);
        
        currentface[3].setbottomcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(18, currentface[3]);
        currentface[3].setcurposn(18);
        
        currentface[4].setleftcolor(currentface[4].getbottomcolor());        
        currentface[4].setbottomcolor(currentface[4].getrightcolor());
        currentface[4].setrightcolor(null);
        currentarray.set(17, currentface[4]);
        currentface[4].setcurposn(17);
        
        currentface[5].setleftcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(9, currentface[5]);
        currentface[5].setcurposn(9);
        
        currentface[6].settopcolor(currentface[6].getleftcolor());        
        currentface[6].setleftcolor(currentface[6].getbottomcolor());
        currentface[6].setbottomcolor(null);
        currentarray.set(0, currentface[6]);
        currentface[6].setcurposn(0);
        
        currentface[7].settopcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(1, currentface[7]);
        currentface[7].setcurposn(1);
    }
    public void moveBackAntiClock(){
        showNextMove mov=new showNextMove("Move back face anticlockwise.");
        cubbis[] currentface=new cubbis[8];
        currentface[0]=currentarray.get(0);
        currentface[1]=currentarray.get(1);
        currentface[2]=currentarray.get(2);
        currentface[3]=currentarray.get(11);
        currentface[4]=currentarray.get(19);
        currentface[5]=currentarray.get(18);
        currentface[6]=currentarray.get(17);
        currentface[7]=currentarray.get(9);
        
        currentface[0].setbottomcolor(currentface[0].getleftcolor());
        currentface[0].setleftcolor(currentface[0].gettopcolor());
        currentface[0].settopcolor(null);
        currentarray.set(17, currentface[0]);
        currentface[0].setcurposn(17);
        
        currentface[1].setleftcolor(currentface[1].gettopcolor());
        currentface[1].settopcolor(null);      
        currentarray.set(9, currentface[1]);
        currentface[1].setcurposn(9);
        
        currentface[2].setleftcolor(currentface[2].gettopcolor());        
        currentface[2].settopcolor(currentface[2].getrightcolor());
        currentface[2].setrightcolor(null);
        currentarray.set(0, currentface[2]);
        currentface[2].setcurposn(0);
        
        currentface[3].settopcolor(currentface[3].getrightcolor());
        currentface[3].setrightcolor(null);      
        currentarray.set(1, currentface[3]);
        currentface[3].setcurposn(1);
        
        currentface[4].settopcolor(currentface[4].getrightcolor());        
        currentface[4].setrightcolor(currentface[4].getbottomcolor());
        currentface[4].setbottomcolor(null);
        currentarray.set(2, currentface[4]);
        currentface[4].setcurposn(2);
        
        currentface[5].setrightcolor(currentface[5].getbottomcolor());        
        currentface[5].setbottomcolor(null);
        currentarray.set(11, currentface[5]);
        currentface[5].setcurposn(11);
        
        currentface[6].setrightcolor(currentface[6].getbottomcolor());        
        currentface[6].setbottomcolor(currentface[6].getleftcolor());
        currentface[6].setleftcolor(null);
        currentarray.set(19, currentface[6]);
        currentface[6].setcurposn(19);
        
        currentface[7].setbottomcolor(currentface[7].getleftcolor());   
        currentface[7].setleftcolor(null);
        currentarray.set(18, currentface[7]);
        currentface[7].setcurposn(18);
    }
    public void solveRubik(){
        System.out.println("Pl hold the rubiks cube green face up and white face towards you...");
        //make daisy around blue center
        while(!solvedGreenFace()){
            solveGreenFace();
        }
        System.out.println("green face solved...........................................................");
        while(!solvedTopCorners()){
            System.out.println("solving corner cube");
            int p=getBottomCornersGreenCube();
            if(p!=100){
                int c;
                c=moveCubeBelowActualPosn(p);
                if(c!=100){
                    takeCornerCubeVerticallyUp(c);                
                }
                
            }else{
                pushDisorientedCubeDown();
             
            }
        }
        System.out.println("green corner solved....................................................");
        // solve layer 2 edge cubess
//        int loop=0;
        while(!solvedL2edgeCubes()){
            System.out.println("Solving layer 2 edge cubes");
            while(checkBottomEdgeCube()){
                getL2EdgeCubeFromBottom();  //get an edge cube without blue color from bottom and take to appropriate posn
            }
            takeDisorientedL2EdgeCubeDown();
        
        }
        System.out.println("Layer 2  solved....................................................");
        ArrayList<cubbis> blueFace=new ArrayList<cubbis>();
        blueFace=getblueBottom();
        makeBlueCross(blueFace);
        matchVCenters();
        while(!allBlueCornerInPosn()){
            posnBottomBlueCorner();
        }
        System.out.println("Blue corners in posn ....................................................");
        
        while(!allBlueCornerCorrectlyOriented()){
            orientBlueCorners();
        }
        showNextMove mov=new showNextMove("HOLLA.... You solved the worlds most complicated Puzzle......");
        
    }
    public void solveGreenFace(){//solve one of the green edge cube
        String currentface="green";
        int currentposn=getGreenEdgeCubePosn();
        if(currentposn!=-1){
            System.out.printf("current posn of green edge cube %d\n", currentposn);
            edgeCubes edgecube=new edgeCubes();
            cubbis currentCube=new cubbis();
            currentCube=currentarray.get(currentposn);
            int actualposn=getActualPosn(currentCube,currentface);
            System.out.printf("actual posn of green face cube is %d\n", actualposn);



            if(actualposn==1){
                distanceArray=edgecube.getShortestPath(18);
                moveCube(currentposn,18);
                domove(9);
                domove(9);
            }else if(actualposn==3){
                distanceArray=edgecube.getShortestPath(20);
                moveCube(currentposn,20);
                domove(6);
                domove(6);
            }else if(actualposn==5){
                distanceArray=edgecube.getShortestPath(22);
                moveCube(currentposn,22);
                domove(4);
                domove(4);
            }else if(actualposn==7){
                distanceArray=edgecube.getShortestPath(24);
                moveCube(currentposn,24);
                domove(7);
                domove(7);
            }
        }    
    
    }
    public int getActualPosn(cubbis c,String face){ //takes edge cube and one face color as arg
        cubbis cube=new cubbis();
        cube=c;
        int returnValue=0;
        String[] faces=new String[6]; 
        faces=cube.getfaces();
        String otherFace=null;
        for(int i=0;i<faces.length;i++){
            if(faces[i]!=null && !(face.equals(faces[i]))){
                otherFace=faces[i];
                break;
            }
        }
        switch(otherFace){
            case "yellow":
                returnValue=1;
                break;
            case "orange":
                returnValue=5;
                break;
            case "white":
                returnValue=7;
                break;
            case "red":
                returnValue=3;
                break;
        }
        return returnValue;
    }
    public int getGreenEdgeCubePosn(){  //return int posn of a cube which is not positioned correctly 
                                            //or not oriented correctly in actual posn
        edgeCubes edgecube=new edgeCubes();
        cubbis currentcube=new cubbis();
        for(int i=0;i<edgecube.validposn.length;i++){
            int searchposn=edgecube.validposn[i];
            currentcube=currentarray.get(searchposn);
            String[] faces=new String[6];
            faces=currentcube.getfaces();
            for(String color:faces){
                if("green".equals(color)){
                    if(searchposn!=getActualPosn(currentcube, "green")){
                        return edgecube.validposn[i];
                    }else if(searchposn==getActualPosn(currentcube, "green")&& !"green".equals(faces[0])){
                        return edgecube.validposn[i];
                    }
                }
            }
           
        }
        return -1;
    }
    
    public void moveCube(int from, int to){
        int source=from;
        int dst=100;
        int movno=0;
        movement mov=new movement();
        while(source!=to){
            for(int i=0;i<distanceArray.length;i++){
                if(distanceArray[i].vertexNo==source){
                    dst=distanceArray[i].parent;
                    movno=mov.getmovno(source, dst);
//                    System.out.printf("last mov no %d\n", movno);
                    domove(movno);
                    source=dst;
                    break;
                }
//                break;
            }
        }
        cubbis cube=new cubbis();
        cube=currentarray.get(to);
        if(!"green".equals(cube.getbottomcolor())){
            flipColor(to);
        }
    }
    public void flipColor(int posn){
        cubbis cube=new cubbis();
        cube=currentarray.get(posn);
        switch (posn){
            case 18:
                domove(9);
                domove(5);
                domove(11);
                domove(6);
                break;
            case 20:
                domove(5);
                domove(8);
                domove(11);
                domove(7);
                break;
            case 22:
                domove(4);
                domove(9);
                domove(11);
                domove(10);
                break;
            case 24:
                domove(8);
                domove(4);
                domove(11);
                domove(3);
                break;
        }
    }    
    
    public boolean solvedGreenFace(){
        
        boolean cube1=false,cube3=false,cube5=false,cube7=false;
        cubbis currentcube=new cubbis();
        currentcube=currentarray.get(1);
        String[] faces=new String[6];
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&& "yellow".equals(faces[4]))
            cube1=true;
        currentcube=currentarray.get(3);
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&&"red".equals(faces[1]))
            cube3=true;
        currentcube=currentarray.get(5);
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&&"orange".equals(faces[2]))
            cube5=true;
        currentcube=currentarray.get(7);
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&&"white".equals(faces[3]))
            cube7=true;
        if(cube1==true&&cube3==true&&cube5==true&&cube7==true)
            return true;
        return false;
    }    

    public void domove(int movno){
        switch(movno){
            case 0:
                break;
            case 1:
                moveTopClock();
                System.out.println("performed mov no 1 top clock");
                break;
            case 2:
                moveTopAntiClock();
                System.out.println("performed mov no 2 top anti clock");
                break;
            case 3:
                moveRightUp();
                System.out.println("performed mov no 3 right up");
                break;
            case 4:
                moveRightDown();
                System.out.println("performed mov no 4 right down");
                break;
            case 5:
                moveLeftUp();
                System.out.println("performed mov no 5 left up");
                break;
            case 6:
                moveLeftDown();
                System.out.println("performed mov no 6 left down");
                break;
            case 7:
                moveFrontClock();
                System.out.println("performed mov no 7 front clock");
                break;
            case 8:
                moveFrontAntiClock();
                System.out.println("performed mov no 8 front anti clock");
                break;
            case 9:
                moveBackClock();
                System.out.println("performed mov no 9 back clock");
                break;
            case 10:
                moveBackAntiClock();
                System.out.println("performed mov no 10 back anti clock");
                break;
            case 11:
                moveBottomClock();
                System.out.println("performed mov no 11 bottom clock");
                break;
            case 12:
                moveBottomAntiClock();
                System.out.println("performed mov no 12 bottom anti clock");
                break;
        }
    }
    
    public boolean solvedTopCorners(){
//        boolean returnValue=false;
        boolean cube0=false,cube2=false,cube6=false,cube8=false;
        cubbis currentcube=new cubbis();
        currentcube=currentarray.get(0);
        String[] faces=new String[6];
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&& "yellow".equals(faces[4])&&"red".equals(faces[1]))
            cube0=true;
        currentcube=currentarray.get(2);
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&&"yellow".equals(faces[4])&&"orange".equals(faces[2]))
            cube2=true;
        currentcube=currentarray.get(6);
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&&"red".equals(faces[1])&&"white".equals(faces[3]))
            cube6=true;
        currentcube=currentarray.get(8);
        faces=currentcube.getfaces();
        if("green".equals(faces[0])&&"white".equals(faces[3])&&"orange".equals(faces[2]))
            cube8=true;
        if(cube0==true&&cube2==true&&cube6==true&&cube8==true)
            return true;
        return false;
    }
    public int getBottomCornersGreenCube(){
        int returnValue=100;
        cubbis cube=new cubbis();
        cube=currentarray.get(17);
        String[] a=cube.getfaces();
        for(int i=0;i<a.length;i++){
            if("green".equals(a[i])){
                if(i==5){
                    domove(5);
                    domove(12);
                    domove(6);
                    return 25;
                }
                return 17;
            }
        }
        cube=currentarray.get(19);
        a=cube.getfaces();
        for(int i=0;i<a.length;i++){
            if("green".equals(a[i])){
                if(i==5){
                    domove(3);
                    domove(11);
                    domove(4);
                    return 23;
                }
                return 19;
            }
        }
        cube=currentarray.get(23);
        a=cube.getfaces();
        for(int i=0;i<a.length;i++){
            if("green".equals(a[i])){
                if(i==5){
                    domove(6);
                    domove(11);
                    domove(5);
                    return 19;
                }
                return 23;
            }
        }
        cube=currentarray.get(25);
        a=cube.getfaces();
        for(int i=0;i<a.length;i++){
            if("green".equals(a[i])){
                if(i==5){
                    domove(4);
                    domove(12);
                    domove(3);
                    return 17;
                }
                return 25;
            }
        }
        return returnValue;
    }
    public int moveCubeBelowActualPosn(int p){
        int toBePositioned=100;
        cubbis cube=new cubbis();
        cube=currentarray.get(p);
        List<String> faceList=Arrays.asList(cube.getfaces());
        if(faceList.contains("white")){
            if(faceList.contains("red")){
                toBePositioned=23;
            }else if(faceList.contains("orange")){
                toBePositioned=25;
            }
        }else if(faceList.contains("yellow")){
            if(faceList.contains("red")){
                toBePositioned=17;
            }else if(faceList.contains("orange")){
                toBePositioned=19;
            }
        }
        while(toBePositioned!=cube.getcurposn()){
            domove(11);
        }
        System.out.printf("positioned in %d\n",toBePositioned);
        return toBePositioned;
        
    }
    
    public void takeCornerCubeVerticallyUp(int c){ //take the green corner cube from bottom layer to vertically up top layer 
        if(c!=100){
            cubbis cube=new cubbis();
            cube=currentarray.get(c);
            List<String> faces=Arrays.asList(cube.getfaces());
            if(c==17){
                if(faces.indexOf("green")==4){
                    domove(11);
                    domove(5);
                    domove(12);
                    domove(6);
                }else if(faces.indexOf("green")==1){
                    domove(12);
                    domove(10);
                    domove(11);
                    domove(9);
                }
            }else if(c==19){
                if(faces.indexOf("green")==2){
                    domove(11);
                    domove(9);
                    domove(12);
                    domove(10);
                }else if(faces.indexOf("green")==4){
                    domove(12);
                    domove(3);
                    domove(11);
                    domove(4);
                }
            }else if(c==23){
                if(faces.indexOf("green")==3){
                    domove(12);
                    domove(6);
                    domove(11);
                    domove(5);
                }else if(faces.indexOf("green")==1){
                    domove(11);
                    domove(8);
                    domove(12);
                    domove(7);
                }
            }else if(c==25){
                if(faces.indexOf("green")==3){
                    domove(11);
                    domove(4);
                    domove(12);
                    domove(3);
                }else if(faces.indexOf("green")==2){
                    domove(12);
                    domove(7);
                    domove(11);
                    domove(8);
                }
            }
        }
    }
    
    public void pushDisorientedCubeDown(){ //push the disoriented top corner cube down
        int[] topCorners=new int[]{0,2,6,8};
        cubbis cube=new cubbis();
        for(int posn:topCorners){
            cube=currentarray.get(posn);
            List<String> faces=Arrays.asList(cube.getfaces());
            if(faces.contains("green")){
                int index=faces.indexOf("green");
                if(posn==0 && !correctlyOriented(cube)){
                    if(index==0 || index==4){
                        domove(10);
                        domove(12);
                        domove(9);
                    }else if(index==1){
                        domove(10);
                        domove(11);
                        domove(9);
                    }
                }else if(posn==2 && !correctlyOriented(cube)){
                    if(index==0 || index==4){
                        domove(9);
                        domove(11);
                        domove(12);
                    }else if(index==2){
                        domove(3);
                        domove(11);
                        domove(4);
                    }
                }else if(posn==6 && !correctlyOriented(cube)){
                    if(index==0 || index==1){
                        domove(6);
                        domove(12);
                        domove(5);
                    }else if(index==3){
                        domove(8);
                        domove(11);
                        domove(7);
                    }
                }else if(posn==8 && !correctlyOriented(cube)){
                    if(index==0 || index==2){
                        domove(4);
                        domove(11);
                        domove(3);
                    }else if(index==3){
                        domove(7);
                        domove(12);
                        domove(8);
                    }
                }    
            }
        }
    }
    
    public boolean correctlyOriented(cubbis c){ //check the correct orientation of upper corners cube
        int currentPosn=c.getcurposn();
        boolean returnValue=false;
        List<String> faces=Arrays.asList(c.getfaces());
        if(currentPosn==0){       
            if(faces.indexOf("green")==0 &&
                    faces.indexOf("red")==1 &&
                    faces.indexOf("yellow")==4)
                returnValue=true;           
        }else if(currentPosn==2){
            if(faces.indexOf("green")==0 &&
                    faces.indexOf("orange")==2 &&
                    faces.indexOf("yellow")==4)
                returnValue=true;
        }else if(currentPosn==6){
            if(faces.indexOf("green")==0 &&
                    faces.indexOf("red")==1 &&
                    faces.indexOf("white")==3)
                returnValue=true;
        }else if(currentPosn==8){
            if(faces.indexOf("green")==0 &&
                    faces.indexOf("orange")==2 &&
                    faces.indexOf("white")==3)
                returnValue=true;
        } 
        return returnValue;
    }
    
    public boolean solvedL2edgeCubes(){
        boolean returnValue=false;
        boolean cube9=false,cube11=false,cube14=false,cube16=false;
        cubbis cube=new cubbis();
        
        cube=currentarray.get(9);
        String[] color=cube.getfaces();
        if("red".equals(color[1])&&"yellow".equals(color[4]))
            cube9=true;
        
        cube=currentarray.get(11);
        color=cube.getfaces();
        if("orange".equals(color[2])&&"yellow".equals(color[4]))
            cube11=true;
        
        cube=currentarray.get(14);
        color=cube.getfaces();
        if("red".equals(color[1])&&"white".equals(color[3]))
            cube14=true;
        
        cube=currentarray.get(16);
        color=cube.getfaces();
        if("orange".equals(color[2])&&"white".equals(color[3]))
            cube16=true;
        
        if(cube9==true && cube11==true && cube14==true && cube16==true)
            returnValue=true;
        
        return returnValue;
        
    }
    
    public int getL2EdgeCubeFromBottom(){ //get an edge cube from bottom layer and put it in appropriate posn in layer 2
        int[] posn=new int[] {18,20,22,24};
        String[] centerFaces=new String[]{"yellow","orange","white","red"};
        for(int currentPosn:posn){
            cubbis cube=new cubbis();
            cube=currentarray.get(currentPosn);
//            List<String> faces=Arrays.asList(cube.getfaces());
            List<String> faces = new LinkedList<String>(Arrays.asList(cube.getfaces()));
            if(!faces.contains("blue")){
                faces.remove(5);
                for(int i=0;i<centerFaces.length;i++){
                    String color=centerFaces[i];
                    if(faces.contains(color)){
                        int index=faces.indexOf(color);
                        if(i==0 && index==1){  //yellow in left face
                            domove(11);
                            takeCubeL2(18);
                        }else if(i==0 && index==2){ //yellow in right faces
                            domove(12);
                            takeCubeL2(18);
                        }else if(i==0 && index==3){  //yellow in front faces
                            domove(11);
                            domove(11);
                            takeCubeL2(18);
                        }else if(i==0 && index==4){  //yellow in back faces
                            takeCubeL2(18);
                        }else if(i==1 && index==1){  //orange in left faces
                            domove(11);
                            domove(11);
                            takeCubeL2(22);
                        }else if(i==1 && index==3){  //orange in front faces
                            domove(12);
                            takeCubeL2(22);
                        }else if(i==1 && index==4){
                            domove(11);
                            takeCubeL2(22);
                        }else if(i==1 && index==2){  //orange in right faces
                            takeCubeL2(22);
                        }else if(i==2 && index==1){
                            domove(12);
                            takeCubeL2(24);
                        }else if(i==2 && index==2){
                            domove(11);
                            takeCubeL2(24);
                        }else if(i==2 && index==4){
                            domove(11);
                            domove(11);
                            takeCubeL2(24);
                        }else if(i==2 && index==3){  //white in front faces
                            takeCubeL2(24);
                        }else if(i==3 && index==2){
                            domove(11);
                            domove(11);
                            takeCubeL2(20);
                        }else if(i==3 && index==3){
                            domove(11);
                            takeCubeL2(20);
                        }else if(i==3 && index==4){
                            domove(12);
                            takeCubeL2(20);
                        }else if(i==3 && index==1){  //red in left faces
                            takeCubeL2(20);
                        }
                    }
                }
            
            }
        }
        return 0;
    }
    public void takeCubeL2(int posn){ //take bottom edge cube to appropriate layer2 posn
        cubbis cube=new cubbis();
        cube=currentarray.get(posn);
        List<String> faces=Arrays.asList(cube.getfaces());
        String bottomColor=faces.get(5);
        if(posn==18 && "red".equals(bottomColor)){
            domove(11);
            domove(5);
            domove(12);
            domove(6);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(17);
        }else if(posn==18 && "orange".equals(bottomColor)){
            domove(12);
            domove(3);
            domove(11);
            domove(4);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(19);
        }else if(posn==20 && "yellow".equals(bottomColor)){
            domove(12);
            domove(10);
            domove(11);
            domove(9);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(17);
        }else if(posn==20 && "white".equals(bottomColor)){
            domove(11);
            domove(8);
            domove(12);
            domove(7);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(23);
        }else if(posn==22 && "white".equals(bottomColor)){
            domove(12);
            domove(7);
            domove(11);
            domove(8);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(25);
        }else if(posn==22 && "yellow".equals(bottomColor)){
            domove(11);
            domove(9);
            domove(12);
            domove(10);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(19);
        }else if(posn==24 && "red".equals(bottomColor)){
            domove(12);
            domove(6);
            domove(11);
            domove(5);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(23);
        }else if(posn==24 && "orange".equals(bottomColor)){
            domove(11);
            domove(4);
            domove(12);
            domove(3);
//            int p=getBottomCornersGreenCube();
            takeCornerCubeVerticallyUp(25);
        }
        
    }
    
    public void takeDisorientedL2EdgeCubeDown(){
        int[] posn=new int[]{9,11,14,16};
        cubbis cube=new cubbis();
        for(int currentPosn:posn){
            cube=currentarray.get(currentPosn);
            if(currentPosn==9){
                List<String> faces=Arrays.asList(cube.getfaces());
                if(!"yellow".equals(faces.get(4)) || !"red".equals(faces.get(1))){
                    domove(12);
                    domove(10);
                    domove(11);
                    domove(9);
                    takeCornerCubeVerticallyUp(17);
//                    return;
                }
            }else if(currentPosn==11){
                List<String> faces=Arrays.asList(cube.getfaces());
                if(!"yellow".equals(faces.get(4)) || !"orange".equals(faces.get(2))){
                    domove(11);
                    domove(9);
                    domove(12);
                    domove(10);
                    takeCornerCubeVerticallyUp(19);
//                    return;
                }
            }else if(currentPosn==14){
                List<String> faces=Arrays.asList(cube.getfaces());
                if(!"white".equals(faces.get(3)) || !"red".equals(faces.get(1))){
                    domove(12);
                    domove(6);
                    domove(11);
                    domove(5);
                    takeCornerCubeVerticallyUp(23);
//                    return;
                }
            }else if(currentPosn==16){
                List<String> faces=Arrays.asList(cube.getfaces());
                if(!"white".equals(faces.get(3)) || !"orange".equals(faces.get(2))){
                    domove(11);
                    domove(4);
                    domove(12);
                    domove(3);
                    takeCornerCubeVerticallyUp(25);
//                    return;
                }
            }
        }
    }
    public boolean checkBottomEdgeCube(){ //check all bottom edge cube without blue color
        int[]posn=new int[]{18,20,22,24};
        cubbis cube=new cubbis();
        boolean returnValue=false;
        for(int currentPosn:posn){
            cube=currentarray.get(currentPosn);
            List<String>faces=Arrays.asList(cube.getfaces());
            if(!faces.contains("blue")){
                returnValue=true;
            }
        }
        return returnValue;
    }
    public ArrayList<cubbis> getblueBottom(){
        int[] posn=new int[]{18,20,22,24};
        cubbis cube=new cubbis();
        ArrayList<cubbis> blueFace=new ArrayList();
        for(int currentposn:posn){
            cube=currentarray.get(currentposn);
            String[] faces=cube.getfaces();
            if("blue".equals(faces[5])){
                blueFace.add(cube);
            }
        }
        return blueFace;
    }
    public void makeBlueCross(ArrayList<cubbis> blueFace){
        if(blueFace.size()==0){
                //bring blue bottom to 20 &24
            domove(7);
            domove(6);
            domove(12);
            domove(5);
            domove(11);
            domove(8);
                //make vertical blu straight line
            domove(7);
            domove(6);
            domove(12);
            domove(5);
            domove(11);
            domove(8);
                //make blue cross by cross mov keeping red at front
            domove(6);
            domove(10);
            domove(12);
            domove(9);
            domove(11);
            domove(5);
            return;
        }else if(blueFace.size()==2){
            int bFcedCube1;
            int bFcedCube2;
//            bFcedCube1=blueFace.get(0).getcurposn();
//            bFcedCube2=blueFace.get(1).getcurposn();
            if(blueFace.contains(currentarray.get(18))&&blueFace.contains(currentarray.get(24))){
                domove(6);
                domove(10);
                domove(12);
                domove(9);
                domove(11);
                domove(5);
            }else if(blueFace.contains(currentarray.get(20))&&blueFace.contains(currentarray.get(22))){
                domove(7);
                domove(6);
                domove(12);
                domove(5);
                domove(11);
                domove(8);
            }else if(blueFace.contains(currentarray.get(18))&&blueFace.contains(currentarray.get(22))){
                domove(7);
                domove(6);
                domove(12);
                domove(5);
                domove(11);
                domove(8);

                domove(7);
                domove(6);
                domove(12);
                domove(5);
                domove(11);
                domove(8);
            }else if(blueFace.contains(currentarray.get(22))&&blueFace.contains(currentarray.get(24))){
                domove(6);
                domove(10);
                domove(12);
                domove(9);
                domove(11);
                domove(5);

                domove(6);
                domove(10);
                domove(12);
                domove(9);
                domove(11);
                domove(5);
            }else if(blueFace.contains(currentarray.get(24))&&blueFace.contains(currentarray.get(20))){
                domove(10);
                domove(3);
                domove(12);
                domove(4);
                domove(11);
                domove(9);

                domove(10);
                domove(3);
                domove(12);
                domove(4);
                domove(11);
                domove(9);
            }else if(blueFace.contains(currentarray.get(20))&&blueFace.contains(currentarray.get(18))){
                domove(3);
                domove(7);
                domove(12);
                domove(8);
                domove(11);
                domove(4);

                domove(3);
                domove(7);
                domove(12);
                domove(8);
                domove(11);
                domove(4);
            } 
            
        }
    }
    public void matchVCenters(){ //matches vertical center of bottom and layer 3 cube
        if("white".equals(currentarray.get(24).getfaces()[3])&&
                "red".equals(currentarray.get(20).getfaces()[1])&&
                "yellow".equals(currentarray.get(18).getfaces()[4])&&
                "orange".equals(currentarray.get(22).getfaces()[2])){
            return;
        }
        int[] posn=new int[]{18,20,22,24};
//        boolean matched=false;
        while(!"white".equals(currentarray.get(24).getfaces()[3])){//matches white vertically
            domove(12);
        }
        while(!"orange".equals(currentarray.get(22).getfaces()[2])){// matches orange vertically
            domove(6);
            domove(12);
            domove(12);
            domove(5);
            domove(11);
            domove(6);
            domove(11);
            domove(5);
        }
        if("white".equals(currentarray.get(24).getfaces()[3])&&
                "red".equals(currentarray.get(20).getfaces()[1])&&
                "yellow".equals(currentarray.get(18).getfaces()[4])&&
                "orange".equals(currentarray.get(22).getfaces()[2])){
            return;
        }else{
            domove(10);
            domove(12);
            domove(12);
            domove(9);
            domove(11);
            domove(10);
            domove(11);
            domove(9);
            domove(11);
        }
    }
    public void posnBottomBlueCorner(){
        
        if(correctlyPosn(23)){
            while(!allBlueCornerInPosn()){
                domove(4);
                domove(12);
                domove(6);
                domove(11);
                domove(3);
                domove(12);
                domove(5);
                domove(11);
            }
        }else if(correctlyPosn(25)){
            while(!allBlueCornerInPosn()){
                domove(9);
                domove(12);
                domove(7);
                domove(11);
                domove(10);
                domove(12);
                domove(8);
                domove(11);
            }
        }else{
            domove(8);
            domove(12);
            domove(10);
            domove(11);
            domove(7);
            domove(12);
            domove(9);
            domove(11);
        }
    }
    public boolean correctlyPosn(int posn){
        boolean retVal=false;
        cubbis cube=new cubbis();
        cube=currentarray.get(posn);
        List<String> faces=Arrays.asList(cube.getfaces());
        if(posn==23){
            if(faces.contains("blue")&&faces.contains("red")&&faces.contains("white"))
                retVal=true;
        }else if(posn==25){
            if(faces.contains("blue")&&faces.contains("orange")&&faces.contains("white"))
                retVal=true;
        }
        return retVal;
    }
    public boolean allBlueCornerInPosn(){
        cubbis cube=new cubbis();
        boolean retVal=false,cube0=false,cube1=false,cube2=false,cube3=false;
        cube=currentarray.get(17);
        List<String> faces=Arrays.asList(cube.getfaces());
        if(faces.contains("blue")&&faces.contains("yellow")&&faces.contains("red")){
            cube0=true;
        }
        cube=currentarray.get(19);
        faces=Arrays.asList(cube.getfaces());
        if(faces.contains("blue")&&faces.contains("yellow")&&faces.contains("orange")){
            cube1=true;
        }
        cube=currentarray.get(23);
        faces=Arrays.asList(cube.getfaces());
        if(faces.contains("blue")&&faces.contains("white")&&faces.contains("red")){
            cube2=true;
        }
        cube=currentarray.get(25);
        faces=Arrays.asList(cube.getfaces());
        if(faces.contains("blue")&&faces.contains("white")&&faces.contains("orange")){
            cube3=true;
        }
        if(cube0==true&&cube1==true&&cube2==true&&cube3==true)
            retVal=true;
        return retVal;
    }
    public boolean allBlueCornerCorrectlyOriented(){
        boolean retVal=false,cube0=false,cube1=false,cube2=false,cube3=false;
        
        cubbis cube=new cubbis();
        cube=currentarray.get(17);
        if("blue".equals(cube.getfaces()[5])){
            cube0=true;
        }
        cube=currentarray.get(19);
        if("blue".equals(cube.getfaces()[5])){
            cube1=true;
        }
        cube=currentarray.get(23);
        if("blue".equals(cube.getfaces()[5])){
            cube2=true;
        }
        cube=currentarray.get(25);
        if("blue".equals(cube.getfaces()[5])){
            cube3=true;
        }
        if(cube0==true&&cube1==true&&cube2==true&&cube3==true)
            retVal=true;
        return retVal;
    }
    public void orientBlueCorners(){
        ArrayList<cubbis> blueBottomCubes=new ArrayList();
        int[]posn=new int[]{17,19,23,25};
        List<String> faces=new ArrayList<String>();
//        List<cubbis> blueBottomCubes=new ArrayList<cubbis>();
        cubbis cube,cube1,cube2=new cubbis();
        for(int currentPosn:posn){
            cube=currentarray.get(currentPosn);
            faces=Arrays.asList(cube.getfaces());
            if("blue".equals(faces.get(5))){
                blueBottomCubes.add(cube);
            }
        }
        while(blueBottomCubes.isEmpty()){
                
           
                    //reorientation move keeping white front 
                domove(6);
                domove(12);
                domove(12);
                domove(5);
                domove(11);
                domove(6);
                domove(11);
                domove(5);

                domove(4);
                domove(12);
                domove(12);
                domove(3);
                domove(12);
                domove(4);
                domove(12);
                domove(3);
            }

        if(blueBottomCubes.size()==1){
           
            if(blueBottomCubes.contains(currentarray.get(17))){
                ////reorientation kove keeping yellow front
                domove(3);
                domove(12);
                domove(12);
                domove(4);
                domove(11);
                domove(3);
                domove(11);
                domove(4);

                domove(5);
                domove(12);
                domove(12);
                domove(6);
                domove(12);
                domove(5);
                domove(12);
                domove(6);
                
            }else if(blueBottomCubes.contains(currentarray.get(19))){
                //reorientation kove keeping orange front
                domove(7);
                domove(12);
                domove(12);
                domove(8);
                domove(11);
                domove(7);
                domove(11);
                domove(8);

                domove(9);
                domove(12);
                domove(12);
                domove(10);
                domove(12);
                domove(9);
                domove(12);
                domove(10);
            }else if(blueBottomCubes.contains(currentarray.get(23))){
                //reorientation kove keeping red front
                domove(10);
                domove(12);
                domove(12);
                domove(9);
                domove(11);
                domove(10);
                domove(11);
                domove(9);

                domove(8);
                domove(12);
                domove(12);
                domove(7);
                domove(12);
                domove(8);
                domove(12);
                domove(7);
            }else if(blueBottomCubes.contains(currentarray.get(25))){
                //reorientation kove keeping white front
                domove(6);
                domove(12);
                domove(12);
                domove(5);
                domove(11);
                domove(6);
                domove(11);
                domove(5);

                domove(4);
                domove(12);
                domove(12);
                domove(3);
                domove(12);
                domove(4);
                domove(12);
                domove(3);
            }
            
        }else if(blueBottomCubes.size()==2){
//            while(!allBlueCornerCorrectlyOriented()){
                if(blueBottomCubes.contains(currentarray.get(17))&&blueBottomCubes.contains(currentarray.get(19))){
                    //reorientation kove keeping orange front
                domove(7);
                domove(12);
                domove(12);
                domove(8);
                domove(11);
                domove(7);
                domove(11);
                domove(8);

                domove(9);
                domove(12);
                domove(12);
                domove(10);
                domove(12);
                domove(9);
                domove(12);
                domove(10);
                }else if(blueBottomCubes.contains(currentarray.get(17))&&blueBottomCubes.contains(currentarray.get(23))){
                    //reorientation kove keeping yellow front
                domove(3);
                domove(12);
                domove(12);
                domove(4);
                domove(11);
                domove(3);
                domove(11);
                domove(4);

                domove(5);
                domove(12);
                domove(12);
                domove(6);
                domove(12);
                domove(5);
                domove(12);
                domove(6);
                }else if(blueBottomCubes.contains(currentarray.get(19))&&blueBottomCubes.contains(currentarray.get(25))){
                    //reorientation kove keeping white front
                domove(6);
                domove(12);
                domove(12);
                domove(5);
                domove(11);
                domove(6);
                domove(11);
                domove(5);

                domove(4);
                domove(12);
                domove(12);
                domove(3);
                domove(12);
                domove(4);
                domove(12);
                domove(3);
                }else if(blueBottomCubes.contains(currentarray.get(23))&&blueBottomCubes.contains(currentarray.get(25))){
                    //reorientation kove keeping red front
                domove(10);
                domove(12);
                domove(12);
                domove(9);
                domove(11);
                domove(10);
                domove(11);
                domove(9);

                domove(8);
                domove(12);
                domove(12);
                domove(7);
                domove(12);
                domove(8);
                domove(12);
                domove(7);
                }else{   //diagonal corners are blue bottom 
                        //reorientation kove keeping red front
                domove(10);
                domove(12);
                domove(12);
                domove(9);
                domove(11);
                domove(10);
                domove(11);
                domove(9);

                domove(8);
                domove(12);
                domove(12);
                domove(7);
                domove(12);
                domove(8);
                domove(12);
                domove(7);
                }
            
       
            
            
        }
        
    }
    
}

