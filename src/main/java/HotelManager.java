import java.util.ArrayList;
import java.util.List;

public class HotelManager {
          public static void main(String[] args) {
             Logger.getInstance().log("Managing hotel...");
             List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();
             // create 3 floors

             HotelFloor hotelFloor1 = new HotelFloor();
             HotelFloor hotelFloor2 = new HotelFloor();
             HotelFloor hotelFloor3 = new HotelFloor();

             // add 5 hotel rooms to each 
             HotelRoom hotelRoom1 = new HotelRoom();
             hotelRooms.add(hotelRoom1);
             HotelRoom hotelRoom2 = new HotelRoom();
             HotelRoom hotelRoom3 = new HotelRoom();
             HotelRoom hotelRoom4 = new HotelRoom();
             HotelRoom hotelRoom5 = new HotelRoom();

             hotelFloor1.addHotelRoom(hotelRoom1);
             hotelFloor1.addHotelRoom(hotelRoom2);
             hotelFloor1.addHotelRoom(hotelRoom3);
             hotelFloor1.addHotelRoom(hotelRoom4);
             hotelFloor1.addHotelRoom(hotelRoom5);

             hotelFloor2.addHotelRoom(hotelRoom1);
             hotelFloor2.addHotelRoom(hotelRoom2);
             hotelFloor2.addHotelRoom(hotelRoom3);
             hotelFloor2.addHotelRoom(hotelRoom4);
             hotelFloor2.addHotelRoom(hotelRoom5);

             hotelFloor3.addHotelRoom(hotelRoom1);
             hotelFloor3.addHotelRoom(hotelRoom2);
             hotelFloor3.addHotelRoom(hotelRoom3);
             hotelFloor3.addHotelRoom(hotelRoom4);
             hotelFloor3.addHotelRoom(hotelRoom5);

             // Give each floor a unique #, and each room on floor a unique #
             // Check 4 guests into the hotel 
             hotelRoom1.checkIn("Adams");
             hotelRoom2.checkIn("Smith");
             hotelRoom3.checkIn("Bill");
             hotelRoom4.checkIn("Doug");
             // Return output that shows guest checkedin, send email, 
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
