package org.example.secondmodule.secondmodulemain;
import org.example.secondmodule.secondmodulefirsttask.WorkingWithDates;
import org.example.secondmodule.secondmodulesecondtask.WorkingWithListOfNames;
import org.example.secondmodule.secondmodulethirdtask.Edge;
import org.example.secondmodule.secondmodulethirdtask.GraphHandler;
import org.example.secondmodule.secondmodulethirdtask.Node;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task_1:");
        System.out.println(WorkingWithDates.creatingNewListOfDates(WorkingWithDates.creatingListOfDates()));
        System.out.println("====================================================================================================");
        System.out.println("Task_2:");
        System.out.println(WorkingWithListOfNames.findFirstUniqueElement(WorkingWithListOfNames.creatingListOfNames()));
        System.out.println("==========");
        Node firstNode = new Node("Kotor", 1);
        Node secondNode = new Node("Budva", 2);
        Node thirdNode = new Node("Bar", 3);
        Node fourthNode = new Node("Perast", 4);
        Node fifthNode = new Node("Tivat", 5);

        List<Node> nodes = new ArrayList<>();
        nodes.add(firstNode);
        nodes.add(secondNode);
        nodes.add(thirdNode);
        nodes.add(fourthNode);
        nodes.add(fifthNode);

        firstNode.adjacency = new Edge[] {new Edge(2,10), new Edge(4,15), new Edge(5,5)};
        secondNode.adjacency = new Edge[] {new Edge(1,10), new Edge(3,10), new Edge(4,7), new Edge(5,5)};
        thirdNode.adjacency = new Edge[] {new Edge(1,10), new Edge(4,7)};
        fourthNode.adjacency = new Edge[] {new Edge(1,15), new Edge(2,7), new Edge(3,7), new Edge(5,10)};
        fifthNode.adjacency = new Edge[] {new Edge(1,5), new Edge(2,5), new Edge(4, 10)};

        GraphHandler.computePaths(nodes, firstNode);
        double minCostFromKotorToPerast = fourthNode.minDistance;
        System.out.println("Task_3:");
        System.out.println("Min cost from Kotor to Perast: " + minCostFromKotorToPerast);
        String firstCheapestPath = "Min cost from Kotor to Perast: " + minCostFromKotorToPerast + ".\n";

        GraphHandler.computePaths(nodes, firstNode);
        double minCostFromKotorToBar = thirdNode.minDistance;
        System.out.println("Min cost from Kotor to Bar: " + minCostFromKotorToBar);
        String secondCheapestPath = "Min cost from Kotor to Bar: " + minCostFromKotorToBar+ ".";

        File file = new File("output.txt");
        try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(firstCheapestPath);
                writer.write(secondCheapestPath);
                writer.flush();
                writer.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
