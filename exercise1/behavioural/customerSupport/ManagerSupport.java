package exercise1.behavioural.customerSupport;

public class ManagerSupport extends SupportLevel{
    @Override
    public void handleIssue(Issue issue) {
        if ("hard".equals(issue.getDifficulty())) {
            System.out.println("Manager resolved the issue!");
        } else {
            System.out.println("Issue could not be resolved by any support level.");
        }
    }
}
