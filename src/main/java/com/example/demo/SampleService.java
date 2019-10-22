package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {
 @Autowired
 private SampleRepository repository;

 public List<User> getUsers(){
    return repository.getAllUsers();
 }

 public void insertUser(){
     repository.insertSampleUser();
 }

}
