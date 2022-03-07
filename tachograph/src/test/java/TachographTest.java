import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TachographTest {

    private Tachograph tachograph;

    @Before
    public void before() {
        tachograph = new Tachograph();
        tachograph.store("16:50", "forward", "fast");
    }

    @Test
    public void AssertingTrue() {
        Assert.assertTrue(!tachograph.isEmpty());
    }
}