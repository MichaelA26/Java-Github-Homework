import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RespositoryType repositorytype;
    private ArrayList<Commit> commits;

    public Repository() {
        this.name = name;
        this.description = description;
        this.repositorytype = repositorytype;
        this.commits = new ArrayList<Commit>();
    }

}
