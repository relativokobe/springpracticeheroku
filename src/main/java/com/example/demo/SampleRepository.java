package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class SampleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List getAllUsers(){
        final Query query = entityManager.createNativeQuery("Select * FROM users");

        return query.getResultList();
    }

    @Transactional
    public void insertSampleUser(){
        final Query query = entityManager.createNativeQuery("INSERT INTO users (id, name, age) VALUES (?, ?, ?);");
        query.setParameter(1, (int)Math.random());
        query.setParameter(2, "kobe");
        query.setParameter(3, 22);
        query.executeUpdate();
    }

}
