package module_1_2.projects.quiz_app.backend.services;

import module_1_2.projects.quiz_app.backend.dtos.TestResult;

public interface StudentService {
    void addTestResult(TestResult testResult);

    TestResult[] getTestResultsByUser(String username);

}
