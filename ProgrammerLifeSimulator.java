class Project {
    private String name;
    private int deadlineDays;
    private boolean doomed;

    public Project(String name, int deadlineDays, boolean doomed) {
        this.name = name;
        this.deadlineDays = deadlineDays;
        this.doomed = doomed;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getDeadlineDays() { return deadlineDays; }
    public void setDeadlineDays(int deadlineDays) { this.deadlineDays = deadlineDays; }
    public boolean isDoomed() { return doomed; }
    public void setDoomed(boolean doomed) { this.doomed = doomed; }

    public void showStatus() {
        System.out.println("Project " + name + " | Deadline: " + deadlineDays + " days | Status: " + 
                           (doomed ? "Relax, it's already failed." : "Maybe there's hope, maybe not."));
    }
}

class Programmer {
    protected String name;
    protected int caffeineLevel;
    protected int yearsOfExperience;

    public Programmer(String name, int caffeineLevel, int yearsOfExperience) {
        this.name = name;
        this.caffeineLevel = caffeineLevel;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCaffeineLevel() { return caffeineLevel; }
    public void setCaffeineLevel(int caffeineLevel) { this.caffeineLevel = caffeineLevel; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    public void debug() {
        System.out.println(name + " is debugging... This might take a while. Maybe forever.");
    }

    public void reportStatus() {
        System.out.println(name + " says: \"Everything is on track... Probably.\"");
    }
}

class TeamLead extends Programmer {
    private int codeReviewsPending;
    private boolean jaded;

    public TeamLead(String name, int caffeineLevel, int yearsOfExperience, int codeReviewsPending, boolean jaded) {
        super(name, caffeineLevel, yearsOfExperience);
        this.codeReviewsPending = codeReviewsPending;
        this.jaded = jaded;
    }

    public int getCodeReviewsPending() { return codeReviewsPending; }
    public void setCodeReviewsPending(int codeReviewsPending) { this.codeReviewsPending = codeReviewsPending; }
    public boolean isJaded() { return jaded; }
    public void setJaded(boolean jaded) { this.jaded = jaded; }

    @Override
    public void reportStatus() {
        System.out.println(name + " (Team Lead) sighs and says: \"All good... if you ignore the upcoming disaster.\"");
    }

    public void reportStatus(boolean withSarcasm) {
        if (withSarcasm) {
            System.out.println(name + " sarcastically adds: \"Oh sure, it's all rainbows and unicorns here!\"");
        } else {
            reportStatus();
        }
    }
}

class DreamCompany {
    private String name;
    private int stockOptions;
    private boolean treatsProgrammersWell;

    public DreamCompany(String name, int stockOptions, boolean treatsProgrammersWell) {
        this.name = name;
        this.stockOptions = stockOptions;
        this.treatsProgrammersWell = treatsProgrammersWell;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getStockOptions() { return stockOptions; }
    public void setStockOptions(int stockOptions) { this.stockOptions = stockOptions; }
    public boolean isTreatsProgrammersWell() { return treatsProgrammersWell; }
    public void setTreatsProgrammersWell(boolean treatsProgrammersWell) { this.treatsProgrammersWell = treatsProgrammersWell; }

    public void dreamPitch() {
        System.out.println("Company " + name + " promises: " + 
                           (treatsProgrammersWell ? "Real benefits for programmers! (As if)" : "Unlimited pizza and dreams of stock options."));
    }
}

public class ProgrammerLifeSimulator {
    public static void main(String[] args) {
        Project projectX = new Project("Project X", 10, true);
        projectX.showStatus();

        Programmer john = new Programmer("John the Coder", 900, 5);
        john.debug();
        john.reportStatus();

        TeamLead alice = new TeamLead("Alice the Lead", 1200, 10, 3, true);
        alice.reportStatus();
        alice.reportStatus(true);

        DreamCompany dreamInc = new DreamCompany("Dream Inc.", 1000, false);
        dreamInc.dreamPitch();
    }
}
