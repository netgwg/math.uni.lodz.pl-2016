package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

	@Test
    public void returnFalseObjectIsNull() {
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }

    @Test
    public void returnTrueObjectIsTheSame() {
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = an1;
        assertTrue(an1.equals(an2));
    }

    @Test
    public void returnFalseObjectIsDiffClass() {
        AnswerEntity an1 = new AnswerEntity();
        QuestionEntity an2 = new QuestionEntity();
        assertFalse(an1.equals(an2));
    }

    @Test
    public void returnFalseTextIsNull() {
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
        an2.setAnswerText("Tekst");
        assertFalse(an1.equals(an2));
    }

    @Test
    public void returnFalseTextIsDiff() {
        AnswerEntity an1 = new AnswerEntity();
        an1.setAnswerText("Tekstt");
        AnswerEntity an2 = new AnswerEntity();
        an2.setAnswerText("Tekst");
        assertFalse(an1.equals(an2));
    }

    @Test
    public void returnFalseIdIsNull() {
        AnswerEntity an1 = new AnswerEntity();
        an1.setAnswerText("Tekst");
        AnswerEntity an2 = new AnswerEntity();
        an2.setAnswerText("Tekst");
        an2.setId(new Long(2));
        assertFalse(an1.equals(an2));
    }

    @Test
    public void returnFalseIdIsDiff() {
        AnswerEntity an1 = new AnswerEntity();
        an1.setAnswerText("Tekst");
        an1.setId(new Long(1));
        AnswerEntity an2 = new AnswerEntity();
        an2.setAnswerText("Tekst");
        an2.setId(new Long(2));
        assertFalse(an1.equals(an2));
    }

    @Test
    public void returnFalseQuestionIsNull() {
        AnswerEntity an1 = new AnswerEntity();
        an1.setAnswerText("Tekst");
        an1.setId(new Long(2));
        AnswerEntity an2 = new AnswerEntity();
        an2.setAnswerText("Tekst");
        an2.setId(new Long(2));
        an2.setQuestion(new QuestionEntity());
        assertFalse(an1.equals(an2));
    }
    
     @Test
    public void returnFalseQuestionIsDiff() {
        AnswerEntity an1 = new AnswerEntity();
        an1.setAnswerText("Tekst");
        an1.setId(new Long(2));
        an1.setQuestion(new QuestionEntity());
        AnswerEntity an2 = new AnswerEntity();
        an2.setAnswerText("Tekst");
        an2.setId(new Long(2));
        an2.setQuestion(new QuestionEntity());
        assertFalse(an1.equals(an2));
    }
    
         @Test
    public void returnTrueObjectIsEquals() {
        AnswerEntity an1 = new AnswerEntity();
        an1.setAnswerText("Tekst");
        an1.setId(new Long(2));
        an1.setQuestion(new QuestionEntity());
        AnswerEntity an2 = new AnswerEntity();
        an2.setAnswerText("Tekst");
        an2.setId(new Long(2));
        an2.setQuestion(an1.getQuestion());
        assertTrue(an1.equals(an2));
    }
    
}