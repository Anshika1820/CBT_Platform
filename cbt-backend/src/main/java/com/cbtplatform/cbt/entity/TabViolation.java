package com.cbtplatform.cbt.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="tab_violations")
public class TabViolation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="exam_session_id", nullable=false)
	private ExamSession examSesion;
	
	@Column(nullable=false)
	private LocalDateTime occuredAt;
	
	@Column(nullable=false)
	private int deduction;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public ExamSession getExamSesion() {
		return examSesion;
	}

	public void setExamSesion(ExamSession examSesion) {
		this.examSesion = examSesion;
	}

	public LocalDateTime getOccuredAt() {
		return occuredAt;
	}

	public void setOccuredAt(LocalDateTime occuredAt) {
		this.occuredAt = occuredAt;
	}

	public int getDeduction() {
		return deduction;
	}

	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}
	
	public TabViolation() {
		
	}
	
	public TabViolation(Long id, ExamSession examSesion, LocalDateTime occuredAt, int deduction) {
		super();
		this.id = id;
		this.examSesion = examSesion;
		this.occuredAt = occuredAt;
		this.deduction = deduction;
	}
	
}
