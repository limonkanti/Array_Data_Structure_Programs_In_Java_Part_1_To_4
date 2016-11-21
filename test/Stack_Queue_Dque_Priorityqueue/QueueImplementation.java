package Stack_Queue_Dque_Priorityqueue;

public class QueueImplementation {

    int queue[];
    int k, l, top, front, rear, nItems;

    public QueueImplementation(int j) {
        k = j;
        queue = new int[k];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;

    }

    public void addItem(int j) throws Exception {
        if (rear == k - 1) {
            rear = -1;
        }

        System.out.println("Adding:\t"+j);
        queue[++rear] = j;
        nItems++;
    }

    public int removeItem() {
        int entry = queue[front++];
        System.out.println("Removing:\t"+entry);
        if (front == k) {
            front = 0;
        }

        nItems--;
        return entry;

    }

    public static void main(String args[]) {
        QueueImplementation ob = new QueueImplementation(3);
        try {
            ob.addItem(1);
            ob.addItem(2);
            ob.addItem(3);
            // ob.addItem(4);
            ob.removeItem();
            ob.removeItem();
            ob.addItem(4);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
