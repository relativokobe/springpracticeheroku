package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SampleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers(){
        final Query query = entityManager.createNativeQuery("Select * FROM users");
        final List<Object[]> rows = query.getResultList();
        final List<User> users = new ArrayList<>();

        for(Object[] row: rows){
            users.add(new User((Integer) row[0], (String) row [1], (Integer) row[2]));
        }

        return users;
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
