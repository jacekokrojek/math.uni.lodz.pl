package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity answerA = new AnswerEntity();
        AnswerEntity answerB = null;
        assertFalse(answerA.equals(answerB));
    }
   

@Test
public void shouldReturnFalseWhenObjectClassNotEqualsSecondObjectClass(){
    AnswerEntity answerA = new AnswerEntity();
    Object answerB = new Object();
    assertFalse(answerA.equals(answerB));
}


@Test
public void shouldReturnFalseWhenFirstObjectIdAndSecondObjectIdAreNotEqual(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    answerA.setId(3L);
    answerB.setId(4L);
    assertFalse(answerA.equals(answerB));
}

@Test
public void shouldReturnFalseWhenFirstObjectQuestionAndSecondQuestionAreNotEqual(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    QuestionEntity question = new QuestionEntity();
    question.setId(1L);
    answerA.setQuestion(question);
    answerB.setQuestion(new QuestionEntity());
    assertFalse(answerA.equals(answerB));
}
@Test
public void shouldReturnFalseWhenFirstObjectTextAndSecondObjectTextAreNotEqual(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    answerA.setAnswerText("TestA");
    answerB.setAnswerText("TestB");
    assertFalse(answerA.equals(answerB));
}

@Test
public void shouldReturnFalseWhenFirstObjectIdIsNullAndSecondObjectIdIsNotNull(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    answerB.setId(3L);
    assertFalse(answerA.equals(answerB));
}
@Test
public void shouldReturnFalseWhenFirstObjectQuestionIsNullAndSecondObjectQuestionIsNotNull(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    answerB.setQuestion(new QuestionEntity());
    assertFalse(answerA.equals(answerB));
}
@Test
public void shouldReturnFalseWhenFirstObjectTextIsNullAndSecondObjectIsNotNull(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    answerB.setAnswerText("Test");
    assertFalse(answerA.equals(answerB));
}

 @Test
public void shouldReturnTrueWhenTwoObjectsAreEqual(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    assertTrue(answerA.equals(answerB));
}

 
 @Test
public void shouldReturnTrueWhenObjectEqualsObject(){
    AnswerEntity answerA = new AnswerEntity();
    assertTrue(answerA.equals(answerA));
}
@Test
public void shouldReturnTrueWhenFirstObjectTextAndSecondObjectTextAreEqual(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    answerA.setAnswerText("Test");
    answerB.setAnswerText("Test");
    assertTrue(answerA.equals(answerB));
}

@Test
public void shouldReturnTrueWhenTwoObjectsIdAreEqual(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    answerA.setId(2L);
    answerB.setId(2L);
    assertTrue(answerA.equals(answerB));
}
@Test
public void shouldReturnTrueWhenObjectsEqualItself(){
    AnswerEntity answerA = new AnswerEntity();
    assertTrue(answerA.equals(answerA));
}
@Test
public void shouldReturnTrueWhenTwoQuestionEntitiesAreEqual(){
    AnswerEntity answerA = new AnswerEntity();
    AnswerEntity answerB = new AnswerEntity();
    QuestionEntity question = new QuestionEntity();
    question.setId(1L);
    answerA.setQuestion(question);
    answerB.setQuestion(question);
    assertTrue(answerA.equals(answerB));
}
}