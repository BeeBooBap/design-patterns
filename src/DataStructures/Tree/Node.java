package DataStructures.Tree;

import java.util.Set;

public record Node(int value, Set<Node> children) {};

