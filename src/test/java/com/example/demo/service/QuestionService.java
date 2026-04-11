package com.example.demo.service;

import com.example.demo.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionService {

    private List<Question> questions = new ArrayList<>();
    private Random random = new Random();

    public QuestionService() {
        questions.add(new Question(
                "What does DNS do?",
                "translates domain names",
                "DNS converts human-readable domain names into IP addresses."
        ));

        questions.add(new Question(
                "What is HTTP?",
                "protocol",
                "HTTP is a protocol used for communication between client and server."
        ));

        questions.add(new Question(
                "What is an IP address?",
                "unique identifier",
                "An IP address uniquely identifies a device on a network."
        ));
    }

    public Question getRandomQuestion() {
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

    public boolean checkAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.toLowerCase().contains(correctAnswer.toLowerCase());
    }
}