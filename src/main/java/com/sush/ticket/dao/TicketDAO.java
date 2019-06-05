package com.sush.ticket.dao;

import com.sush.ticket.model.Ticket;

public interface TicketDAO {
    public Ticket getTicketDetails(Integer id);
    public Ticket insertTicket(Ticket ticket);
    public Ticket updateTicket(Ticket ticket);
    public void deleteTicket(Ticket ticket);
}
