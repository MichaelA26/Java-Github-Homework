import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RespositoryTest {

    Commit commit;
    Repository repository;

    @Before
    public void setup(){
        commit = new Commit(CommitType.FEATURE, Description.COMMITDESCRIPTION, UniqueID.VALUE);
        repository = new Repository(RespositoryType.PRIVATE, RespositoryType.PUBLIC);
    }

    @Test
    public void repositoryCanHaveType(){
        assertEquals(RespositoryType.PRIVATE, repository.getType());
    }

}
