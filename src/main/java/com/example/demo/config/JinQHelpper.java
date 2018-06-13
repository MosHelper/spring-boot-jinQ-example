package com.example.demo.config;

import com.example.demo.model.Customer;
import org.jinq.jpa.JPAJinqStream;
import org.jinq.jpa.JinqJPAStreamProvider;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Component
public class JinQHelpper {
    private JinqJPAStreamProvider streams;

    @PersistenceContext
    private EntityManager em;

    // Wrapper that passes through Jinq requests to Jinq
    public <U> JPAJinqStream<U> streamAll(Class<U> entity) {
        return streams.streamAll(em, entity);
    }


}
