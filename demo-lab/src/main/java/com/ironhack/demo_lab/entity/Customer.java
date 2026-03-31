package com.ironhack.demo_lab.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(name = "customer_name", nullable = false, length = 50)
    private String customerName;

    @Column(name = "customer_status", nullable = false)
    private CustomerStatus customerStatus = CustomerStatus.NONE;

    @Column(name = "total_customer_mileage", nullable = false)
    private Integer totalCustomerMileage;

    public Customer() {
    }

    public Customer(String customerName, CustomerStatus customerStatus, Integer totalCustomerMileage) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }


    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
