package date2;

public class Date2 {
    public static void main(String[] args) {
      Date meetingDate = new Date(3, 29, 2012);
//        meetingDate.day++;
        meetingDate.nextDay();
        System.out.println("Meeting will be on "
                + meetingDate.getMonth() + "/"
                + meetingDate.getDay() + "/"
                + meetingDate.getYear());

       Date betterMeetingDate = new Date(2, 29, 2012);
        betterMeetingDate.nextDay();
        System.out.println("Better meeting will be on " + betterMeetingDate);
//        System.out.println("Meeting will be on "
//                + betterMeetingDate.getMonth() + "/"
//                + betterMeetingDate.getDay() + "/"
//                + betterMeetingDate.getYear());
    }
}
