package implementations;

import com.dessignpattern.command.interfaces.Command;
import com.dessignpattern.command.vendor.Light;

public class LightOnCommand implements Command {

  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.on();
  }
}
