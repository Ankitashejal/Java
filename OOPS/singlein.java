package dp;
public class singlein {
    public void print_geek() {
        System.out.println("geeks");
    }

    // Nested static class
    static class two extends singlein {
        public void print_for() {
            System.out.println("for");
        }
    }
}
