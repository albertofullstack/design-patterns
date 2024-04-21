import java.rmi.Naming;

public class MyRemoteClient {

  public static void main(String[] args) {
    try {
      MyRemote stub = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
      String s = stub.sayHello();
      System.out.println(s);
    } catch (Exception e) {
      System.err.println("Client exception: " + e.toString());
      e.printStackTrace();
    }
  }
}
