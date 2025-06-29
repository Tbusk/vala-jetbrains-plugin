using Gee;

public class WeightedGraph : Graph {
    public HashMap<Edge?, double?> edge_weights { get; set; default = new HashMap<Edge?, double?>
        ((Gee.HashDataFunc<Edge>) edge_hash,
        (Gee.EqualDataFunc<Edge>) edge_equal)
        ;
    }

    public void add_directed_edge (Vertex from_vertex, Vertex to_vertex, double weight = 1.0f) {
        vertex_connection_mappings[from_vertex].add (to_vertex);
        edge_weights[Edge (){from_vertex=from_vertex, to_vertex=to_vertex}] = weight;
    }

    public void add_undirected_edge (Vertex first_vertex, Vertex second_vertex, double weight = 1.0f) {
        add_directed_edge ( first_vertex, second_vertex, weight);
        add_directed_edge (second_vertex, first_vertex, weight);
    }
}