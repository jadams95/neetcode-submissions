class MedianFinder {

    private Queue<Integer> smallHeap;
    private Queue<Integer> largeHeap;



    // private int[] numberArr;
    // private int index = 0;

    public MedianFinder() {
        smallHeap = new PriorityQueue<>((a, b) -> b - a);
        largeHeap = new PriorityQueue<>((a, b) -> a - b);
    }
    
    public void addNum(int num) {
        smallHeap.add(num);
        if(smallHeap.size() - largeHeap.size() > 1 || 
        !largeHeap.isEmpty() && smallHeap.peek() > largeHeap.peek()){
            largeHeap.add(smallHeap.poll());
        }
        if(largeHeap.size() - smallHeap.size() > 1){
            smallHeap.add(largeHeap.poll());
        }
    }
    
    public double findMedian() {
        // if it is even then add middle two numbers
        // else 
        // is the length of arr
        if(smallHeap.size() == largeHeap.size()){
            return (double) (largeHeap.peek() + smallHeap.peek()) / 2;
        } else if(smallHeap.size() > largeHeap.size()){
            return (double) smallHeap.peek();
        } else {
            return (double) largeHeap.peek();
        }
    }
}
