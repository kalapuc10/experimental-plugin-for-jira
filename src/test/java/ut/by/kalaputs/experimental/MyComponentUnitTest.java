package ut.by.kalaputs.experimental;

import org.junit.Test;
import by.kalaputs.experimental.api.MyPluginComponent;
import by.kalaputs.experimental.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}