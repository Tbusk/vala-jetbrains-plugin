using Gee;

public class Graph : Object {
    public HashMap<Vertex, Gee.List<Vertex>> vertex_connection_mappings { get; set; default = new HashMap<Vertex, Gee.List<Vertex>> (); }

    public void add_vertex (Vertex vertex) {
        vertex_connection_mappings[vertex] = new Gee.ArrayList<Vertex> ();
    }

    public void remove_vertex (Vertex vertex) {
        vertex_connection_mappings.unset (vertex);
    }
}