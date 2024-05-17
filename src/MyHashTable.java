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
    private int hash(K key) {
        return 0;
    };
    public void put(K key, V value) {
        int index = hash(key);
        MyHashNode<K, V> head = chainArr[index];
        while (head != null) {
            head = head.next;
        }

        head = chainArr[index];
        size++;
    }
    public V get(K key){
        int index = hash(key);
        MyHashNode<K,V> current = chainArr[index];
        while(current != null){
            if(current.key.equals(key)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    public V remove(K key){
        int index = hash(key);
        MyHashNode<K,V> current = chainArr[index];
        MyHashNode<K,V> lastNode = null;
        while(current != null){
            if(current.key.equals(key)){
                if(lastNode != null){
                    lastNode.next = current.next;
                }else{
                    chainArr[index] = current.next;
                }
                size--;
                return current.value;
            }
            lastNode = current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(V value){
        for(int i = 0; i < chainArr.length; i++){
            MyHashNode<K,V> current = chainArr[i];
            while(current != null){
                if(current.value.equals(value)){
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }
    public K getKey(V value){
        return null;
    };
}