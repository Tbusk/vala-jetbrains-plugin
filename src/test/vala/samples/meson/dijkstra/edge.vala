public struct Edge {
    public Vertex from_vertex;
    public Vertex to_vertex;
}

public bool edge_equal (Edge first_edge, Edge second_edge) {
    return first_edge.from_vertex == second_edge.from_vertex &&
           first_edge.to_vertex == second_edge.to_vertex;
}

public uint edge_hash (Edge edge) {
    uint hash = 7;
    hash = 31 * hash + edge.from_vertex.label.hash();
    hash = 31 * hash + edge.to_vertex.label.hash();
    return hash;
}