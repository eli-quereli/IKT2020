package uebungen.uebung04_directedGraph;

public class Edge {

    float weight;
    Node start;
    Node end;

    public Edge(Node start, Node end, float weight) {
        this.weight = weight;
        this.start = start;
        this.end = end;
    }

    public float getWeight() { return this.weight;}
    public Node getStart() { return this.start;}
    public Node getEnd() { return this.end; }



}
