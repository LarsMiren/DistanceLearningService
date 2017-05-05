package entities;

/**
 * Created by god on 05.05.17.
 */
public enum AnswerTypes {
    CHECKBOX, RADIO, TEXTFIELD, TEXTAREA;

    @Override
    public String toString() {
        switch (this) {
            case CHECKBOX: return "checkbox";
            case RADIO: return "radio";
            case TEXTFIELD: return "textfield";
            case TEXTAREA: return "textarea";
            default: return null;//Сделать нормально
        }
    }
}
