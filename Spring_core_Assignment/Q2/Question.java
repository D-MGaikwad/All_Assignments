package com.spring;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int questionId;  
	private String question;  
	private List<String> answers;
	  
	public Question() {}  
	public Question(int id, String question, List<String> answers ) {  
	    super();  
	    this.questionId = id;  
	    this.question = question;  
	    this.answers = answers;    
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
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void displayInfo(){  
	    System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}
	
	@Override
	public String toString() {
		return "Question [QuestionId=" + questionId + ", Question= " + question + ", Answers= " + answers+ "]";
	}
	
	
		
}
