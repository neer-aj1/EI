package exercise1.behavioural.customerSupport;

public class FrontDeskSupport extends SupportLevel{
    @Override
    public void handleIssue(Issue issue) {
        if("easy".equals(issue.getDifficulty())){
            System.out.println("Front Desk resolved the issue!");
        }
        else{
            System.out.println("Front Desk escalated the issue.");
            if (nextLevel != null) {
                nextLevel.handleIssue(issue);
            }
        }
    }
}
