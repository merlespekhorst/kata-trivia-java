package trivia.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import trivia.modal.dto.Question;
import trivia.modal.enums.Category;
public class QuestionsRepository {

    public Map<Category, List<Question>> loadQuestions() throws IOException {
        Map<Category, List<Question>> questionsByCategory = new HashMap<>();

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "rock.properties";

        Properties prop = new Properties();
        prop.load(new FileInputStream(appConfigPath));

        questionsByCategory.put(Category.rock, (List<Question>) prop.getProperty("rock"));

        return null;
    }

    public Question getQuestions(Category category) {
        return null;
    }
}
