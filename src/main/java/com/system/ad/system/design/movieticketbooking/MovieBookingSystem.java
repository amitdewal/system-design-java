/**
 * 
 */
package com.system.ad.system.design.movieticketbooking;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.system.ad.system.design.movieticketbooking.location.Cinema;
import com.system.ad.system.design.movieticketbooking.location.Seat;
import com.system.ad.system.design.movieticketbooking.showing.Movie;
import com.system.ad.system.design.movieticketbooking.showing.Screening;
import com.system.ad.system.design.movieticketbooking.ticket.ScreeningManager;
import com.system.ad.system.design.movieticketbooking.ticket.Ticket;

/**
 * 
 */
public class MovieBookingSystem {

	private List<Movie> movies;

	private List<Cinema> cinemas;

	private ScreeningManager screeningManager;

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Cinema> getCinemas() {
		return cinemas;
	}

	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

	public ScreeningManager getScreeningManager() {
		return screeningManager;
	}

	public void setScreeningManager(ScreeningManager screeningManager) {
		this.screeningManager = screeningManager;
	}

	/**
	 * @param movies
	 * @param cinemas
	 * @param screeningManager
	 */
	public MovieBookingSystem() {
		super();
		this.movies = new ArrayList<>();
		this.cinemas = new ArrayList<>();
		this.screeningManager = new ScreeningManager();
	}

	public void addMovie(Movie movie) {
		movies.add(movie);

	}

	public void addCinema(Cinema cinema) {
		cinemas.add(cinema);
	}

	public void addScreening(Movie movie, Screening screening) {
//		screeningManager.addScreening(movie, screening);

	}

	// book ticket for specific seat at a screening
	public void bookTicket(Screening screening, Seat seat) {
		BigDecimal price = seat.getPricingStrategy().getPrice();
		Ticket ticket = new Ticket(screening, seat, price);
		screeningManager.addTicket(screening, ticket);

	}

//	returns all Screenings for a specific movie
	public List<Screening> getScreeningsForMovie(Movie movie) {
		return screeningManager.getScreeningsForMovie(movie);

	}

//	return all available seats for screening
	public List<Seat> getAvailableSeats(Screening screening) {
		return screeningManager.getAvailableSeats(screening);

	}

	// returns the tickets for screening
	public List<Ticket> getTicketsForScreening(Screening screening) {
		return screeningManager.getTicketsForScreening(screening);

	}

	// returns the number of tickets sold for a screening
	public int getTicketCount(Screening screening) {
		return screeningManager.getTicketsForScreening(screening).size();

	}

}
