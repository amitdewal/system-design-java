/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.system.ad.system.design.movieticketbooking.location.Seat;
import com.system.ad.system.design.movieticketbooking.showing.Movie;
import com.system.ad.system.design.movieticketbooking.showing.Screening;

/**
 * 
 */
public class ScreeningManager {
	private Map<Movie, List<Screening>> screeningByMovie;

	// maps screenings to tickets sold for that screening
	private Map<Screening, List<Ticket>> ticketByScreening;

	/**
	 * @param screeningByMovie
	 * @param ticketByScreening
	 */
	public ScreeningManager(Map<Movie, List<Screening>> screeningByMovie,
			Map<Screening, List<Ticket>> ticketByScreening) {
		super();
		this.screeningByMovie = new HashMap<>();
		this.ticketByScreening = new HashMap<>();
	}

	/**
	 * 
	 */
	public ScreeningManager() {
		
	}

	public void addScreening(Movie movie, Screening screening) {
		screeningByMovie.computeIfAbsent(movie, k -> new ArrayList<>()).add(screening);

	}

	public void addTicket(Screening screening, Ticket ticket) {
//		ticketByScreening.computeIfAbsent(screening, k -> new ArrayList<>()).add(ticket);

		List<Ticket> tickets = ticketByScreening.computeIfAbsent(screening, k -> new ArrayList<>());

		tickets.add(ticket);
	}

	public List<Screening> getScreeningsForMovie(Movie movie) {

		return null;

	}

	// returns all tickets sold for a specific screening
	public List<Ticket> getTicketsForScreening(Screening Screening) {

		return ticketByScreening.getOrDefault(Screening, new ArrayList<>());

	}

	// calculate which seats are still available for a screening
	public List<Seat> getAvailableSeats(Screening screening) {
		List<Seat> allSeats = screening.getRoom().getLayout().getAllSeats();
		List<Ticket> bookedTickets = getTicketsForScreening(screening);

		List<Seat> avilableSeats = new ArrayList<>(allSeats);
		for (Ticket ticket : bookedTickets) {
			avilableSeats.remove(ticket.getSeat());
		}
		return avilableSeats;

	}

}
