import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkboxGuest;
    private ColleagueCheckbox checkboxLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);

        this.setBackground(Color.lightGray);
        this.setLayout(new GridLayout(4, 2));

        this.createColleagues();

        // first row
        this.add(this.checkboxGuest);
        this.add(this.checkboxLogin);

        // second row
        this.add(new Label("Username"));
        this.add(this.textUser);

        // third row
        this.add(new Label("Password"));
        this.add(this.textPass);

        // fourth row
        this.add(this.buttonOk);
        this.add(this.buttonCancel);

        // init
        this.colleagueChanged(this.checkboxGuest);

        // fininsh
        this.pack();
        this.show();
    }

    public void createColleagues() {
        // create checkbox
        CheckboxGroup group = new CheckboxGroup();
        this.checkboxGuest = new ColleagueCheckbox("Guest", group, true);
        this.checkboxLogin = new ColleagueCheckbox("Login", group, false);
        // create textfield
        this.textUser = new ColleagueTextField("", 10);
        this.textPass = new ColleagueTextField("", 10);
        this.textPass.setEchoChar('*');
        // create button
        this.buttonOk = new ColleagueButton("OK");
        this.buttonCancel = new ColleagueButton("Cancel");
        // set `this` as a mediator to all Colleagues
        this.checkboxGuest.setMediator(this);
        this.checkboxLogin.setMediator(this);
        this.textUser.setMediator(this);
        this.textPass.setMediator(this);
        this.buttonOk.setMediator(this);
        this.buttonCancel.setMediator(this);
        // set listener
        this.checkboxGuest.addItemListener(this.checkboxGuest);
        this.checkboxLogin.addItemListener(this.checkboxLogin);
        this.textUser.addTextListener(this.textUser);
        this.textPass.addTextListener(this.textPass);
        this.buttonOk.addActionListener(this);
        this.buttonCancel.addActionListener(this);
    }

    public void colleagueChanged(Colleague colleague) {
        if (colleague == this.checkboxGuest || colleague == this.checkboxLogin) {
            if (this.checkboxGuest.getState()) {
                this.textUser.setColleagueEnabled(false);
                this.textPass.setColleagueEnabled(false);
                this.buttonOk.setColleagueEnabled(true);
            } else {
                this.textUser.setColleagueEnabled(true);
                this.userpassChanged();
            }
        } else if (colleague == this.textUser || colleague == this.textPass) {
            this.userpassChanged();
        } else {
            System.out.println("colleagueChanged:unknown colleague = " + colleague.toString());
        }
    }
    private void userpassChanged() {
        if (this.textUser.getText().length() > 0) {
            this.textPass.setColleagueEnabled(true);
            if (this.textPass.getText().length() > 0) {
                this.buttonOk.setColleagueEnabled(true);
            } else {
                this.buttonOk.setColleagueEnabled(false);
            }
        } else {
            this.textPass.setColleagueEnabled(false);
            this.buttonOk.setColleagueEnabled(false);
        }
    }
    public void actionPerformed(ActionEvent event) {
        System.out.println(event.toString());
        System.exit(0);
    }
}