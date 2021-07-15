package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date 	checkin;
	private Date	checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin 	= checkin;
		this.checkout 	= checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime(); // devolve a quantidade de milisegundos daquela data
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // convertendo o valor de milisegundos em dias
		
	}
	
	public void updateDates(Date checkin, Date checkout){
		this.checkin 	= checkin;
		this.checkout 	= checkout;
	}
	
	@Override //sempre usar quando for utilizar o toString
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkin)
			+ ", check-out: "
			+ sdf.format(checkout)
			+ ", "
			+ duration()
			+ " nights";
	}
}