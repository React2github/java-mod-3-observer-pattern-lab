class HotelRoom implements HotelRoomInterface {
    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }

    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }

    public void checkIn(String guestName) {
        Logger.getInstance().log(guestName + "checked in");
    }

    public void addCheckinObserver(HotelEmailService emailService) {
    }

    public void addCheckinObserver(HotelPushNotificationService notificationService) {
    }
}
