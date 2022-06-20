package com.project.capstone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.capstone.domain.dao.Dokter;
import com.project.capstone.repository.softdeletes.SoftDeletesRepository;

@Repository
public interface DokterRepository extends SoftDeletesRepository<Dokter, Long> {

    // Optional<Dokter> findOne(Long id);
    
}