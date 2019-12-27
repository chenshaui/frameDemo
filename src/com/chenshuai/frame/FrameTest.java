package com.chenshuai.frame;

import org.junit.Test;

public class FrameTest {
    @Test
    public void test() throws Exception {
        Student student = (Student) new ReflectFrame().getClassObject();
        student.getName();
    }
}
