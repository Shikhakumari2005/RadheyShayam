import java.util.*;

class Triplet {
    int a, b, c;

    // Constructor
    Triplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Compare two triplets for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triplet)) return false;

        Triplet t = (Triplet) obj;
        return a == t.a && b == t.b && c == t.c;
    }

    // Required when using HashSet / HashMap
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    // For printing
    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        Triplet t1 = new Triplet(1, 2, 3);
        Triplet t2 = new Triplet(1, 2, 3);
        Triplet t3 = new Triplet(2, 3, 4);

        // Equality comparison
        System.out.println("t1 equals t2: " + t1.equals(t2)); // true
        System.out.println("t1 equals t3: " + t1.equals(t3)); // false

        // Using Triplet in HashSet
        HashSet<Triplet> set = new HashSet<>();
        set.add(t1);
        set.add(t2); // duplicate
        set.add(t3);

        System.out.println("HashSet contents: " + set);
        System.out.println("HashSet size: " + set.size()); // 2
    }
}

