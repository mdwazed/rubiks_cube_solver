/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
/**
 *
 * @author oc ssc
 */
public class edgeCubes {
    int[] validposn={1,3,5,7,9,11,14,16,18,20,22,24};//start at 0
    boolean[][] adj={
        {false,true,true,false,true,true,false,false,false,false,false,false},
        {true,false,false,true,true,false,true,false,false,false,false,false},
        {true,false,false,true,false,true,false,true,false,false,false,false},
        {false,true,true,false,false,false,true,true,false,false,false,false},
        {true,true,false,false,false,false,false,false,true,true,false,false},
        {true,false,true,false,false,false,false,false,true,false,true,false},
        {false,true,false,true,false,false,false,false,false,true,false,true},
        {false,false,true,true,false,false,false,false,false,false,true,true},
        {false,false,false,false,true,true,false,false,false,true,true,false},
        {false,false,false,false,true,false,true,false,true,false,false,true},
        {false,false,false,false,false,true,false,true,true,false,false,true},
        {false,false,false,false,false,false,true,true,false,true,true,false},
    };
    
    public edgeCubes(){
        
    }
    public ArrayList getpath(int from,int to){ //return array of vertex no from source to destination
        ArrayList patharray=new ArrayList();
        
        bfsVertex[] vertexArray=new bfsVertex[12];
        Queue<bfsVertex> bfsqueue=new LinkedList<bfsVertex>();
        for(int i=0;i<vertexArray.length;i++){
            bfsVertex currentVertex=new bfsVertex();
            currentVertex.color="white";
            currentVertex.distance=0;
            currentVertex.parent=0;
            currentVertex.vertexNo=validposn[i];
            vertexArray[i]=currentVertex;
        }
        
        int s=7;
        int d=to;
        bfsVertex workingVertex=new bfsVertex();
        int index=0;
        index=Arrays.binarySearch(validposn, s);
        vertexArray[index].color="gray";
        workingVertex=vertexArray[index];
        bfsqueue.removeAll(bfsqueue);
        bfsqueue.add(workingVertex);
        while(!bfsqueue.isEmpty()){
            workingVertex=bfsqueue.poll();
            for(int i=0;i<vertexArray.length;i++){
                for(int j=0;j<vertexArray.length;j++){
                    if(adj[i][j]==true){
                        if("white".equals(vertexArray[j].color)){
                            vertexArray[j].color="gray";
                            vertexArray[j].distance=vertexArray[i].distance+1;
//                        int indexOfFlower = Arrays.asList(lilyFlowers).indexOf("Lily Monte Negro");
//                            int parentIndex=Arrays.asList(vertexArray).indexOf(workingVertex);
                            vertexArray[j].parent=vertexArray[i].vertexNo;
                            bfsqueue.add(vertexArray[j]);
                        }
                    }
                }
            }    
            vertexArray[index].color="black";
        
        }
        
        return patharray;
    }
    public bfsVertex[] getShortestPath(int source){
        ArrayList path=new ArrayList();
         bfsVertex[] vertexArray=new bfsVertex[12];
        Queue<bfsVertex> bfsqueue=new LinkedList<bfsVertex>();
        for(int i=0;i<vertexArray.length;i++){
            bfsVertex currentVertex=new bfsVertex();
            currentVertex.color="white";
            currentVertex.distance=0;
            currentVertex.parent=0;
            currentVertex.vertexNo=validposn[i];
            vertexArray[i]=currentVertex;
        }
        int s=0;
        for(int i=0;i<validposn.length;i++){
            if(validposn[i]==source)
                s=i;
        }
        vertexArray[s].color="gray";
        bfsqueue.add(vertexArray[s]);
        while(!bfsqueue.isEmpty()){
            bfsVertex currentvertex=new bfsVertex();
            currentvertex=bfsqueue.poll();
            int index=Arrays.asList(vertexArray).indexOf(currentvertex);
            for(int i=0;i<vertexArray.length;i++){
                
                if(adj[index][i]==true){
                    if("white".equals(vertexArray[i].color)){
                        vertexArray[i].color="gray";
                        vertexArray[i].distance=vertexArray[index].distance+1;
                        vertexArray[i].parent=vertexArray[index].vertexNo;
                        bfsqueue.add(vertexArray[i]);
                    }
                }
            }
        }
        return vertexArray;
    }
    
}
