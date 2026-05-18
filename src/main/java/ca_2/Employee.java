/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_2;

/**
 *
 * @author aramn
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private double salary;

    private Department department;
    private Manager manager;

    private String company;

    public Employee(String firstName,
                    String lastName,
                    String gender,
                    String email,
                    double salary,
                    Department department,
                    Manager manager,
                    String company) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.manager = manager;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public Manager getManager() {
        return manager;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {

        return firstName + " " +
               lastName + " | " +
               department.getDepartmentName() + " | " +
               manager.getManagerType() + " | " +
               company;
    }
}

