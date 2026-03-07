/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.ticket;

import java.math.BigDecimal;

import com.system.ad.system.design.movieticketbooking.location.Seat;
import com.system.ad.system.design.movieticketbooking.showing.Screening;

/**
 * 
 */
public class Ticket {
	private Screening screening;
	private Seat seat;
	private BigDecimal price;

	/**
	 * @param screening
	 * @param seat
	 * @param price
	 */
	public Ticket(Screening screening, Seat seat, BigDecimal price) {
		super();
		this.screening = screening;
		this.seat = seat;
		this.price = price;
	}

	public Screening getScreening() {
		return screening;
	}

	public void setScreening(Screening screening) {
		this.screening = screening;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
