package challenge35;

import java.util.Objects;

public class Node<V> {
    V value;

    public Node(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + value +
                "}";
    }
}
