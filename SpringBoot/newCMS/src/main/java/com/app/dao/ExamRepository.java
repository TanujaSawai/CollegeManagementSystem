package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer> {

}
