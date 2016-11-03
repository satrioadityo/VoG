/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir.vog;

/**
 *
 * @author Satrio
 */
public class Model {
    int[][] cliqueModel;
    int[][] starModel;
    int[][] bipartiteModel;
    int[][] chainModel;

    public int[][] getCliqueModel() {
        return cliqueModel;
    }

    public int[][] getStarModel() {
        return starModel;
    }

    public int[][] getBipartiteModel() {
        return bipartiteModel;
    }
    
    void generateClique(int sizeMatrix){
        cliqueModel = new int[sizeMatrix][sizeMatrix];
        for(int i = 0; i < sizeMatrix; i++){
            for(int j = 0; j< sizeMatrix; j++){
                if(i == j){
                    cliqueModel[i][j] = 0;
                }
                else{
                    cliqueModel[i][j] = 2;
                }
            }
        }
    }
    
    void generateStar(int sizeMatrix){
        starModel = new int[sizeMatrix][sizeMatrix];
        for(int i = 0; i < sizeMatrix; i++){
            for(int j = 0; j< sizeMatrix; j++){
                if((i == 0 && j != 0) || (j == 0 && i != 0)){
                    starModel[i][j] = 2;
                }
                else{
                    starModel[i][j] = 0;
                }
            }
        }
    }
    
    void generateBipartite(int sizeMatrix){
        if(sizeMatrix % 2 == 1){
            bipartiteModel = new int[sizeMatrix][sizeMatrix];
            for(int i = 0; i < sizeMatrix; i++){
                for(int j = 0; j< sizeMatrix; j++){
                    if(    ((j > (sizeMatrix/2-1)) && (i < (sizeMatrix/2))) 
                            ||
                            ((j < (sizeMatrix/2)) && (i > (sizeMatrix/2-1))) ){
                        bipartiteModel[i][j] = 2;
                    }
                    else{
                        bipartiteModel[i][j] = 0;
                    }
                }
            }
        }
        else{
            bipartiteModel = new int[sizeMatrix][sizeMatrix];
        }
        
    }
}
