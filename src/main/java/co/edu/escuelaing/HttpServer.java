package co.edu.escuelaing;

import java.net.*;
import java.io.*;

public class HttpServer {
    static String valor = null;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        Integer port = 35000;

        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }

        Socket clientSocket = null;
        Boolean running = true;
        while(running){
            try {
                System.out.println("Listo para recibir ...");
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }
            PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            String inputLine, outputLine="", path="";
            Boolean firstLine = true;
            String bodyResponse = null;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Recibí: " + inputLine);
                if (firstLine){
                    path = inputLine;
                    System.out.println("PATH: "+path);
                    System.out.println("PATH: "+path.split(" ")[1]);
                    firstLine = false;
                }
                if (!in.ready()) {break; }
            }
            if (path.split(" ")[1].startsWith("/calculadora")){
                System.out.println(path.split(" ")[1].split("=")[1]);
                outputLine = "HTTP/1.1 200 OK\r\n"
                        + "Content-Type: text/html\r\n"
                        + "\r\n"
                        + "<!DOCTYPE html>\n"
                        + "<html>\n"
                        + "<head>\n"
                        + "<meta charset=\"UTF-8\">\n"
                        + "<title>Title of the document</title>\n"
                        + "</head>\n"
                        + "<body>\n"
                        + "<h1>Resultado: </h1>\n" //+ HttpConnectionExample.getResultado(path.split(" ")[1].split("=")[1])
                        + "</body>\n"
                        + "</html>\n";
            }
            out.println(outputLine);
            out.close();
            in.close();
            clientSocket.close();
        }


        serverSocket.close();
    }
}