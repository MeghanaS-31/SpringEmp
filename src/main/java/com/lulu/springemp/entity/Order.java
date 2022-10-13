package com.lulu.springemp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "Orders")
public class Order {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	float billAmount;
	String name;
	String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order(int id, float billAmount, String name, String address) {
		super();
		this.id = id;
		this.billAmount = billAmount;
		this.name = name;
		this.address = address;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", billAmount=" + billAmount + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
