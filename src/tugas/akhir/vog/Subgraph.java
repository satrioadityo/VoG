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
