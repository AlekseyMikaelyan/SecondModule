package org.example.secondmodule.secondmodulemain;
import org.example.secondmodule.secondmodulefirsttask.WorkingWithDates;
import org.example.secondmodule.secondmodulesecondtask.WorkingWithListOfNames;
import org.example.secondmodule.secondmodulethirdtask.Edge;
import org.example.secondmodule.secondmodulethirdtask.Graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

            Edge[] edges = {
                    new Edge("Kotor",0,1,10),
                    new Edge("Kotor",0,3,15),
                    new Edge("Kotor",0,4,5),
                    new Edge("Budva",1,0,10),
                    new Edge("Budva",1,2,10),
                    new Edge("Budva",1,3,7),
                    new Edge("Budva",1,4,5),
                    new Edge("Bar",2,0,10),
                    new Edge("Bar",2,3,7),
                    new Edge("Perast",3,0,15),
                    new Edge("Perast",3,1,7),
                    new Edge("Perast",3,2,7),
                    new Edge("Perast",3,4,10),
                    new Edge("Tivat",4,0,5),
                    new Edge("Tivat",4,1,5),
                    new Edge("Tivat",4,3,10)

            };

            Graph graph = new Graph(edges);
            graph.calculateCheapestPath();
            graph.printData();


        System.out.println("Task_1:");
        System.out.println(WorkingWithDates.creatingNewListOfDates(WorkingWithDates.creatingListOfDates()));
        System.out.println("====================================================================================================");
        System.out.println("Task_2:");
        System.out.println(WorkingWithListOfNames.findFirstUniqueElement(WorkingWithListOfNames.creatingListOfNames()));
        System.out.println("==========");
    }
}
