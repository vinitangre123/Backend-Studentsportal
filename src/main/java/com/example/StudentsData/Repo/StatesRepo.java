package com.example.StudentsData.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentsData.Entity.States;

public interface StatesRepo extends JpaRepository<States, Integer> {

}
