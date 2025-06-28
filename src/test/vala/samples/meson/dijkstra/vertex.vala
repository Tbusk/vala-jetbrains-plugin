public class Vertex : Object {
    public string label { get; set; }
    // Using double.MAX instead of double.INFINITY due to a barrage of assertion errors that pop up
    public double distance { get; set; default = double.MAX; }
    public Vertex? predecessor { get; set; default = null; }
}