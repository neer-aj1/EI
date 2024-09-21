package exercise1.behavioural.customerSupport;

public class SupervisorSupport extends SupportLevel{
    @Override
    public void handleIssue(Issue issue) {
        if ("medium".equals(issue.getDifficulty())) {
            System.out.println("Supervisor resolved the issue!");
        } else {
            System.out.println("Supervisor escalated the issue.");
            if (nextLevel != null) {
                nextLevel.handleIssue(issue);
            }
        }
    }
}
