/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class Layout {
	private int rows;
	private int columns;
	private Map<String, Seat> seatsByNumber;
	private Map<Integer, Map<Integer, Seat>> seatsByPosition;

	/**
	 * @param rows
	 * @param columms
	 */
	public Layout(int rows, int columms) {
		super();
		this.rows = rows;
		this.columns = columms;
		this.seatsByNumber = new HashMap<>();
		this.seatsByPosition = new HashMap<>();

		initialization();
	}

	/**
	 * 
	 */
	private void initialization() {// create seats for all positions with default null pricing
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				String seatNumber = i + "-" + j;
				addSeat(seatNumber, i, j, new Seat(seatNumber, null));

			}
		}

	}

	public void addSeat(String seatNumber, int row, int column, Seat seat) {

		// store seat in number-based lookup map
		seatsByNumber.put(seatNumber, seat);

		// store seat in position based lookup map
		seatsByPosition.computeIfAbsent(row, k -> new HashMap<>()).put(column, seat);

	}

	public Seat getSeatByNumber(String seatNumber) {
		return seatsByNumber.get(seatNumber);

	}

	// get a seat by its row and column position
	public Seat getSeatByPosition(int row, int column) {
		Map<Integer, Seat> rowSeats = seatsByPosition.get(row);
		return (rowSeats != null) ? rowSeats.get(column) : null;

	}

	public List<Seat> getAllSeats() {
		return List.copyOf(seatsByNumber.values());

	}

}
