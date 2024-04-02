package com.questions.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.questions.entity.Questions;
import com.questions.repository.QuestionsRepository;

@Service
public class QuestionServiceImpl implements QuestionsSevices {

	private QuestionsRepository questionsRepository;

	public QuestionServiceImpl(QuestionsRepository questionsRepository) {
		super();
		this.questionsRepository = questionsRepository;
	}

	@Override
	public Questions createQuestions(Questions questions) {
		// TODO Auto-generated method stub
		return questionsRepository.save(questions);
	}

	@Override
	public Questions getQuestions(Integer questionsId) {
		// TODO Auto-generated method stub
		return questionsRepository.findById(questionsId)
				.orElseThrow(() -> new RuntimeException("Questions NOt Found...!!"));
	}

	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionsRepository.findAll();
	}

	@Override
	public List<Questions> getQuiz(Integer quizId) {
		// TODO Auto-generated method stub

		return questionsRepository.findByQuizId(quizId);
	}

}
