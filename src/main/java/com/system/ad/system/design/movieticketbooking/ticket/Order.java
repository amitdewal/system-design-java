/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.ticket;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 
 */
public class Order {
	private List<Ticket> tickets;
	private LocalDateTime orderDate;

	/**
	 * @param orderDate
	 */
	public Order(LocalDateTime orderDate) {
		super();
		this.orderDate = orderDate;
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);

	}

//	calculate the total price of all the tickets in the order
	public BigDecimal calculateTotal() {
		return tickets.stream()
				      .map(ticket -> ticket.getPrice())
				      .reduce(BigDecimal.ZERO, (a, b) -> a.add(b)); // a = 0 in first iteration

	}

	public List<Ticket> getAllTickets() {
		return tickets;

	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	
}
