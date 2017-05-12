/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oc ssc
 */
public class cubbis {
    private int posnIndex;
    private int curposn;
    private String[]facecolor=new String[6];
    private String topcolor;
    private String bottomcolor;
    private String frontcolor;
    private String backcolor;
    private String leftcolor;
    private String rightcolor;
    boolean correctlyPositioned;
    public cubbis(){
            posnIndex=0;
            curposn=0;
            correctlyPositioned=false;
    }

    
    public void setposn(int posn){
        posnIndex=posn;
    }
    public int getIndex(){
        return posnIndex;
    }
    public void setcurposn(int posn){
        curposn=posn;
    }
    public int getcurposn(){
        return curposn;
    }
    public String gettopcolor(){
        return facecolor[0];
    }
    public void settopcolor(String color){
        facecolor[0]=color;
    }
    public String getbottomcolor(){
        return facecolor[5];
    }
    public void setbottomcolor(String color){
        facecolor[5]=color;
    }
    public String getfrontcolor(){
        return facecolor[3];
    }
    public void setfrontcolor(String color){
        facecolor[3]=color;
    }
    public String getbackcolor(){
        return facecolor[4];
    }
     public void setbackcolor(String color){
        facecolor[4]=color;
    }
    public void setleftcolor(String color){
        facecolor[1]=color;
    }
    public String getleftcolor(){
        return facecolor[1];
    }
    public void setrightcolor(String color){
        facecolor[2]=color;
    }
    public String getrightcolor(){
        return facecolor[2];
    }
@Override
    public String toString(){
       return "current posn:"+posnIndex+", top color:"+facecolor[0]+", bottom color: "+facecolor[5]+", left color: "+facecolor[1]+", right color: "+facecolor[2]+", front color: "+facecolor[3]+", back color: "+facecolor[4]+"\n"; 
    }
    public String[] getfaces(){
        return this.facecolor;
    }
    
}
