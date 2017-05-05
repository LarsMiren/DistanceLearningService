package entities;

import java.beans.Beans;

/**
 * Created by god on 05.05.17.
 */
public class Answer extends Beans {
    private long questionID;
    private String content;
    private int number;
    private AnswerTypes type;

    public Answer(long questionID, String content, int number, AnswerTypes type) {
        this.questionID = questionID;
        this.content = content;
        this.number = number;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AnswerTypes getType() {
        return type;
    }

    public void setType(AnswerTypes type) {
        this.type = type;
    }

    public long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(long questionID) {
        this.questionID = questionID;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "questionID=" + questionID +
                ", content='" + content + '\'' +
                ", number=" + number +
                ", type=" + type +
                '}';
    }
}
