public class Space {
    public void greet(String[] names) {
        String[] copy = new String[names.length];
        // O(n)
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
        }
    }
    }
