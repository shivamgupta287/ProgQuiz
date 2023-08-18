package com.Quiz.Question.Question.dao;

import com.Quiz.Question.Question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface QuestionRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RAND() LIMIT :numQ",nativeQuery = true)

    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
