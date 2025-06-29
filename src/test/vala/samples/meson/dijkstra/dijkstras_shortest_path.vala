using Gee;

namespace Dijkstras {
    public void get_shortest_path (WeightedGraph graph, Vertex starting_vertex) {

        Gee.List<Vertex> unvisited_vertices = new Gee.ArrayList<Vertex> ();
        unvisited_vertices.add_all (graph.vertex_connection_mappings.keys);

        starting_vertex.distance = 0;

        while (unvisited_vertices.size > 0) {

            int smallest_index = 0;

            // Get the index with the smallest distance and update smallest_index
            for (int index = 1; index < unvisited_vertices.size; index++) {
                if (unvisited_vertices.get (index).distance < unvisited_vertices.get (smallest_index).distance) {
                    smallest_index = index;
                }
            }

            Vertex current_vertex = unvisited_vertices.remove_at (smallest_index);

            // Check connected nodes
            foreach (Vertex adjacent_vertex in graph.vertex_connection_mappings[current_vertex]) {

                double edge_weight = graph.edge_weights[Edge (){from_vertex=current_vertex, to_vertex=adjacent_vertex}];
                double alternate_path_distance = current_vertex.distance + edge_weight;

                // check if the predecessor vertex distance is less than this path, and if so, update it
                if (alternate_path_distance < adjacent_vertex.distance) {
                    adjacent_vertex.distance = alternate_path_distance;
                    adjacent_vertex.predecessor = current_vertex;
                }
            }
        }
    }

    public void print_path(Vertex starting_vertex, Vertex ending_vertex) {
        if (ending_vertex.distance == double.MAX) {
                stdout.printf("No path found from %s to %s.\n", starting_vertex.label, ending_vertex.label);
                return;
        }

        string path = "";
        Vertex current_vertex = ending_vertex;

        while (current_vertex != null && current_vertex != starting_vertex) {
            path = " -> " + current_vertex.label + path;
            current_vertex = current_vertex.predecessor;
        }

        path = starting_vertex.label + path;
        stdout.printf("Shortest path (%g): %s\n", ending_vertex.distance, path);
    }
}