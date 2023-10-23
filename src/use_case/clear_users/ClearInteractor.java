package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;
import entity.CommonUserFactory;
import entity.User;
import entity.UserFactory;
import interface_adapter.ViewManagerModel;
import interface_adapter.ViewModel;
import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.signup.SignupViewModel;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ClearInteractor implements ClearInputBoundary {
// grab all the data access from FileUserDataAccessObject and want to remove all the users
    public final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface, ClearOutputBoundary userPresenter) {

        ClearViewModel clearViewModel = new ClearViewModel();
        SignupViewModel signupViewModel = new SignupViewModel();

        this.userDataAccessObject = clearDataAccessInterface;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute() { //from ClearController execute()

        ClearOutputData userOutputData = new ClearOutputData(userDataAccessObject.getUsernames());
        userOutputData.setUsernames(userDataAccessObject.getUsernames());
        userPresenter.prepareSuccessView(userOutputData);

        userDataAccessObject.clearUsernames();


    }
}
