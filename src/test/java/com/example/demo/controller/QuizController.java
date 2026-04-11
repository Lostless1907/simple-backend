package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class QuizController {

    @Autowired
    private QuestionService questionService;

    private Question currentQuestion;

    @GetMapping("/question")
    public Question getQuestion() {
        currentQuestion = questionService.getRandomQuestion();
        return currentQuestion;
    }

    @PostMapping("/answer")
    public Map<String, Object> checkAnswer(@RequestParam String answer) {

        if (currentQuestion == null) {
            return Map.of(
                    "error", "No question asked yet"
            );
        }

        boolean correct = questionService.checkAnswer(answer, currentQuestion.getAnswer());

        return Map.of(
                "correct", correct,
                "explanation", currentQuestion.getExplanation()
        );
    }
}