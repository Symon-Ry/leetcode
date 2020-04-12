class MyCircularQueue {
    public int[] arr;
    private int front;
    private int rear;
    private int size;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        arr=new int[k];
        size=k;
        front=-1;
        rear=-1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()==true){
            return false;
        }
        if(isEmpty()==true){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isFull()==true){
            return false;
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }
        front=(front+1)%size;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()==true){
            return -1;
        }
        return arr[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()==true){
            return -1;
        }
        return arr[rear];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front==-1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((rear + 1) % size) == front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
