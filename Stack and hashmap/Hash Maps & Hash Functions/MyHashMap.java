class MyHashMap {

    static class Node {

        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] buckets;

    int size = 1000;

    MyHashMap() {
        buckets = new Node[size];
    }

    int hash(int key) {
        return Integer.hashCode(key) & 0x7fffffff;
    }

    public void put(int key, int value) {

        int index = hash(key) % size;

        Node temp = buckets[index];

        while (temp != null) {

            if (temp.key == key) {
                temp.value = value;
                return;
            }

            temp = temp.next;
        }

        Node newNode = new Node(key, value);

        newNode.next = buckets[index];

        buckets[index] = newNode;
    }

    public int get(int key) {

        int index = hash(key) % size;

        Node temp = buckets[index];

        while (temp != null) {

            if (temp.key == key) {
                return temp.value;
            }

            temp = temp.next;
        }

        return -1;
    }

    public void remove(int key) {

        int index = hash(key) % size;

        Node temp = buckets[index];

        Node prev = null;

        while (temp != null) {

            if (temp.key == key) {

                if (prev == null) {
                    buckets[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }

                return;
            }

            prev = temp;

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(2, 200);

        System.out.println(map.get(1));

        map.remove(1);

        System.out.println(map.get(1));
    }
}
