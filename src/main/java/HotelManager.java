import java.util.ArrayList;
import java.util.List;

public class HotelManager {
          public static void main(String[] args) {
             Logger.getInstance().log("Managing hotel...");

             // create hotel rooms
             List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();
             // create hotel floors
             // add hotel rooms to hotel floors
             // take actions on rooms and floors and examine your output to ensure you implemented the desired
             // behaviors
             // create hotel email and notification services
             HotelEmailService emailService = new HotelEmailService();
             HotelPushNotificationService notificationService = new HotelPushNotificationService();
             // initialize hotel email and notification services
             // ...
             hotelRooms.forEach((hotelRoom) -> {
                hotelRoom.addCheckinObserver(emailService);
                hotelRoom.addCheckinObserver(notificationService);
             });
          }
       }
