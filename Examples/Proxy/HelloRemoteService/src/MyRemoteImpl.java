import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {


  public MyRemoteImpl() throws RemoteException {
  }

  public static void main(String[] args) {
    try {

      MyRemote service = new MyRemoteImpl();
      System.out.println("Trying to bind");
      Naming.rebind("//localhost/RemoteHello", service);
      System.out.println("Bound");

    } catch (Exception e) {
      System.out.println("Server Exception: " + e.toString());
      e.printStackTrace();
    }
  }

  public String sayHello() throws RemoteException {
    return "Hello, World";
  }

}
