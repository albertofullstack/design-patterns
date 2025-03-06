package com.buildappswithpaulo.com;

public interface Person {

  String getFirstName();
  String getLastName();
  String getPhoneNumber();
  int getAge();
  String getAddress();

  class DefaultPerson implements Person {

    // Required parameters
    private final String firstName;
    private final String lastName;

    // Optional parameters
    protected String phoneNumber;
    protected String address;
    protected int age;

    public DefaultPerson(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public DefaultPerson(Builder builder) {
      this(builder.getFirstName(), builder.getLastName());
      this.age = builder.age;
      this.phoneNumber = builder.phoneNumber;
      this.address = builder.address;
    }

    @Override
    public String toString() {
      return "DefaultPerson{" +
          "firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          ", address='" + address + '\'' +
          ", age=" + age +
          '}';
    }

    @Override
    public String getFirstName() {
      return firstName;
    }

    @Override
    public String getLastName() {
      return lastName;
    }

    @Override
    public String getPhoneNumber() {
      return phoneNumber;
    }

    @Override
    public String getAddress() {
      return address;
    }

    @Override
    public int getAge() {
      return age;
    }
  }

  // inner class
  class Builder extends DefaultPerson {

    public Builder(String firstName, String lastName) {
      super(firstName, lastName);
    }

    public Builder phone(String phone) {
      this.phoneNumber = phone;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new DefaultPerson(this);
    }
  }
}
