package com.questions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questions.entity.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer>{
	
	List<Questions> findByQuizId(Integer quizId);

}
