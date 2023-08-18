package com.Quiz.Question.Question.service;

import com.Quiz.Question.Question.entity.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {
    ResponseEntity<List<Question>> findAll();

    Question findById(int id);

    ResponseEntity<String> save(Question theEmployee);

    void deleteById(int id);
    ResponseEntity<List<Question>> getQuestionByCategory(String Category);
}
