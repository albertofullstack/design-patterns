import com.dessignpattern.command.implementations.LightOnCommand;
import com.dessignpattern.command.implementations.SimpleRemoteControl;
import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.Light;

public class RemoteControlTest {

  public static void main(String[] args) {

    Light light = new Light();
    Command command = new LightOnCommand(light);

    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    simpleRemoteControl.setCommand(command);
    simpleRemoteControl.pressButton();
  }
}