package com.Quiz.Question.Question.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;
    @Column(name = "category")
    private String category;
    @Column(name = "difficulty_level")
    private String difficultLevel;
    @Getter
    @Column(name = "option1")
    private String option1;
    @Column(name = "option2")
    private String option2;
    @Column(name = "option3")
    private String option3;
    @Column(name = "option4")
    private String option4;
    @Column(name = "question_title")
    private String questionTitle;
    @Column(name ="right_answer")
    private String rightAnswer;
    public Question(){}

    public Question(int id, String category, String difficultLevel, String option1, String option2, String option3, String option4, String questionTitle, String rightAnswer) {
        this.id = id;
        this.category = category;
        this.difficultLevel = difficultLevel;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questionTitle = questionTitle;
        this.rightAnswer = rightAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }
    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", difficultLevel='" + difficultLevel + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                ", questionTitle='" + questionTitle + '\'' +
                ", rightAnswer='" + rightAnswer + '\'' +
                '}';
    }

}
