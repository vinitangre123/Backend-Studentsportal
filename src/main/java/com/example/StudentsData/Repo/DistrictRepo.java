package com.example.StudentsData.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentsData.Entity.District;

public interface DistrictRepo extends JpaRepository<District, Integer>  {

}
