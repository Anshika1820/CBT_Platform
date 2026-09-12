package com.cbtplatform.cbt.entity;

import jakarta.persistence.*;

@Entity
@Table(name="answers")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="exam_session_id", nullable=false)
	private ExamSession examSession;
	
	@ManyToOne
	@JoinColumn(name="question_id", nullable=false)
	private Question question;
	
	@Column(nullable=false)
	private String selectedOption;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ExamSession getExamSession() {
		return examSession;
	}

	public void setExamSession(ExamSession examSession) {
		this.examSession = examSession;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getSelectedOption() {
		return selectedOption;
	}

	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}
	
	public Answer() {
		
	}
	
	public Answer(Long id, ExamSession examSession, Question question, String selectedOption) {
		super();
		this.id = id;
		this.examSession = examSession;
		this.question = question;
		this.selectedOption = selectedOption;
	}
}
