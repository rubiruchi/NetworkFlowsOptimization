/*
 * Copyright (C) 2019 anto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package NetworkFlowOptimization;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anto
 */
public class ShortestPathProblems extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form MinCostFlowProblems
     */
    public ShortestPathProblems() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        title = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        reloadGraph = new javax.swing.JCheckBox();
        back = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        arcsList = new javax.swing.JCheckBox();
        adjMatrix = new javax.swing.JCheckBox();
        graphType = new javax.swing.JComboBox<>();
        nodes = new javax.swing.JFormattedTextField();
        nodesLabel = new javax.swing.JLabel();
        percArcs = new javax.swing.JFormattedTextField();
        percArcsLabel = new javax.swing.JLabel();
        cycles = new javax.swing.JCheckBox();
        maxArcCost = new javax.swing.JFormattedTextField();
        maxArcCostLabel = new javax.swing.JLabel();
        randomSeed = new javax.swing.JFormattedTextField();
        randomSeedLabel = new javax.swing.JLabel();
        minArcCost = new javax.swing.JFormattedTextField();
        minArcCostLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        text.setEditable(false);
        text.setVerifyInputWhenFocusTarget(false);
        scroll.setViewportView(text);

        title.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        title.setText("Shortest Path Problems");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NetworkFlowOptimization/Logo_UniCa_64.png"))); // NOI18N

        reloadGraph.setText("Reload graph");
        reloadGraph.setEnabled(false);

        back.setInheritsPopupMenu(true);
        back.setLabel("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        arcsList.setText("Arcs List");

        adjMatrix.setText("Adjacency Matrix");

        graphType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personnel planning problem (Clark and Hastings [1977])", "Fixed graph with random arc costs", "Random graph", "Load graph" }));
        graphType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphTypeActionPerformed(evt);
            }
        });

        nodes.setColumns(5);
        nodes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nodes.setText("20");
        nodes.setToolTipText("Preferred number of nodes desired in the random graph");
        nodes.setEnabled(false);

        nodesLabel.setLabelFor(nodes);
        nodesLabel.setText("Number of nodes");
        nodesLabel.setToolTipText("");
        nodesLabel.setEnabled(false);

        percArcs.setColumns(5);
        percArcs.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        percArcs.setText("10");
        percArcs.setEnabled(false);

        percArcsLabel.setLabelFor(percArcs);
        percArcsLabel.setText("% arcs (1..100)");
        percArcsLabel.setEnabled(false);

        cycles.setText("Graph with cycles");
        cycles.setEnabled(false);

        maxArcCost.setColumns(5);
        maxArcCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        maxArcCost.setText("10");
        maxArcCost.setToolTipText("");
        maxArcCost.setEnabled(false);

        maxArcCostLabel.setLabelFor(maxArcCost);
        maxArcCostLabel.setText("Max arc cost");
        maxArcCostLabel.setEnabled(false);

        randomSeed.setColumns(5);
        randomSeed.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        randomSeed.setText("0");
        randomSeed.setEnabled(false);

        randomSeedLabel.setLabelFor(randomSeed);
        randomSeedLabel.setText("Random seed");
        randomSeedLabel.setEnabled(false);

        minArcCost.setColumns(5);
        minArcCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        minArcCost.setText("0");
        minArcCost.setEnabled(false);

        minArcCostLabel.setLabelFor(minArcCost);
        minArcCostLabel.setText("Minimun arc cost");
        minArcCostLabel.setEnabled(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, scroll)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(title)
                            .add(icon))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 99, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(adjMatrix)
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(layout.createSequentialGroup()
                                                .add(randomSeedLabel)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(randomSeed, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(cycles))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(nodesLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .add(percArcsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(percArcs)
                                            .add(nodes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(23, 23, 23)
                                        .add(calculate)
                                        .add(18, 18, 18)
                                        .add(back))
                                    .add(layout.createSequentialGroup()
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(maxArcCostLabel)
                                            .add(minArcCostLabel))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(maxArcCost, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                            .add(minArcCost)))))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(layout.createSequentialGroup()
                                    .add(12, 12, 12)
                                    .add(arcsList)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(reloadGraph)
                                    .add(211, 211, 211))
                                .add(graphType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 450, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(graphType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(title))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(reloadGraph)
                            .add(calculate)
                            .add(back)
                            .add(arcsList)
                            .add(adjMatrix))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(nodes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(nodesLabel)
                            .add(cycles)
                            .add(minArcCost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(minArcCostLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(percArcs, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(percArcsLabel)
                            .add(randomSeed, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(randomSeedLabel)
                            .add(maxArcCost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(maxArcCostLabel)))
                    .add(icon))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scroll, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        NetworkFlowOptimization.disposeChildFrame();
    }//GEN-LAST:event_backActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        String result = "";
        Graph graph = null;

        text.setText("");

        int n = graphType.getSelectedIndex();
        int minLocal = Integer.parseInt(minArcCost.getText());
        int maxLocal = Integer.parseInt(maxArcCost.getText());
        int seedLocal = Integer.parseInt(randomSeed.getText());
        int nodesLocal = Integer.parseInt(nodes.getText());
        @SuppressWarnings("unchecked")
        int arcPercentLocal = Integer.parseInt(percArcs.getText());
        boolean cycle = cycles.isSelected();

        switch (n) {
            case 3:
                if (NetworkFlowOptimization.graph == null || reloadGraph.isSelected()) {
                    try {
                        graph = GraphMaker.loadGraph();
                        if (graph == null) {
                            return;
                        }
                        NetworkFlowOptimization.graph = graph;
                    } catch (IOException ex) {
                        Logger.getLogger(NetworkFlowOptimization.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    graph = NetworkFlowOptimization.graph;
                    graph.resetFlows();
                }
                break;

            case 2:
                graph = GraphMaker.randomGraph(nodesLocal, arcPercentLocal, seedLocal, minLocal, maxLocal, 5, cycle, 10);
                break;
            case 1:
                graph = GraphMaker.exampleGraph(seedLocal, minLocal, maxLocal);
                break;
            default:
                graph = GraphMaker.sppGraphMaker();
                break;
        }

        if (adjMatrix.isSelected()) {
            text.setText(text.getText().concat(graph.adjMatrix()));
        }
        if (arcsList.isSelected()) {
            text.setText(text.getText().concat(graph.arcCosts()));
        }

        result = "Number of nodes = " + graph.nodesNumber() + " - " + "Number of arcs = " + graph.arcsNumber() + "\n\n";
        text.setText(text.getText().concat(result));

        result = ShortestPathProblem.dijkstra(graph);
        text.setText(text.getText().concat(result));
        result = ShortestPathProblem.heapDijkstra(graph);
        text.setText(text.getText().concat(result));
        result = ShortestPathProblem.dialDijkstra(graph);
        text.setText(text.getText().concat(result));
        result = ShortestPathProblem.RadixHeapDijkstra(graph);
        text.setText(text.getText().concat(result));
        result = ShortestPathProblem.dynamic(graph);
        text.setText(text.getText().concat(result));
        result = ShortestPathProblem.labelCorrecting(graph);
        text.setText(text.getText().concat(result));
        result = ShortestPathProblem.modifiedLabelCorrecting(graph);
        text.setText(text.getText().concat(result));
        result = ShortestPathProblem.dequeueLabelCorrecting(graph);
        text.setText(text.getText().concat(result));
    }//GEN-LAST:event_calculateActionPerformed

    private void graphTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphTypeActionPerformed
        int n = graphType.getSelectedIndex();
        switch (n) {
            case 0:
                minArcCost.setEnabled(false);
                minArcCostLabel.setEnabled(false);
                maxArcCost.setEnabled(false);
                maxArcCostLabel.setEnabled(false);
                randomSeed.setEnabled(false);
                randomSeedLabel.setEnabled(false);
                cycles.setEnabled(false);
                nodes.setEnabled(false);
                nodesLabel.setEnabled(false);
                percArcs.setEnabled(false);
                percArcsLabel.setEnabled(false);
                reloadGraph.setEnabled(false);
                break;
            case 1:
                minArcCost.setEnabled(true);
                minArcCostLabel.setEnabled(true);
                maxArcCost.setEnabled(true);
                maxArcCostLabel.setEnabled(true);
                randomSeed.setEnabled(true);
                randomSeedLabel.setEnabled(true);
                cycles.setEnabled(false);
                nodes.setEnabled(false);
                nodesLabel.setEnabled(false);
                percArcs.setEnabled(false);
                percArcsLabel.setEnabled(false);
                reloadGraph.setEnabled(false);
                break;
            case 2:
                minArcCost.setEnabled(true);
                minArcCostLabel.setEnabled(true);
                maxArcCost.setEnabled(true);
                maxArcCostLabel.setEnabled(true);
                randomSeed.setEnabled(true);
                randomSeedLabel.setEnabled(true);
                cycles.setEnabled(true);
                nodes.setEnabled(true);
                nodesLabel.setEnabled(true);
                percArcs.setEnabled(true);
                percArcsLabel.setEnabled(true);
                reloadGraph.setEnabled(false);
                break;
            case 3:
                minArcCost.setEnabled(false);
                minArcCostLabel.setEnabled(false);
                maxArcCost.setEnabled(false);
                maxArcCostLabel.setEnabled(false);
                randomSeed.setEnabled(false);
                randomSeedLabel.setEnabled(false);
                cycles.setEnabled(false);
                nodes.setEnabled(false);
                nodesLabel.setEnabled(false);
                percArcs.setEnabled(false);
                percArcsLabel.setEnabled(false);
                reloadGraph.setEnabled(true);
        }
    }//GEN-LAST:event_graphTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adjMatrix;
    private javax.swing.JCheckBox arcsList;
    private javax.swing.JButton back;
    private javax.swing.JButton calculate;
    private javax.swing.JCheckBox cycles;
    private javax.swing.JComboBox<String> graphType;
    private javax.swing.JLabel icon;
    private javax.swing.JFormattedTextField maxArcCost;
    private javax.swing.JLabel maxArcCostLabel;
    private javax.swing.JFormattedTextField minArcCost;
    private javax.swing.JLabel minArcCostLabel;
    private javax.swing.JFormattedTextField nodes;
    private javax.swing.JLabel nodesLabel;
    private javax.swing.JFormattedTextField percArcs;
    private javax.swing.JLabel percArcsLabel;
    private javax.swing.JFormattedTextField randomSeed;
    private javax.swing.JLabel randomSeedLabel;
    private javax.swing.JCheckBox reloadGraph;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextPane text;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
