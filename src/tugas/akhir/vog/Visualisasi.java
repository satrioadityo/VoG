/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir.vog;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.algorithm.ConnectedComponents;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.stream.file.FileSinkDGS;
import org.graphstream.stream.file.FileSourceDGS;
import org.graphstream.ui.swingViewer.View;
import org.graphstream.ui.swingViewer.Viewer;
import org.graphstream.algorithm.Toolkit;
import org.graphstream.algorithm.generator.BarabasiAlbertGenerator;
import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.RandomEuclideanGenerator;
import org.graphstream.algorithm.generator.RandomGenerator;
import org.graphstream.graph.Node;

/**
 *
 * @author satrio
 */
public class Visualisasi extends javax.swing.JFrame {

    /**
     * Creates new form Visualisasi
     */
    
    String styleSheet = "";
    Graph graph;
    int idUrl, idUser, idEdge;
    private int idNextUrl;
    private Viewer viewer;
    
    public Visualisasi() {
        initComponents();
        
        // untuk styling visualisasi graph
        styleSheet = "node {fill-color: blue; size: 10px;}"+
                     "edge {fill-color: black; arrow-shape: arrow; arrow-size: 5px, 4px;}"+
                     "node.question {fill-color: green;}"+
                     "node.user {fill-color: blue;}";
        
        graph = new MultiGraph("Graph Quora");
        graph.addAttribute("ui.stylesheet", styleSheet);
        viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        
        generateSampleGraphWithMatrix();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        paneMain = new javax.swing.JPanel();
        paneGraphVis = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        paneVisualisasi = new javax.swing.JPanel();
        paneContainerQuery = new javax.swing.JPanel();
        txtInputQuery = new javax.swing.JTextField();
        btnUpCamera = new javax.swing.JButton();
        btnDownCamera = new javax.swing.JButton();
        btnRightCamera = new javax.swing.JButton();
        btnLeftCamera = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemLoadGraph = new javax.swing.JMenuItem();
        menuItemLoadGraphRaw = new javax.swing.JMenuItem();
        menuItemSaveGraph = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneMain.setBackground(new java.awt.Color(1, 1, 1));

        paneVisualisasi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paneVisualisasiMouseDragged(evt);
            }
        });
        paneVisualisasi.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                paneVisualisasiMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout paneVisualisasiLayout = new javax.swing.GroupLayout(paneVisualisasi);
        paneVisualisasi.setLayout(paneVisualisasiLayout);
        paneVisualisasiLayout.setHorizontalGroup(
            paneVisualisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        paneVisualisasiLayout.setVerticalGroup(
            paneVisualisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Visualisasi", paneVisualisasi);

        javax.swing.GroupLayout paneGraphVisLayout = new javax.swing.GroupLayout(paneGraphVis);
        paneGraphVis.setLayout(paneGraphVisLayout);
        paneGraphVisLayout.setHorizontalGroup(
            paneGraphVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneGraphVisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        paneGraphVisLayout.setVerticalGroup(
            paneGraphVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneGraphVisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtInputQuery.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtInputQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputQueryActionPerformed(evt);
            }
        });

        btnUpCamera.setText("up");
        btnUpCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpCameraActionPerformed(evt);
            }
        });

        btnDownCamera.setText("Down");
        btnDownCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownCameraActionPerformed(evt);
            }
        });

        btnRightCamera.setText("Right");
        btnRightCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightCameraActionPerformed(evt);
            }
        });

        btnLeftCamera.setText("Left");
        btnLeftCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftCameraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneContainerQueryLayout = new javax.swing.GroupLayout(paneContainerQuery);
        paneContainerQuery.setLayout(paneContainerQueryLayout);
        paneContainerQueryLayout.setHorizontalGroup(
            paneContainerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneContainerQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInputQuery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneContainerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneContainerQueryLayout.createSequentialGroup()
                        .addComponent(btnLeftCamera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRightCamera))
                    .addComponent(btnUpCamera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDownCamera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneContainerQueryLayout.setVerticalGroup(
            paneContainerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneContainerQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneContainerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneContainerQueryLayout.createSequentialGroup()
                        .addComponent(btnUpCamera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneContainerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRightCamera)
                            .addComponent(btnLeftCamera))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDownCamera))
                    .addComponent(txtInputQuery))
                .addContainerGap())
        );

        javax.swing.GroupLayout paneMainLayout = new javax.swing.GroupLayout(paneMain);
        paneMain.setLayout(paneMainLayout);
        paneMainLayout.setHorizontalGroup(
            paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneGraphVis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneContainerQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneMainLayout.setVerticalGroup(
            paneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneGraphVis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneContainerQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuFile.setText("File");

        menuItemLoadGraph.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemLoadGraph.setText("Load Graph");
        menuItemLoadGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLoadGraphActionPerformed(evt);
            }
        });
        menuFile.add(menuItemLoadGraph);

        menuItemLoadGraphRaw.setText("Load Graph from Raw");
        menuItemLoadGraphRaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLoadGraphRawActionPerformed(evt);
            }
        });
        menuFile.add(menuItemLoadGraphRaw);

        menuItemSaveGraph.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSaveGraph.setText("Save Graph");
        menuItemSaveGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveGraphActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSaveGraph);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemExit);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");
        jMenuBar1.add(menuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void generateSampleGraphWithMatrix(){
        /**
         * use generator from graphstream
         */ 
        
        // ************* barbasi graph ****************/
//        Generator gen = new BarabasiAlbertGenerator(6);
//        // Generate 100 nodes:
//        gen.addSink(graph);
//        gen.begin();
//        for(int i=0; i<1000; i++) {
//            gen.nextEvents();
//        }
//        gen.end();
        
        // ************** random euclidean *************/
//        Generator gen = new RandomEuclideanGenerator();
//        gen.addSink(graph);
//        gen.begin();
//        for(int i=0; i<1000; i++) {
//            gen.nextEvents();
//        }
//        gen.end();
        
        // ************** random graph *************/
        Generator gen = new RandomGenerator(5);
        gen.addSink(graph);
        gen.begin();
        for(int i=0; i<1000; i++)
            gen.nextEvents();
        gen.end();
        
        // finish generate
        
        /**
         * outputting the adjacency matrix of the generated graph
         */
//        int[][] adjacencyMatrix = Toolkit.getAdjacencyMatrix(graph);
//        for (int i = 0; i < adjacencyMatrix.length; i++) {
//            for (int j = 0; j < adjacencyMatrix.length; j++) {
//                System.out.print(adjacencyMatrix[i][j]+" ");
//            }
//            System.out.println("");
//        }
        
        
        /**
         * proses shattering graph untuk generate subgraph
         */
        // ketika jumlah node di connected component dari graph lebih dari k proses GCC
        ConnectedComponents cc = new ConnectedComponents();
        cc.init(graph);
        while(cc.getGiantComponent().size() > 20){
            System.out.println("GCC size : "+cc.getGiantComponent().size());
            System.out.printf("%d connected component(s) in this graph, so far.%n",
                               cc.getConnectedComponentsCount());
            
            // temukan node dgn degree paling tinggi
            Node highestDegreeNode = Toolkit.degreeMap(graph).get(0);
            graph.removeNode(highestDegreeNode);
            
            System.out.printf("Eventually, there are %d.%n",
                        cc.getConnectedComponentsCount());
        }
        
        graph.display();
    }
    
    private void menuItemLoadGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLoadGraphActionPerformed
        
        // open file dialog untuk memilih graph database
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("file dgs", "dgs");
        fc.setFileFilter(filter);
        int rtn = fc.showOpenDialog(this);
        
        if(rtn == JFileChooser.APPROVE_OPTION){
            String file = fc.getSelectedFile().getAbsolutePath();
            System.out.println(file);
            
            FileSourceDGS fdgs = new FileSourceDGS();
            fdgs.addSink(graph);
            
            try {
                // proses load data
                fdgs.readAll(file);
            } catch (IOException ex) {
                Logger.getLogger(Visualisasi.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                fdgs.removeSink(graph);
            }
            System.out.println("success load "+ file);
            
            // diplay graph to panel
            View view = viewer.addDefaultView(false);
            viewer.enableAutoLayout();
            paneVisualisasi.setLayout(new BorderLayout());
            paneVisualisasi.add(view, BorderLayout.CENTER);
            paneVisualisasi.setVisible(true);
        }
        else {
            System.err.println("Load canceled !");
        }
        
    }//GEN-LAST:event_menuItemLoadGraphActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // exit the apps
        System.exit(1);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemSaveGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveGraphActionPerformed
        
        // open save dialog to save the graph
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int rtn = fc.showSaveDialog(this);
        if(rtn == JFileChooser.APPROVE_OPTION){
            String file = fc.getSelectedFile().getAbsolutePath();
            try {
                // save current graph to dgs file
                FileSinkDGS fsdgs = new FileSinkDGS();
                fsdgs.writeAll(graph, file);
                System.out.println("success save "+ file);
            } catch (IOException ex) {
                Logger.getLogger(Visualisasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            System.err.println("Save canceled !");
        }
    }//GEN-LAST:event_menuItemSaveGraphActionPerformed

    private void txtInputQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputQueryActionPerformed
        // TODO query processing dari text yg diinput user
        String inputUser = txtInputQuery.getText();
        
        // identifikasi query
        if (inputUser.equals("disableAutoLayout()")){
            viewer.disableAutoLayout();
        }
        else if(inputUser.equals("enableAutoLayout()")){
            viewer.enableAutoLayout();
        }
        else if(inputUser.equals("resetView()")){
            View view = viewer.getDefaultView();
            view.getCamera().resetView();
        }
        else if(inputUser.equals("getGraphInfo()")){
            JOptionPane.showMessageDialog(this, "Jumlah node : " + graph.getNodeCount() + "\nJumlah edge : " +
                    graph.getEdgeCount(), "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong query !", "Graph Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtInputQueryActionPerformed

    private void menuItemLoadGraphRawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLoadGraphRawActionPerformed
        // TODO load graph from Raw Web
        
        // open file dialog untuk memilih graph database
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("file text", "txt");
        fc.setFileFilter(filter);
        int rtn = fc.showOpenDialog(this);
        
        BufferedReader br = null;
        
        if(rtn == JFileChooser.APPROVE_OPTION){
            try {
                // load dari txt
                String filePath = fc.getSelectedFile().getAbsolutePath();
                String line;
                ArrayList<String> listNodeUser = new ArrayList<>();
                
                br = new BufferedReader(new FileReader(new File(filePath)));
                
                // read file perline
                idUser = graph.getNodeCount();
                idEdge = graph.getEdgeCount();
                
                while((line = br.readLine()) != null){
                    // proses perline parsing jadi node USER, edgenya adalah url.
                    String url = null;
                    
                    // ada row dari raw data yang ga ada usernya, eliminasi aja
                    if(!"[]".equals(line.split("###")[1])){
                        // DAPAT EDGE URL
                        url = line.split("###")[0];
                    
                        String rawUser = line.split("###")[1];
                        // karena listNodeUser masih ada [ dan ], maka hilangkan dulu
                        rawUser = rawUser.substring(1, rawUser.length()-1);
                        for (String user : rawUser.split(", ")) {
                            // DAPAT KUMPULAN NODE USER
                            if(!user.equals("Quora User")){
                                listNodeUser.add(user);
                            } else{
                                System.out.println("Anonymous User found ! (rejected)");
                            }
                            
                        }
                        
                        // dari node-node yang sudah didapat, buat node di graphstream                        
                        // buat node user
                        for(String user : listNodeUser){
                            // jika user belum ada, buat node user, hubungkan dengan url
                            if(graph.getNode(user) == null){
                                graph.addNode(user);
                                graph.getNode(user).addAttribute("ui.class", "user");
                                graph.getNode(user).addAttribute("ui.label", user);
                            }
                            // kalo ada langsung hubungkan
                            else{
                                System.out.println("Node user "+user+ "already created");
                            }
                            idUser++;
                        }
                        // hubungkan ke node user lainnya yg ada di url yang sama
                        
                        for(String user : listNodeUser){
                            for(String anotherUser : listNodeUser){
                                if(!user.equals(anotherUser) && !graph.getNode(user).hasEdgeBetween(anotherUser)){
                                    graph.addEdge(idEdge+"", user, anotherUser);
//                                    graph.getEdge(idEdge+"").addAttribute("ui.label", url);
                                    idEdge++;
                                }
                                else{
                                    System.out.println("edge already exist");
                                }
                            }
                            
                        }
                        // kosongkan lagi usernya
                        listNodeUser.clear();
                    }
                    else{
                        System.err.println("got an empty user on line " + (idUrl+1) + " on " + filePath);
                    }
                    idUrl++;
                }
                
                System.out.println("success load "+ filePath);
                // diplay graph to panel
                View view = viewer.addDefaultView(false);
                viewer.enableAutoLayout();
                paneVisualisasi.setLayout(new BorderLayout());
                paneVisualisasi.add(view, BorderLayout.CENTER);
                paneVisualisasi.setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Visualisasi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Visualisasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            System.out.println("Load canceled");
        }
    }//GEN-LAST:event_menuItemLoadGraphRawActionPerformed

    
    int scroll = 900;
    private void paneVisualisasiMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_paneVisualisasiMouseWheelMoved
        // TODO zooming the visualization
        int rotate = evt.getWheelRotation();
        double nRotate = evt.getUnitsToScroll();
        
        if (rotate < 0) {
            // scroll up, zoom in
            if(!(scroll < 1)){
                View view = viewer.getDefaultView();
                view.getCamera().setViewPercent(0.001*scroll);
            }
            else{
                scroll = 500;
            }
            scroll-=20;
        } else {
            // scroll down, zoom out
            if(!(scroll > 900)){
                View view = viewer.getDefaultView();
                view.getCamera().setViewPercent(0.001*scroll);
            }
            else{
                scroll = 500;
            }
            scroll+=20;
        }
    }//GEN-LAST:event_paneVisualisasiMouseWheelMoved

    private void paneVisualisasiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneVisualisasiMouseDragged
        // TODO add your handling code here:
        System.out.println("Dragged");
        View view = viewer.getDefaultView();
        view.getCamera().setViewCenter(evt.getX(), evt.getY(), 0);
    }//GEN-LAST:event_paneVisualisasiMouseDragged

    private void btnUpCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpCameraActionPerformed
        // TODO add your handling code here:
        View view = viewer.getDefaultView();
        double x = view.getCamera().getViewCenter().x;
        double y = view.getCamera().getViewCenter().y;
        view.getCamera().setViewCenter(x, (y+0.5), 0);
    }//GEN-LAST:event_btnUpCameraActionPerformed

    private void btnDownCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownCameraActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        View view = viewer.getDefaultView();
        double x = view.getCamera().getViewCenter().x;
        double y = view.getCamera().getViewCenter().y;
        view.getCamera().setViewCenter(x, (y-0.5), 0);
    }//GEN-LAST:event_btnDownCameraActionPerformed

    private void btnLeftCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftCameraActionPerformed
        // TODO add your handling code here:
        View view = viewer.getDefaultView();
        double x = view.getCamera().getViewCenter().x;
        double y = view.getCamera().getViewCenter().y;
        view.getCamera().setViewCenter((x-0.5), y, 0);
    }//GEN-LAST:event_btnLeftCameraActionPerformed

    private void btnRightCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightCameraActionPerformed
        // TODO add your handling code here:
        View view = viewer.getDefaultView();
        double x = view.getCamera().getViewCenter().x;
        double y = view.getCamera().getViewCenter().y;
        view.getCamera().setViewCenter((x+0.5), y, 0);
    }//GEN-LAST:event_btnRightCameraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualisasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualisasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDownCamera;
    private javax.swing.JButton btnLeftCamera;
    private javax.swing.JButton btnRightCamera;
    private javax.swing.JButton btnUpCamera;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLoadGraph;
    private javax.swing.JMenuItem menuItemLoadGraphRaw;
    private javax.swing.JMenuItem menuItemSaveGraph;
    private javax.swing.JPanel paneContainerQuery;
    private javax.swing.JPanel paneGraphVis;
    private javax.swing.JPanel paneMain;
    private javax.swing.JPanel paneVisualisasi;
    private javax.swing.JTextField txtInputQuery;
    // End of variables declaration//GEN-END:variables
}
