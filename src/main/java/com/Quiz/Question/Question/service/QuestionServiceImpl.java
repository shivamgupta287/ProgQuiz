package com.Quiz.Question.Question.service;

import com.Quiz.Question.Question.dao.QuestionRepository;
import com.Quiz.Question.Question.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;
    @Autowired
    public QuestionServiceImpl(QuestionRepository theQuestionRepository){
        questionRepository = theQuestionRepository;
    }
    @Override
    public ResponseEntity<List<Question>> findAll() {
        try {
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    @Override
    public Question findById(int Id) {
        Optional<Question> result = questionRepository.findById(Id);
        if (result.isPresent())
            return result.get();
        else
            throw new RuntimeException("Didn't find id - "+Id);
    }
    @Override
    public ResponseEntity<String> save(Question theQuestion) {
            questionRepository.save(theQuestion);
            return new ResponseEntity<>("Success",HttpStatus.OK);
    }
    @Override
    public void deleteById(int id) {
        questionRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<List<Question>> getQuestionByCategory(String Category) {
        try {
            return new ResponseEntity<>(questionRepository.findByCategory(Category),HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

}
