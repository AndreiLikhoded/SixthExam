package Collaboration;

import com.java.sixthExamine.Month;
import com.java.sixthExamine.server.Lesson44Server;
import com.sun.net.httpserver.HttpExchange;


import java.io.IOException;

public class Calendar extends Lesson44Server {

    private Month month;

    public Calendar(String host, int port) throws IOException {
        super(host, port);
        month = new Month();
        registerGet("/calendar", this::calendarGet);
    }

    private void calendarGet(HttpExchange exchange) {

        renderTemplate(exchange, "calendar.html", month.getDays());
    }
}
