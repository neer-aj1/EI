package exercise1.behavioural.customerSupport;

abstract class SupportLevel {
    protected SupportLevel nextLevel;
    public void setNextLevel(SupportLevel nextLevel){
        this.nextLevel = nextLevel;
    }
    public abstract void handleIssue(Issue issue);
}
