package use_case.clear_users;

// TODO Complete me

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData usernames);
    void prepareFailView(String usernames);
}
