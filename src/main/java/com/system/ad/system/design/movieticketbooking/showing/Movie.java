/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.showing;

import java.time.Duration;

/**
 * 
 */
public class Movie {
	private String title;
	private String genre;
	private int durationInMinutes;

	/**
	 * @param title
	 * @param genre
	 * @param durationInMinutes
	 */
	public Movie(String title, String genre, int durationInMinutes) {
		super();
		this.title = title;
		this.genre = genre;
		this.durationInMinutes = durationInMinutes;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}


	public Duration getDuration() {
		return Duration.ofMinutes(durationInMinutes);

	}
}
