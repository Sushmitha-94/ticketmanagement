package com.sush.ticket;

import com.sush.ticket.model.Ticket;
import com.sush.ticket.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketServiceImpl ticketServiceImpl;

    @RequestMapping("/getDetails")
    public Ticket getTicketDetails(@RequestParam(value="id") Integer id){
        Ticket ticket= ticketServiceImpl.getTicketDetils(id);
        return ticket;
    }
}
