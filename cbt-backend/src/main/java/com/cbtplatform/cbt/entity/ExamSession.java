package com.cbtplatform.cbt.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="exam_sessions")
public class ExamSession {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, columnDefinition="TEXT")
	private String studentName;
	
	@Column(nullable=false, columnDefinition="TEXT")
	private String examName;
	
	@Column (nullable=false)
	private LocalDateTime startedAt;
	
	private LocalDateTime submittedAt;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private ExamStatus status;
	
	private int correctMarks;
	
	private int negativeMarks;
	
	private int tabSwitchDeduction;
	
	private int finalScore;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public LocalDateTime getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(LocalDateTime startedAt) {
		this.startedAt = startedAt;
	}

	public LocalDateTime getSubmittedAt() {
		return submittedAt;
	}

	public void setSubmittedAt(LocalDateTime submittedAt) {
		this.submittedAt = submittedAt;
	}

	public ExamStatus getStatus() {
		return status;
	}

	public void setStatus(ExamStatus status) {
		this.status = status;
	}

	public int getCorrectMarks() {
		return correctMarks;
	}

	public void setCorrectMarks(int correctMarks) {
		this.correctMarks = correctMarks;
	}

	public int getNegativeMarks() {
		return negativeMarks;
	}

	public void setNegativeMarks(int negativeMarks) {
		this.negativeMarks = negativeMarks;
	}

	public int getTabSwitchDeduction() {
		return tabSwitchDeduction;
	}

	public void setTabSwitchDeduction(int tabSwitchDeduction) {
		this.tabSwitchDeduction = tabSwitchDeduction;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	public ExamSession() {
		
	}
	
	public ExamSession(Long id, String studentName, String examName, LocalDateTime startedAt, LocalDateTime submittedAt,
			ExamStatus status, int correctMarks, int negativeMarks, int tabSwitchDeduction, int finalScore) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.examName = examName;
		this.startedAt = startedAt;
		this.submittedAt = submittedAt;
		this.status = status;
		this.correctMarks = correctMarks;
		this.negativeMarks = negativeMarks;
		this.tabSwitchDeduction = tabSwitchDeduction;
		this.finalScore = finalScore;
	}
	
	
}
