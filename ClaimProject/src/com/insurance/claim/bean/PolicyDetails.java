package com.insurance.claim.bean;

public class PolicyDetails {
private long PolicyNumber;
private int QuestionId;
private String Answer;

public PolicyDetails() {
// TODO Auto-generated constructor stub
}

public PolicyDetails(long PolicyNumber, int QuestionId, String Answer) {
super();
this.PolicyNumber = PolicyNumber;
this.QuestionId = QuestionId;
this.Answer = Answer;
}

public long getPolicyNumber() {
return PolicyNumber;
}

public void setPolicyNumber(long PolicyNumber) {
this.PolicyNumber = PolicyNumber;
}

public int getQuestionId() {
return QuestionId;
}

public void setQuestionId(int QuestionId) {
this.QuestionId = QuestionId;
}

public String getAnswer() {
return Answer;
}

public void setAnswer(String Answer) {
this.Answer = Answer;
}
}
