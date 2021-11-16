package com.conneqt.smartapp.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Dispositions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dispos_id;
	
	
	private Integer case_id;
	private Integer disposition_type_id;
	//private Date  date;
	//amount DECIMAL(10),
	private DATETIME callback_datetime ;
	mode_of_payment VARCHAR(100),
	address VARCHAR(100),
	remarks VARCHAR(500),
	user_id INT,
	created_at DATETIME NOT NULL,
	updated_at DATETIME NOT NULL,
	account_number VARCHAR(100),
	call_request_id INT,
	process_type_id INT,
	new_mobile_number VARCHAR(100),
	contact_type VARCHAR(100),
	non_payment_reason VARCHAR(100),
	latitude DECIMAL(10,7),
	longitude DECIMAL(10,7),
	image VARCHAR(100),
	
}
