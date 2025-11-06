package projects.quiz_app.backend.services;

import projects.quiz_app.backend.dtos.TestResult;

public interface StudentService {
    void addTestResult(TestResult testResult);

    TestResult[] getTestResultsByUser(String username);

}
