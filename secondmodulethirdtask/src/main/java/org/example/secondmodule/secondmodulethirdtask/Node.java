package org.example.secondmodule.secondmodulethirdtask;

public class Node implements Comparable<Node> {

    public final String name;
    public final int index;
    public Edge[] adjacency;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Node previous;

    public Node(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public Edge[] getAdjacency() {
        return adjacency;
    }

    public void setAdjacency(Edge[] adjacency) {
        this.adjacency = adjacency;
    }

    @Override
    public int compareTo(Node other) {
        return Double.compare(minDistance, other.minDistance);
    }

    @Override
    public String toString() {
        return "Node[" +
                "name='" + name + '\'' +
                ", index=" + index +
                ']';
    }
}
