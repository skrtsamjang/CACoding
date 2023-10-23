package interface_adapter.clear_users;

// TODO Complete me
//import interface_adapter.signup.SignupViewModel;
import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
//    private final SignupViewModel signupViewModel;
    private ViewManagerModel viewManagerModel;
    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData usernames) {
        // on success, make a popup for the app
        ClearState state = clearViewModel.getState();
        state.setUsernames(usernames.getUsernames());
        clearViewModel.setState(state);

        clearViewModel.firePropertyChanged();
        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String usernames) {
// Lol you can't really fail the clear button...
//        signupViewModel.firePropertyChanged();
    }
}
