package com.Quiz.Question.Question.service;

import com.Quiz.Question.Question.dao.QuestionRepository;
import com.Quiz.Question.Question.dao.QuizRepository;
import com.Quiz.Question.Question.entity.Question;
import com.Quiz.Question.Question.entity.QuestionWrapper;
import com.Quiz.Question.Question.entity.Quiz;
import com.Quiz.Question.Question.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizRepository quizRepository;

    @Autowired
    QuestionRepository questionRepository;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {


        try {
            List<Question> questions= questionRepository.findRandomQuestionsByCategory(category,numQ);
            Quiz quiz = new Quiz();
            quiz.setTitle(title);
            quiz.setQuestion(questions);
            quizRepository.save(quiz);
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz=quizRepository.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestion();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for (Question q : questionsFromDB){
            QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            questionsForUser.add(qw);
        }
        return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizRepository.findById(id).get();
        List<Question> questions = quiz.getQuestion();
        int right =0;
        int i=0;
        for (Response response : responses){
            if(response.getResponse().equals(questions.get(i).getRightAnswer())){
                right++;
            }
            i++;

        }
        return new ResponseEntity<>(right,HttpStatus.OK);
    }
}
