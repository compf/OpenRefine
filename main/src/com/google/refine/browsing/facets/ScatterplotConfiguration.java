public class ScatterplotConfiguration {

    private double min_x;
    private double max_x;
    private double min_y;
    private double max_y;
    private int dim_x;
    private int dim_y;
    private double dot;

    public ScatterplotConfiguration(double min_x, double max_x, double min_y, double max_y, int dim_x, int dim_y, double dot) {
        this.min_x = min_x;
        this.max_x = max_x;
        this.min_y = min_y;
        this.max_y = max_y;
        this.dim_x = dim_x;
        this.dim_y = dim_y;
        this.dot = dot;
    }

    // getters and setters for each private field

}