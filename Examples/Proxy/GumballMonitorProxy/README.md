<h1>Pasos para ejecutar el servidor</h1>

Estos comandos hay que ejecutarlos en el directorio <em>.\out\production\GumballMonitorProxy</em>

1. Ejecutar el comando <em>rmic com.dessignpatterns.proxy.models.GumballMachine</em>

2. Ejecutar el comando <em>rmiregistry</em>

3. Ejecutar el comando <em>java com.dessignpatterns.proxy.GumballMachineTestDrive santafe 100 en un terminal</em>

4. Ejecutar el comando <em>java com.dessignpatterns.proxy.GumballMachineTestDrive seattle 250 en otro terminal</em>

5. Ejecutar el comando <em>java com.dessignpatterns.proxy.GumballMachineTestDrive boulder 450 en otro terminal</em>

<b>Importante</b>

La clase GumballMachine tiene que contener la línea <i>System.setProperty("java.rmi.server.hostname", "127.0.0.1");</i>
