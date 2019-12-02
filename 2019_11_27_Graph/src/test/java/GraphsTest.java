import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphsTest {

    Graphs graphs;

    List<List<Integer>> graph;

    @Before
    public void init() {
        graph = initGraph(new  Integer[][] {{3}, {2, 3}, {1}, {1, 4, 0}, {3}});
    }

    private List<List<Integer>> initGraph(Integer[][] source) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < source.length; i++) {
           /* List<Integer> nodes = new ArrayList<>();
            for (int j = 0; j <source[j].length ; j++) {
                nodes.add(source[i][j]);
            }
            res.add(nodes);*/
           res.add(Arrays.asList(source[i]));
        }
        return res;
    }

    @Test
    public void testGraphs(){

    }

}
