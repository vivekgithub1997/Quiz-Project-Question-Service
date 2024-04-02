package com.questions.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questions.entity.Questions;
import com.questions.services.QuestionsSevices;

@RestController
@RequestMapping("/question")
public class QustionsController {
	private QuestionsSevices questionsSevices;

	public QustionsController(QuestionsSevices questionsSevices) {
		super();
		this.questionsSevices = questionsSevices;
	}

	@PostMapping("/")
	public Questions createQuestion(@RequestBody Questions questions) {
		return questionsSevices.createQuestions(questions);

	}

	@GetMapping("/{questionId}")
	public Questions getQuestion(@PathVariable Integer questionId) {

		return questionsSevices.getQuestions(questionId);
	}

	@GetMapping("/")
	public List<Questions> getAllQuestions() {

		return questionsSevices.getAllQuestions();
	}

	@GetMapping(value = "/quiz/{quizId}", produces = "application/json")
	public List<Questions> getQuizById(@PathVariable Integer quizId) {
		return questionsSevices.getQuiz(quizId);
	}
}
