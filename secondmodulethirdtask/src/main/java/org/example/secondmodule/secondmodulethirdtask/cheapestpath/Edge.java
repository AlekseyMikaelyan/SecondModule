package org.example.secondmodule.secondmodulethirdtask.cheapestpath;

public class Edge {

    private int fromNodeIndex;
    private int toNodeIndex;
    private int cost;

    public Edge(int fromNodeIndex, int toNodeIndex, int cost) {
        this.fromNodeIndex = fromNodeIndex;
        this.toNodeIndex = toNodeIndex;
        this.cost = cost;
    }

    public int getFromNodeIndex() {
        return fromNodeIndex;
    }

    public int getToNodeIndex() {
        return toNodeIndex;
    }

    public int getCost() {
        return cost;
    }

    public int getNeighbourIndex(int nodeIndex) {
        if(this.fromNodeIndex == nodeIndex) {
            return this.toNodeIndex;
        } else {
            return this.fromNodeIndex;
        }
    }
}
