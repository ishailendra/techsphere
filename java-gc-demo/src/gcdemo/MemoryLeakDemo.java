package gcdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10000; i++) {
            // Allocate 100MB
            byte[] block = new byte[100 * 1024 * 1024];
            System.out.println("Allocated " + ((i + 1) * 100) + "MB");

            // Pause to inspect in VisualVM or wait for OOM
            if (i != 0 && i % 10 == 0)
                System.in.read();
        }

        // Pause to inspect in VisualVM or wait for OOM
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}