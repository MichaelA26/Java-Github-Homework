public class Commit {

    private Description description;
    private CommitType committype;
    private UniqueID uniqueid;

    public Commit(CommitType committype, Description description, UniqueID uniqueid) {
        this.description = description;
        this.committype = committype;
        this.uniqueid = uniqueid;
    }

    public CommitType getCommitType() {
        return committype;
    }

    public Description getDescription() {
        return description;
    }

    public UniqueID getUniqueID() {
        return uniqueid;
    }
}
