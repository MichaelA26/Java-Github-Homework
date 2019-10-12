import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RespositoryType repositorytype;
    private ArrayList<Commit> commits;

    public Repository(RespositoryType respositoryType, RespositoryType aPrivate) {
        this.name = name;
        this.description = description;
        this.repositorytype = repositorytype;
        this.commits = new ArrayList<Commit>();
    }


    public ArrayList<Commit> getCommits() {
        return this.commits;
    }

    public RespositoryType getType() {
        return repositorytype.PRIVATE;
    }
}
