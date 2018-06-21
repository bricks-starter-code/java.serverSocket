import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerMain {

public static void main(String[] args) {
// TODO Auto-generated method stub

System.out.println("Start");
try {
ServerSocket serversocket = new ServerSocket(1234);
while(true) {
Socket clientsocket = serversocket.accept();
ThreadedServer thread = new ThreadedServer(clientsocket);
new Thread(thread).start();
}
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println("End");
}

}
