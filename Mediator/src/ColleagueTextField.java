import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;
    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {
        this.setEnabled(enabled);
        this.setBackground(enabled ? Color.white : Color.lightGray);
    }
    public void textValueChanged(TextEvent event) {
        this.mediator.colleagueChanged(this);
    }
}