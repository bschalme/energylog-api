package ca.airspeed.energylog.domain;

import static javax.persistence.GenerationType.AUTO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reading {

	@Id
	@GeneratedValue(strategy = AUTO)
	private long id;
	private long version;
	private int value;
	private Date date;

	protected Reading() {
	}

	public Reading(long version, int value, Date date) {
		super();
		this.version = version;
		this.value = value;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public long getVersion() {
		return version;
	}

	public int getValue() {
		return value;
	}

	public Date getDate() {
		return date;
	}
}
