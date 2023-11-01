package date1;

public class Date1 {
    public static void main(String[] args) {
        Date meetingDate = new Date(3, 29, 2012);

//        meetingDate.month = 2;
//        meetingDate.day = 29;
//        meetingDate.year = 2012;
        meetingDate.day++;

        System.out.println("Meeting will be on "
                + meetingDate.month + "/"
                + meetingDate.day + "/"
                + meetingDate.year);

        Date betterMeetingDate = new Date(2, 29, 2012);
        betterMeetingDate.nextDay();
        System.out.println("Meeting will be on "
                + betterMeetingDate.month + "/"
                + betterMeetingDate.day + "/"
                + betterMeetingDate.year);
    }
}
