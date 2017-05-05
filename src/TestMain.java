import entities.Answer;
import entities.AnswerTypes;

/**
 * Created by god on 05.05.17.
 */
public class TestMain {
    public static void main(String[] args) {
        Answer answer = new Answer(122233,"How to make it better?",
                12, AnswerTypes.CHECKBOX);
        System.out.println(answer.toString());
    }
}
