package com.Quiz.Question.Question.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @ManyToMany
    private List<Question> question;

//    public Quiz(String title, List<Question> question) {
//        this.title = title;
//        this.question = question;
//    }

//    public Quiz() {
//
//    }

//    public Quiz() {
//
//    }
//
//    @Override
//    public String toString() {
//        return "Quiz{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", question=" + question +
//                '}';
//    }
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<Question> getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(List<Question> question) {
//        this.question = question;
//    }
}
