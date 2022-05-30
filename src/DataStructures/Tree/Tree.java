package DataStructures.Tree;

public class Tree {

    public int leaves(Node t){
        if (t.children().size() == 0){
            return 0;
        }
        int sum = 0;
        for (var ch : t.children()){
            sum += leaves(ch);
        }
        return sum;
    }

    public Node getNode(Node t, int v){
        if (t == null){return null;}
        if (t.value() == v){return t;}

        for (var ch : t.children()){
            var n = getNode(ch, v);
            if (n != null) return n;
        }
        return null;
    }
}
