import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hash hash = new Hash(5);
    hash.insert(35);
        hash.insert(7);
        hash.insert(3);
        hash.insert(61);
        hash.insert(63);
        hash.insert(64);
        hash.insert(45);
        hash.insert(33);
        hash.insert(78);
        hash.insert(32);
        hash.insert(6);
        hash.insert(14);
        hash.display();

    }
}

class Hash {

    private int size;
    private ArrayList<Integer>[] hashArray;

    public Hash(int size) {

        hashArray = new ArrayList[size];
        this.size = size;

        for (int i = 0; i < size; i++) {
            hashArray[i] = new ArrayList<>();
        }

    }

    void insert(int val) {

        int index = hashFunc(val);

        hashArray[index].add(val);

    }

    void display() {
        for (int i = 0; i < hashArray.length; i++) {

            System.out.println( "index : " + i);
            for(int j = 0; j < hashArray[i].size(); j++) {

                System.out.print(hashArray[i].get(j) + " --> ");
            }
            System.out.println();
        }
    }

    private int hashFunc(int key) {
        return key % size;
    }

}
