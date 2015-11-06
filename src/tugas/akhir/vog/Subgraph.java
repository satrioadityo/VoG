/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir.vog;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author Satrio
 */
public class Subgraph {
    Graph subgraph = new MultiGraph("subgraph");
    
    public void addNode(String id){
        subgraph.addNode(id);
    }
    
    public void addEdge(String idEdge, String from, String to){
        subgraph.addEdge(idEdge, from, to);
    }

    public Graph getSubgraph() {
        return subgraph;
    }
    
    
}
