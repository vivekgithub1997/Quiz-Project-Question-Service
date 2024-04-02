package com.questions.services;

import java.util.List;

import com.questions.entity.Questions;

public interface QuestionsSevices {

	Questions createQuestions(Questions questions);

	Questions getQuestions(Integer questionsId);

	List<Questions> getAllQuestions();
	
	List<Questions> getQuiz(Integer quizId);

}
