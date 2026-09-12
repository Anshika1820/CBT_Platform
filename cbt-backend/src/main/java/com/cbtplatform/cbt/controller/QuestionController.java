package com.cbtplatform.cbt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbtplatform.cbt.entity.Question;
import com.cbtplatform.cbt.service.QuestionService;

@RestController
@RequestMapping("api/questions")
public class QuestionController {
	private QuestionService questionService;
	
	public QuestionController(QuestionService questionService) {
		this.questionService=questionService;
	}
	
	@PostMapping
	public ResponseEntity<Question> createQuestion(@RequestBody Question question){
		Question savedQuestion= questionService.saveQuestion(question);
		return ResponseEntity.ok(savedQuestion);
	}
	
	@GetMapping
	public ResponseEntity<List<Question>> getAllQuestions(){
		List<Question> questions=questionService.getAllQuestions();
		return ResponseEntity.ok(questions);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Question> getQuestionById(@PathVariable Long id){
		Question question=questionService.getQuestionById(id);
		return ResponseEntity.ok(question);
	}
}
