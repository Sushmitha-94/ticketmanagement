package com.sush.ticket;

import com.sush.ticket.model.Ticket;
import com.sush.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketServiceImpl;

    @RequestMapping("/getDetails")
    public Ticket getTicketDetails(@RequestParam(value="id") Integer id){
        Ticket ticket= ticketServiceImpl.getTicketDetils(id);
        return ticket;
    }

    @PostMapping("/newTicket")
    public Ticket saveTicket(@RequestBody Ticket ticket){
        ticket = ticketServiceImpl.saveTicket(ticket);
        return ticket;
    }

    @PutMapping("/updateTicket")
    public Ticket updateTicket(@RequestBody Ticket ticket){
        ticket = ticketServiceImpl.updateTicket(ticket);
        return ticket;
    }

    @DeleteMapping("/deleteTicket/{id}")
    public Integer deleteTicket(@PathVariable(value="id") Integer id){
        ticketServiceImpl.deleteTicket(id);
        return id;
    }
}
