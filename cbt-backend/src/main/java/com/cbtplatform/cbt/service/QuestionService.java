package com.cbtplatform.cbt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cbtplatform.cbt.entity.Question;
import com.cbtplatform.cbt.repository.QuestionRepository;

@Service
public class QuestionService {
	private final QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository=questionRepository;
	}
	
	public Question saveQuestion(Question question) {
		return questionRepository.save(question);
	}
	
	public List<Question> getAllQuestions(){
		return questionRepository.findAll();
	}
	
	public Question getQuestionById(Long id) {
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found with id: "+id));
	}
}
