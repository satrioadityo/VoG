/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir.vog;

import java.util.ArrayList;
import java.util.Iterator;
import org.graphstream.algorithm.Toolkit;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author Satrio
 */
public class Subgraph {
    Graph subgraph = new MultiGraph("subgraph");
    Graph orderedSubgraph = new MultiGraph("ordered subgraph");
    String structure;
    int cliqueError, starError, bipartiteError, chainError;
    
    public void addNode(String id){
        subgraph.addNode(id);
    }
    
    public void addEdge(String idEdge, String from, String to){
        subgraph.addEdge(idEdge, from, to);
    }

    public Graph getSubgraph() {
        return subgraph;
    }

    public Graph getOrderedSubgraph() {
        return orderedSubgraph;
    }

    public String getStructure() {
        return structure;
    }

    public void setPerfectStructure(String structure) {
        this.structure = structure;
        
    }
    
    public int getLowestError(){
        ArrayList<Integer> listError = new ArrayList<>();
        listError.add(cliqueError);
        listError.add(starError);
        listError.add(bipartiteError);
        listError.add(chainError);
        
        listError.sort(null);
        
        // return lowest error
        return listError.get(0);
    }

    public int getCliqueError() {
        return cliqueError;
    }

    public void setCliqueError(int cliqueError) {
        this.cliqueError = cliqueError;
    }

    public int getStarError() {
        return starError;
    }

    public void setStarError(int starError) {
        this.starError = starError;
    }

    public int getBipartiteError() {
        return bipartiteError;
    }

    public void setBipartiteError(int bipartiteError) {
        this.bipartiteError = bipartiteError;
    }

    public int getChainError() {
        return chainError;
    }

    public void setChainError(int chainError) {
        this.chainError = chainError;
    }

    void reorderSubgraph() {
        // get ordered degree
        ArrayList<Node> orderNode = Toolkit.degreeMap(subgraph);
        
        for(Node n : orderNode){
            // create node ordered by degree
            orderedSubgraph.addNode(n.getId());
        }
        
        // get list edge dari subgraph
        int idEdgeSubgraph = 0;
        for(Node n : orderNode){
            // create edge
            Iterator<Node> nFriend = n.getNeighborNodeIterator();
            
            // iterasi friend satu per satu
            while(nFriend.hasNext()){
                Node friend = nFriend.next();
                orderedSubgraph.addEdge(idEdgeSubgraph+"", friend.getId(), n.getId());
                idEdgeSubgraph++;
            }
        }
    }

    
}
