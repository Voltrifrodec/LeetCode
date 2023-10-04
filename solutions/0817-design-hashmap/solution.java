public class MyHashMap {

    // Code based by Driss_T solution: https://leetcode.com/problems/design-hashmap/discuss/2614809/LinkedList-or-Java-solution-200-ms

    private Node base;

    // Works as init() -- makes the first empty Node.
    public MyHashMap() {
        base = new Node(0,0);
    }

    public void put(int key, int value) {

        // 1. Define a helping Node, in this case "pom". Set it to base.next. Define a node prev, that will come in handy
        //    when MyHashMap is empty.
        // 2. Use while loop, where we go until the end of file or until we will find the key that matches the inputted key.
        //    If we won't find the matching key, we move on.
        // 3. If we reach the end of the list, then there are two possibilities: if prev == null, then simply create a new Node in head.next. If
        //    prev isn't null (we are not at the beginning of the file), but the pom equals null (we are at the end of the file, then we create a new
        //    node and put values in it.

        Node pom = base.next;
        Node prev = null;

        while(pom != null) {
            
            if(pom.key == key) {
                pom.value = value;
                return;
            }

            prev = pom;
            pom = pom.next;
            
        }

        if(prev == null)
            base.next = new Node(key, value);
        if(prev != null && pom == null) {
            prev.next = new Node(key, value);
        }
        
    }

    public int get(int key) {

        // 1. Define a helping Node, in this case "pom", and set it to base.next.
        // 2. Use while looop, where we go until either end of file or until we find the matching key. If we won't find a matching, return -1.

        Node pom = base.next;
        while(pom != null) {

            if(pom.key == key) {
                return pom.value;
            }

            pom = pom.next;

        }

        return -1;

    }

    public void remove(int key) {

        // 1. Once again define two nodes: pom and prev. Set pom to base.next and prev to null.
        // 2. Use while loop, where we check two options:
        //      a.) We found key value, and prev is not null: This means that object isn't empty, so we need to connect previous with next (basically skipping the node with matching key).
        //      b.) We found key value, but prev is null: We set the base to pom.next.

        Node pom = base.next;
        Node prev = null;

        while(pom != null) {
            
            if(pom.key == key && prev != null) {
                prev.next = pom.next;
                return;
            }
            if(pom.key == key && prev == null) {
                base.next = pom.next;
                return;
            }

            prev = pom;
            pom = pom.next;

        }

    }

}

class Node {

    public int key;
    public int value;
    public Node next;

    public Node() {}
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
