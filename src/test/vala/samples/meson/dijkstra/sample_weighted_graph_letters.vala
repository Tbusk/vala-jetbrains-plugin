public static void main(string[] args) {
    WeightedGraph graph = new WeightedGraph();

    Vertex a_node = new Vertex ();
    a_node.label = "a";
    graph.add_vertex (a_node);

    Vertex b_node = new Vertex ();
    b_node.label = "b";
    graph.add_vertex (b_node);

    Vertex c_node = new Vertex ();
    c_node.label = "c";
    graph.add_vertex (c_node);

    Vertex d_node = new Vertex ();
    d_node.label = "d";
    graph.add_vertex (d_node);

    Vertex e_node = new Vertex ();
    graph.add_vertex (e_node);
    e_node.label = "e";

    Vertex f_node = new Vertex();
    graph.add_vertex (f_node);
    f_node.label = "f";

    Vertex g_node = new Vertex();
    graph.add_vertex (g_node);
    g_node.label = "g";

    graph.add_undirected_edge (a_node, b_node, 8);
    graph.add_undirected_edge (a_node, c_node, 7);
    graph.add_undirected_edge (a_node, d_node, 3);
    graph.add_undirected_edge (b_node, e_node, 6);
    graph.add_undirected_edge (c_node, d_node, 1);
    graph.add_undirected_edge (c_node, e_node, 2);
    graph.add_undirected_edge (d_node, f_node, 15);
    graph.add_undirected_edge (d_node, g_node, 12);
    graph.add_undirected_edge (e_node, f_node, 4);
    graph.add_undirected_edge (f_node, g_node, 1);

    Dijkstras.get_shortest_path (graph, a_node);
    Dijkstras.print_path (a_node, g_node);
}