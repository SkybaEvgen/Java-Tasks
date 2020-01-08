import java.util.Objects;

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

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "kind " + kind + ", value " + value;
    }

    @Override
    public int compareTo(Point o) {
        return Double.compare(value, o.value);
    }
}
