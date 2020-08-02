package org.example.secondmodule.secondmodulemain;
import org.example.secondmodule.secondmodulefirsttask.WorkingWithDates;
import org.example.secondmodule.secondmodulesecondtask.WorkingWithListOfNames;
import org.example.secondmodule.secondmodulethirdtask.cheapestpath.Edge;
import org.example.secondmodule.secondmodulethirdtask.cheapestpath.Graph;

public class Main {
    public static void main(String[] args) {

        Edge[] edges = {
                new Edge(0,1,10),
                new Edge(0,3,15),
                new Edge(0,4,5),
                new Edge(1,0,10),
                new Edge(1,2,10),
                new Edge(1,3,7),
                new Edge(1,4,5),
                new Edge(2,0,10),
                new Edge(2,3,7),
                new Edge(3,0,15),
                new Edge(3,1,7),
                new Edge(3,2,7),
                new Edge(3,4,10),
                new Edge(4,0,5),
                new Edge(4,1,5),
                new Edge(4,3,10)

        };

        Graph graph = new Graph(edges);
        graph.calculateCheapestPath();
        graph.printData();

        System.out.println("Task_1:");
        System.out.println(WorkingWithListOfNames.findFirstUniqueElement(WorkingWithListOfNames.creatingListOfNames()));
        System.out.println("==========");
        System.out.println("Task_2:");
        System.out.println(WorkingWithDates.creatingNewListOfDates(WorkingWithDates.creatingListOfDates()));
        System.out.println("====================================================================================================");
    }
}
