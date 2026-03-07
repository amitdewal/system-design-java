/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.location;

//import com.system.ad.system.design.movieticketbooking.location.*;

/**
 * 
 */
public class Room {
	private String roomNumber;
	private Layout Layout;

	/**
	 * @param roomNumber
	 * @param layout
	 */
	public Room(String roomNumber, Layout layout) {
		super();
		this.roomNumber = roomNumber;
		Layout = layout;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Layout getLayout() {
		return Layout;
	}

	public void setLayout(Layout layout) {
		Layout = layout;
	}

}
