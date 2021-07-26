package com.spring;

import java.util.Map;

public class Question2 {

	private int questionId;  
	private String question; 
	private Map<Integer, String> answersMap;
	
	public Question2(int questionId, String question, Map<Integer, String> answersMap) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answersMap = answersMap;
	}

	public Question2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}

	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}
	
	public void displayInfo11(){  
	    System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	}
	
	@Override
	public String toString() {
		return "Question2 [QuestionId=" + questionId + ", Question= " + question + ", Answers= " + answersMap + "]";
	}
	
	
}
