public class MyHashTable<K, V> {

    private static final int initialSize=16;
    private MyHashNode<K,V>[] chainArr;
    private int size;

    public class MyHashNode<K, V> {
        private K key;
        private V value;
        private MyHashNode<K,V> next;

        public MyHashNode(K key, V value){
            this.key=key;
            this.value=value;
        }

        @Override
        public String toString() {
            return "MyHashNode{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    };
    public MyHashTable(){
        this(initialSize);
    }
    public MyHashTable(int givenSize){
        chainArr=new MyHashNode[givenSize];
        size=0;
    }
    private int hash(K key) {};
    public void put(K key, V value) {
        int index = hash(key);
        MyHashNode<K, V> head = chainArr[index];
        while (head != null) {
            head = head.next;
        }

        head = chainArr[index];
        size++;
    }


    public V get(K key) {};
    public V remove(K key) {};
    public boolean contains(V value) {};
    public K getKey(V value){};
}