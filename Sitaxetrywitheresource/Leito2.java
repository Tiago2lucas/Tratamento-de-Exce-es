package Sitaxetrywitheresource;

import java.io.Closeable;
import java.io.IOException;
public class Leito2 implements Closeable {


    @Override
    public void close() throws IOException {
    System.out.println("Fechando leitor 2");
    }

}
