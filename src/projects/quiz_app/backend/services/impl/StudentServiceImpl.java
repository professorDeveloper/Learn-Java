package projects.quiz_app.backend.services.impl;

import projects.quiz_app.backend.dtos.TestResult;
import projects.quiz_app.backend.services.StudentService;

public class StudentServiceImpl implements StudentService {
    private final TestResult[] testResults = new TestResult[100];

    private static final StudentServiceImpl instance = new StudentServiceImpl();

    public static StudentServiceImpl getInstance() {
        return instance;
    }

    private StudentServiceImpl() {
    }


    private int index = 0;


    @Override
    public void addTestResult(TestResult testResult) {
        if (index < testResults.length) {
            testResults[index++] = testResult;
        }
    }

    @Override
    public TestResult[] getTestResultsByUser(String username) {
        TestResult[] userTestResults = new TestResult[100];
        int count = 0;
        for (TestResult testResult : testResults) {
            if (testResult != null && testResult.username().equals(username)) {
                userTestResults[count++] = testResult;
            }
        }
        return userTestResults;
    }

}
