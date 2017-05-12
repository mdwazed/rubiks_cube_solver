/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oc ssc
 */
public class centerCubes extends cubbis_old {
    int[] validposn={5,11,13,14,16,22};
    public centerCubes(String color){
        this.setfrontcolor(color);
    }
    public String getfacecolor(){
        return this.getfrontcolor();
    }
}
