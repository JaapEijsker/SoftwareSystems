package hotel;

public class Hotel {
	String name;
	Room room1;
	Room room2;
	Password password;
	
	public Hotel(String hotelName) {
		name = hotelName;
		room1 = new Room(1);
		room2 = new Room(2);
		password = new Password();
	}
	
	//
	public Room checkIn(String password, String guestname) {
		Guest guest = new Guest(guestname);
		if (this.getPassword().testWord(password)
				&& this.getFreeRoom() != null && this.getRoom(guestname) == null) {
			Room room = getFreeRoom();
			guest.checkin(room);
			return room;
		} else {
			return null;
		}
	}
	
	//
	public boolean checkOut(String guestname) {
		if (room1.getGuest().getName() == guestname) {
			room1.getGuest().checkout();
			Safe safe = room1.getSafe();
			safe.deactivate();
			return true;
		} else if (room2.getGuest().getName() == guestname) {
			room2.getGuest().checkout();
			Safe safe = room2.getSafe();
			safe.deactivate();
			return true;
		} else {
			return false;
		}
	}
	
	//
	public Room getFreeRoom() {
		if (room1.getGuest() == null) {
			return room1;
		} else if (room2.getGuest() == null) {
			return room2;
		} else {
			return null;
		}
	}
	
	//
	public Room getRoom(String guestname) {
		if (room1.getGuest().getName() == guestname) {
			return room1;
		} else if (room2.getGuest().getName() == guestname) {
			return room2;
		} else {
			return null;
		}
	}
	
	//
	public Password getPassword() {
		return password;
	}
	
	//
	public String toString() {
		return "These are all hotel rooms: ....";
	}
	
	//
	public String getName() {
		return name;
	}
}
