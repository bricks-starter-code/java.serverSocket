import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class ThreadedServer implements Runnable{

private Socket clientsocket;

public serverThread(Socket clientsocket) {
// TODO Auto-generated constructor stub
this.clientsocket = clientsocket;
}

@Override
public void run() {
// TODO Auto-generated method stub
System.out.println("We got a client.");
try {
BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
while(!clientsocket.isClosed()) {
out.println("socket" + new Date());
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}

}

