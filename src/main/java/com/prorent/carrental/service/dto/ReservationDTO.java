package com.prorent.carrental.service.dto;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.prorent.carrental.domain.Reservation;
import com.prorent.carrental.domain.enumeration.ReservationStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO{

	private Long id;
	
	private CarDTO car;
	
	private Long userId;
	
	private LocalDateTime pickUpTime;
	
	private LocalDateTime dropOffTime;
	
	private String pickUpLocation;
	
	private String dropOffLocation;
	
	private ReservationStatus status;
	
	private Double totalPrice;
	
	public ReservationDTO(Reservation reservation) {
		this.id=reservation.getId();
		this.car=new CarDTO(reservation.getCarId());
		this.userId=reservation.getUserId().getId();
		this.pickUpTime=reservation.getPickUpTime();
		this.dropOffTime=reservation.getDropOffTime();
		this.pickUpLocation=reservation.getPickUpLocation();
		this.dropOffLocation=reservation.getDropOffLocation();
		this.status=reservation.getStatus();
		this.totalPrice=reservation.getTotalPrice();
	}
}
