package com.lulu.springemp.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "HelpDesk")
public class HelpDesk {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String complaintDesc;
	LocalDate ordersDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComplaintDesc() {
		return complaintDesc;
	}
	public void setComplaintDesc(String complaintDesc) {
		this.complaintDesc = complaintDesc;
	}
	public LocalDate getOrdersDate() {
		return ordersDate;
	}
	public void setOrdersDate(LocalDate ordersDate) {
		this.ordersDate = ordersDate;
	}
	public HelpDesk(int id, String name, String complaintDesc, LocalDate ordersDate) {
		super();
		this.id = id;
		this.name = name;
		this.complaintDesc = complaintDesc;
		this.ordersDate = ordersDate;
	}
	public HelpDesk() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HelpDesk [id=" + id + ", name=" + name + ", complaintDesc=" + complaintDesc + ", ordersDate="
				+ ordersDate + "]";
	}
	
	
	
}
