package su.arth.Services;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Артур on 24.01.2015.
 */
public class StatusAuto {


   public static void getStatusAuto() throws IOException {

       ServerSocket serverSocket = new ServerSocket(8989);

       Socket incoming = serverSocket.accept();

       InputStream socketIn = incoming.getInputStream();
       OutputStream socketOut = incoming.getOutputStream();

       Scanner in = new Scanner(socketIn);
       PrintWriter out = new PrintWriter(socketOut);




   }



}
