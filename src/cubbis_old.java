/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oc ssc
 */
public class cubbis_old {
    private int posnIndex;
    private String topcolor;
    private String bottomcolor;
    private String frontcolor;
    private String backcolor;
    private String leftcolor;
    private String rightcolor;
    public cubbis_old(){
            posnIndex=0;
    }
//    public void setposn(int posn){
//        posnIndex=posn;
//    }
    public int getIndex(){
        return posnIndex;
    }
    public String gettopcolor(){
        return topcolor;
    }
    public void settopcolor(String color){
        topcolor=color;
    }
    public String getbottomcolor(){
        return bottomcolor;
    }
    public void setbottomcolor(String color){
        bottomcolor=color;
    }
    public String getfrontcolor(){
        return frontcolor;
    }
    public void setfrontcolor(String color){
        frontcolor=color;
    }
    public String getbackcolor(){
        return backcolor;
    }
     public void setbackcolor(String color){
        backcolor=color;
    }
    public void setleftcolor(String color){
        leftcolor=color;
    }
    public String getleftcolor(){
        return leftcolor;
    }
    public void setrightcolor(String color){
        rightcolor=color;
    }
    public String getrightcolor(){
        return rightcolor;
    }
    
    public String toString(){
       return "current posn:"+posnIndex+", top color:"+topcolor+", bottom color: "+bottomcolor+", left color: "+leftcolor+", right color: "+rightcolor+", front color: "+frontcolor+", back color: "+backcolor+"\n"; 
    }
    
}
