package com.buildappswithpaulo.com;

import com.buildappswithpaulo.com.controller.EmployeeController;
import com.buildappswithpaulo.com.model.Employee;
import com.buildappswithpaulo.com.view.EmployeeDashboardView;

public class Main {

  public static void main(String[] args) {
    Employee employee = retrieveEmployeeFromServer();

    // Create view to which we'll write our employee information into
    EmployeeDashboardView view = new EmployeeDashboardView();

    // Create our controller
    EmployeeController controller = new EmployeeController(employee, view);
    controller.updateDashboardView();

    controller.setSSN("45454");
    controller.updateDashboardView();

  }

  // this method emulates the retrieve of an employee from a DB or a server
  public static Employee retrieveEmployeeFromServer() {
    Employee employee = new Employee();
    employee.setSsNumber("34343");
    employee.setFirstName("James");
    employee.setLastName("Rodriguez");
    employee.setSalary(30000.54);
    return employee;
  }
}