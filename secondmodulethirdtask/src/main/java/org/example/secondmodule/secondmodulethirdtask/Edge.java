package org.example.secondmodule.secondmodulethirdtask;

public class Edge {

    private String fromWhichCity;
    private int fromNodeIndex;
    private int toNodeIndex;
    private int cost;

    public Edge(String fromWhichCity, int fromNodeIndex, int toNodeIndex, int cost) {
        this.fromWhichCity = fromWhichCity;
        this.fromNodeIndex = fromNodeIndex;
        this.toNodeIndex = toNodeIndex;
        this.cost = cost;
    }

    public String getFromWhichCity() {
        return fromWhichCity;
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
