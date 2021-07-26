package com.spring;

import java.util.Iterator;
import java.util.Set;

public class Question1 {

	private int questionId;  
	private String question; 
	private Set<String> answersSet;
		
	public Question1(int questionId, String question, Set<String> answersSet) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answersSet = answersSet;
	}

	public Question1() {
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

	public Set<String> getAnswersSet() {
		return answersSet;
	}

	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}
	
	public void displayInfo1(){  
	    System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answersSet.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}

	@Override
	public String toString() {
		return "Question1 [QuestionId=" + questionId + ", Question= " + question + ", Answers= " + answersSet + "]";
	}
	
	
	
}
