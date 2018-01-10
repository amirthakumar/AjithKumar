package in.vamsoft.settermap;

import java.util.List;

public class Question {

	int num;
	String question;
	List<String> answers;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	@Override
	public String toString() {
		return "Question [num=" + num + ", question=" + question + ", answers=" + answers + "]";
	}

}
