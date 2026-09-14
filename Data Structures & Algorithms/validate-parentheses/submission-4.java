class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        int l = 0, r = s.length();
        // int mid = s.length / 2;
        char[] charList = s.toCharArray();
        for(char c: charList){
            if(closeToOpen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(c)){
                    stack.pop();
                } else {
                return false;
             }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}
