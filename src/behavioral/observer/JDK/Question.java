package behavioral.observer.JDK;

public class Question {
    String userName;
    String questionContent;

    public String getUserName() {
        return userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public Question(QuestionBuilder questionBuilder) {
        this.userName = questionBuilder.userName;
        this.questionContent = questionBuilder.questionContent;
    }

    public static class QuestionBuilder {
        private String userName;
        private String questionContent;

        QuestionBuilder buildUserName(String userName) {
            this.userName = userName;
            return this;
        }

        QuestionBuilder buildQuestionContent(String content) {
            this.questionContent = content;
            return this;
        }

        Question buildQuestion() {
            return new Question(this);
        }
    }
}
