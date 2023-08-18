package com.Quiz.Question.Question.controller;

import com.Quiz.Question.Question.entity.Question;
import com.Quiz.Question.Question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
private QuestionService questionService;
    @Autowired
    public QuestionController(QuestionService theQuestionServie){
        questionService = theQuestionServie;
    }

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> findAll(){
        return questionService.findAll();
    }

    @GetMapping("/question/{Id}")
    public Question findById(@PathVariable int Id){
        Question theQuestion =  questionService.findById(Id);
        if (theQuestion == null){
            throw new RuntimeException("Employee id not Found-"+Id);
        }
        return theQuestion;
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }


    @PostMapping("/addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody Question theQuestion){
        //in case only id is passed then set id = 0
        //this is to force to save of new item ... instead of update
        theQuestion.setId(0);
        return questionService.save(theQuestion);
    }

    @PutMapping("/addQuestion")
    public ResponseEntity<String> updateQuestion(@RequestBody Question theQuestion){
        return questionService.save(theQuestion);
    }

    @DeleteMapping("/deleteQuestion/{ID}")
    public String deleteQuestion(@PathVariable int ID){
        if (findById(ID) == null){
            throw new RuntimeException("Employee ID Doesn't Exist"+ID);
        }
        questionService.deleteById(ID);
        return "Deleted the Question - "+ID;
    }

}
