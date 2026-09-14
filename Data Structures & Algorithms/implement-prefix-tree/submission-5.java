class PrefixTree {
    private PrefixTreeNode root;    


    public PrefixTree() {
        this.root = new PrefixTreeNode();
    }

    public void insert(String word) {
        PrefixTreeNode current = this.root;
        for(int o = 0; o < word.length(); o++){
            char ch = word.charAt(o);
            PrefixTreeNode node = current.children.get(ch);

            if(node == null){
                node = new PrefixTreeNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;

    }

    public boolean search(String word) {
        PrefixTreeNode current = this.root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            PrefixTreeNode node = current.children.get(ch);

            if(node == null){
                return false;
            }
            current = node;
        }
        if(current.endOfString == true){
            return true;
        } else {
            return false;
        }
    }

    public boolean startsWith(String prefix) {
        PrefixTreeNode current = this.root;
        System.out.println(current.children.entrySet());
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            PrefixTreeNode node = current.children.get(ch);
            if(node == null) return false;
            current = node;
        }
        return true;
    }
}


class PrefixTreeNode {
    Map<Character, PrefixTreeNode> children;
    boolean endOfString;

    public PrefixTreeNode(){
        this.children = new HashMap<>();
        this.endOfString = false;
    }
}