package com.sush.ticket.dao;

import com.sush.ticket.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDAOImpl implements TicketDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Ticket getTicketDetails(Integer id) {
        return sessionFactory.getCurrentSession().get(Ticket.class,id);
    }

    @Override
    public Ticket insertTicket(Ticket ticket) {
        sessionFactory.getCurrentSession().save(ticket);
        return ticket;
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        sessionFactory.getCurrentSession().update(ticket);
        return ticket;
    }

    @Override
    public void deleteTicket(Ticket ticket) {
        sessionFactory.getCurrentSession().delete(ticket);
    }
}
