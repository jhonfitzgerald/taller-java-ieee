package datetime;

import java.time.*;
import java.util.Date;

public class dateTime {
    public static void main(String[] args) {
        dateTime _datetime = new dateTime();
        _datetime.init();
    }

    public void init(){
        Date _date = new Date();
        System.out.println("fecha actual:"+_date);

        Instant _now = _date.toInstant();
        ZoneId _zona = ZoneId.systemDefault();
        LocalDateTime _localdatetime = LocalDateTime.ofInstant(_now, _zona);
        System.out.println("local date: "+_localdatetime);

        ZonedDateTime _zonedatetime = ZonedDateTime.ofInstant(_now, _zona);
        System.out.println("zone date time: "+_zonedatetime);
    }
}
