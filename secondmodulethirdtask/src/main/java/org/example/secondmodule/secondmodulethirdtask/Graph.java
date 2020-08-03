package org.example.secondmodule.secondmodulethirdtask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Graph {

    private Node[] nodes;
    private int noOfNodes;
    private Edge[] edges;
    private int noOfEdges;

    public Graph(Edge[] edges) {
        this.edges = edges;
        this.noOfNodes = calculateNoOfNodes(edges);
        this.nodes = new Node[this.noOfNodes];

        for(int i = 0; i < this.noOfNodes; i++) {
            this.nodes[i] = new Node();
        }

        this.noOfEdges = edges.length;

        for(int j = 0; j < this.noOfEdges; j++) {
            this.nodes[edges[j].getFromNodeIndex()].getEdges().add(edges[j]);
            this.nodes[edges[j].getToNodeIndex()].getEdges().add(edges[j]);
        }
    }

    private int calculateNoOfNodes(Edge[] edges) {
        int noOfNodes = 0;
        for(Edge e : edges) {
            if(e.getToNodeIndex() > noOfNodes) {
                noOfNodes = e.getFromNodeIndex();
            }
            if(e.getFromNodeIndex() > noOfNodes) {
                noOfNodes = e.getFromNodeIndex();
            }
        }
        noOfNodes++;
        return noOfNodes;
    }

    public void calculateCheapestPath() {
        this.nodes[0].setDistanceFromSource(0);
        int nextNode = 0;

        for(int i = 0; i < this.nodes.length; i++) {
            List<Edge> currentNodeEdges = this.nodes[nextNode].getEdges();

            for(int j = 0; j < currentNodeEdges.size(); j++) {
                int neighbourIndex = currentNodeEdges.get(j).getNeighbourIndex(nextNode);

                if(!this.nodes[neighbourIndex].isVisited()) {
                    int tentative = this.nodes[nextNode].getDistanceFromSource() + currentNodeEdges.get(j).getCost();

                    if(tentative < nodes[neighbourIndex].getDistanceFromSource()) {
                        nodes[neighbourIndex].setDistanceFromSource(tentative);
                    }
                }
            }
            nodes[nextNode].setVisited(true);

            nextNode = getCheapestPath();
        }
    }

    private int getCheapestPath() {
        int storedNodeIndex = 0;
        int storedDist = Integer.MAX_VALUE;

        for(int i = 0; i < this.nodes.length; i++) {
            int currentDist = this.nodes[i].getDistanceFromSource();
            if(!this.nodes[i].isVisited() && currentDist < storedDist) {
                storedDist = currentDist;
                storedNodeIndex = i;
            }
        }
        return storedNodeIndex;
    }

    public void printData() {
        String output = "Number of nodes = " + this.noOfNodes;
        output += "\nNumber of edges = " + this.noOfEdges;

        for(int i = 0; i < this.nodes.length; i++) {
            output += "\nThe cheapest distance from node 0 to node " + i + " is " + nodes[i].getDistanceFromSource();
        }

        File file = new File("output.txt");
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(output);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Node[] getNodes() {
        return nodes;
    }

    public int getNoOfNodes() {
        return noOfNodes;
    }

    public Edge[] getEdges() {
        return edges;
    }

    public int getNoOfEdges() {
        return noOfEdges;
    }
}
