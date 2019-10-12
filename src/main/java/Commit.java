public class Commit {

    private Description description;
    private CommitType committype;
    private UniqueID uniqueid;

    public Commit(CommitType committype, Description description, UniqueID uniqueid) {
        this.description = description;
        this.committype = committype;
        this.uniqueid = uniqueid;
    }

}
