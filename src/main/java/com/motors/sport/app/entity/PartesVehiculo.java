/**
 * 
 */
package com.motors.sport.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author andre
 *
 */
public class PartesVehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPartesVehiculo;

	private long vidaUtil;

	private String nombre;

	private String reutilizable;
	
	private long idModelo;

	/*@JoinColumn(name = "idModelo", referencedColumnName = "idModelo")
	@ManyToOne(optional = false)
	private Vehiculo idModelo;*/
}
