package co.edu.escuelaing;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            HttpServer.start(3500);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
