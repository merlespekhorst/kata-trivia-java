package trivia.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import trivia.modal.dto.Question;
import trivia.modal.enums.Category;
public class QuestionsRepository {

    private static final String questionTemplate = "question_";

    public Map<Category, List<Question>> loadQuestions() throws IOException {
        Map<Category, List<Question>> questionsByCategory = new HashMap<>();

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "rock.properties";

        Properties prop = new Properties();
        prop.load(new FileInputStream(appConfigPath));

        questionsByCategory.put(Category.ROCK, retrieveQuestions("rock.properties"));
        questionsByCategory.put(Category.SCIENCE, retrieveQuestions("science.properties"));
        questionsByCategory.put(Category.SPORTS, retrieveQuestions("sports.properties"));
        questionsByCategory.put(Category.POP, retrieveQuestions("pop.properties"));


        return null;
    }

    public Question getQuestions(Category category) {
        return null;
    }

    private List<Question> retrieveQuestions(String resourceName) throws FileNotFoundException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + resourceName;

        Properties prop = new Properties();
        prop.load(new FileInputStream(appConfigPath));
        List<Question> questions = new ArrayList(prop.size());
        for (int i = 1; i <= prop.size(); i++) {
            questions.add(new Question(prop.getProperty(questionTemplate + i)));
        }

        return questions;
    }
}
