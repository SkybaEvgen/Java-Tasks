public class Point implements Comparable<Point> {
    int kind;
    double value;

    public Point(int kind, double value) {
        this.kind = kind;
        this.value = value;
    }

    public int getKind() {
        return kind;
    }

    @Override
    public int compareTo(Point o) {
        return Double.compare(value, o.value);
    }
}
