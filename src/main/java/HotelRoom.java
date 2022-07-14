import java.util.ArrayList;
import java.util.List;

class HotelRoom implements HotelRoomInterface {
    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }

    private List<RoomCheckinObserver> checkinObservers = new ArrayList<RoomCheckinObserver>();

    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }

    public void checkIn(String guestName) {
        Logger.getInstance().log(guestName + " has checked in");
        // checkinObservers.forEach((checkInObserver) -> 
        // checkInObserver.update(guestName));
    }


    public void addCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.add(checkinObserver);
    }

    public void removeCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.remove(checkinObserver);
    }
    public void addCheckinObserver(HotelEmailService emailService) {
    }

    public void addCheckinObserver(HotelPushNotificationService notificationService) {
    }
}
