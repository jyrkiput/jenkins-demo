package fi.sysart.jenkinsdemo;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void returnOneReturnsOne() {
        assertThat(Main.returnOne(), is(1));
    }

}