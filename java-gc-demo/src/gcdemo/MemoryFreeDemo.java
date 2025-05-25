package gcdemo;

public class MemoryFreeDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            // Allocate 100MB
            byte[] block = new byte[100 * 1024 * 1024];
            System.out.println("Allocated " + ((i + 1) * 100) + "MB");
        }

        // Pause to observe
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
