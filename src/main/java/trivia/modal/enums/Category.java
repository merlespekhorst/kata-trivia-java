package trivia.modal.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Category {
    rock("rock"),
    ROCK("Rock"),
    SCIENCE("Science"),
    SPORTS("Sports");

    private final String status;
}


