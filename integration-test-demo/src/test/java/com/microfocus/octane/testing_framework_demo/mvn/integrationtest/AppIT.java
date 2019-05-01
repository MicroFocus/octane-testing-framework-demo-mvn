package com.microfocus.octane.testing_framework_demo.mvn.integrationtest;

import com.microfocus.octane.testing_framework_demo.mvn.integrationtest.category.Slow;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@Category(Slow.class)
public class AppIT

{
    @Test
    public void testA(){

    }

    @Test
    public void testB(){

    }

    @Test
    public void testC(){

    }

}
