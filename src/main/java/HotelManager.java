import java.util.ArrayList;
import java.util.List;

public class HotelManager {
          public static void main(String[] args) {
             Logger.getInstance().log("Managing hotel...");
             List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();
             List<HotelFloor> hotelFloors = new ArrayList<HotelFloor>();
             // create 3 floors
             HotelRoom hotelroom1 = new HotelRoom();
             HotelFloor hotelFloor1 = new HotelFloor();
             hotelFloor1.addHotelRoom(hotelroom1);
             hotelFloors.add(hotelFloor1);

             // add 5 hotel rooms to each floors
             // Give each floor a unique #, and each room on floor a unique #
             // Check 4 guests into the hotel 
             // Return output that shows guest checkedin, send email, 
             HotelEmailService emailService = new HotelEmailService();
             HotelPushNotificationService notificationService = new HotelPushNotificationService();
             // initialize hotel email and notification services
             // ...
             hotelRooms.forEach((hotelRoom) -> {
                hotelRoom.addCheckinObserver(emailService);
                hotelRoom.addCheckinObserver(notificationService);
             });
             hotelFloors.forEach((hotelfloor) -> {
               hotelfloor.addCheckinObserver(emailService);
               hotelfloor.addCheckinObserver(notificationService);
            });
            hotelFloor1.checkIn("Adams family");
            
          }
       }
