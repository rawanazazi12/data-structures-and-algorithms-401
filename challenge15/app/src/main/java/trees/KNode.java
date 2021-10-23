package trees;

import java.util.ArrayList;
import java.util.List;

public class KNode {
    String data;
    List<KNode> children;

    public KNode(String data) {
        this.data = data;
        children = new ArrayList<KNode>();
    }
}
