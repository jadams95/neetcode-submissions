class PrefixTree {

    PrefixNode root;

    public PrefixTree() {
         this.root = new PrefixNode();
    }

    public void insert(String words) {

        PrefixNode root = this.root;
        for(int i = 0; i < words.length(); i++){
            char ch = words.charAt(i);

            PrefixNode node = root.neighbors.get(ch);

            if(node == null){
                node = new PrefixNode();
                root.neighbors.put(ch, node);
                System.out.println("add string to Trie");
            }
            root = node;
        }
        root.endOfString = true;
    }

    public boolean search(String words) {
        PrefixNode root = this.root;
        for(int i = 0; i < words.length(); i++){
            char ch = words.charAt(i);

            PrefixNode node = root.neighbors.get(ch);

            if(node == null){
                return false;
            }
            root = node;
        }
        if(root.endOfString == true){
            return true;
        }
        return root.endOfString;
    }

    public boolean startsWith(String prefix) {
                PrefixNode root = this.root;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);

            PrefixNode node = root.neighbors.get(ch);

            if(node == null){
                return false;
            }
            root = node;
        }
        return true;
    }
}


class PrefixNode {
    Map<Character, PrefixNode> neighbors = new HashMap<Character, PrefixNode>();
    boolean endOfString;

    PrefixNode(){
        this.neighbors = new HashMap<>();
        this.endOfString = false;
    }
}