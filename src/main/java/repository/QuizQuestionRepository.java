package com.alumni.backend.repository;

import com.alumni.backend.model.QuizQuestion;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface QuizQuestionRepository extends MongoRepository<QuizQuestion, String> {
    List<QuizQuestion> findByCategory(String category); // To get questions by skill category

    List<QuizQuestion> findByCategoryIn(List<String> categories); // To get questions from multiple skill categories
}