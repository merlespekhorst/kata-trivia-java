package trivia.repository;

import trivia.modal.dto.Question;
import trivia.modal.enums.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public class QuestionsRepository {
    Map<Category, List<Question>> questionsByCategory = new HashMap<>();

    public Question getQuestions(Category category) {

    }
}
