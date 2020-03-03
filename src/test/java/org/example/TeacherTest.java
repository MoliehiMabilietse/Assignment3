package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeacherTest {

    private TeacherTest teach;
    Learner lear = new Learner("Nthabeleng", "Mabilietse","Maths");

    @Test
    public void name(){
        Assert.assertEquals("Nthabeleng",lear.getName());
    }

    @Test
    public void surname(){
        Assert.assertEquals("Mabilietse",lear.getSurname());
    }

    @Test
    public void subject(){
        Assert.assertEquals("Maths",lear.getSubject());
    }


}
