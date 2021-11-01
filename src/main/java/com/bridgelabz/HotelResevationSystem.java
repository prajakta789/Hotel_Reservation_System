package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
public class HotelResevationSystem {
	List<Hotel> hotels = new ArrayList<Hotel>();
	/**
	 * This method is used to add hotel to the Hotel List
	 */
	public boolean addHotel(Hotel hotel) {
		return hotels.add(hotel);
	}
}

