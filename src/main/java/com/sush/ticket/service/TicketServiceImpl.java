package com.sush.ticket.service;

import com.sush.ticket.model.Ticket;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TicketServiceImpl implements TicketService {

    @Override
    public Ticket getTicketDetils(Integer id) {
        Ticket newTicket=new Ticket();
        newTicket.setId(id);
        newTicket.setFrom("Pudukkottai");
        newTicket.setTo("Chennai");
        newTicket.setName("Sushmitha");
        newTicket.setDateOfJourney(new Date());
        return newTicket;
    }
}
