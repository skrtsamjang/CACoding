package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;
//import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearOutputBoundary;

import java.io.IOException;

public class ClearController {

    public final ClearInputBoundary userClearUseCaseInteractor;
    public ClearController(ClearInputBoundary userClearInteractor) {
        this.userClearUseCaseInteractor = userClearInteractor;
    }

    public void execute() { //from SignupView clear.addActionListener()
        userClearUseCaseInteractor.execute();
    }
}
