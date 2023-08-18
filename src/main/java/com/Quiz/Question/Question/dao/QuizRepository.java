package com.Quiz.Question.Question.dao;

import com.Quiz.Question.Question.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
