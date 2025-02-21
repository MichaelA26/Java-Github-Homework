import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;

    @Before
    public void setup() {
        commit = new Commit(CommitType.FEATURE, Description.COMMITDESCRIPTION, UniqueID.VALUE);
    }

    @Test
    public void commitHasCommitType() {
        assertEquals(CommitType.FEATURE, commit.getCommitType());
    }

    @Test
    public void commitHasDescription() {
        assertEquals(Description.COMMITDESCRIPTION, commit.getDescription());
    }

    @Test
    public void commitHasUniqueID() {
        assertEquals(UniqueID.VALUE, commit.getUniqueID());
    }
}
