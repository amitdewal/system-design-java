/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.showing;

import java.time.Duration;
import java.time.LocalDateTime;

import com.system.ad.system.design.movieticketbooking.location.Room;

/**
 * 
 */
public class Screening {

	private Movie movie;
	private Room room;
	private LocalDateTime statTime;
	private LocalDateTime endTime;

	/**
	 * @param movie
	 * @param room
	 * @param statTime
	 * @param endTime
	 */
	public Screening(Movie movie, Room room, LocalDateTime statTime, LocalDateTime endTime) {
		super();
		this.movie = movie;
		this.room = room;
		this.statTime = statTime;
		this.endTime = endTime;
	}

	public Duration getDuration() {
		return null;

	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public LocalDateTime getStatTime() {
		return statTime;
	}

	public void setStatTime(LocalDateTime statTime) {
		this.statTime = statTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

}
