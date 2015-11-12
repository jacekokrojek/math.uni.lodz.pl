package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    
    @Test
   public void TrueIfComparingObjectWithItself(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	assertTrue(answerEntity1.equals(answerEntity1));
   }
   
	@Test
   public void FalseIfFirstObjectQuestionIsDifferentFromSecondObjectQuestion(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	AnswerEntity answerEntity2 = new AnswerEntity();
   	QuestionEntity questionEntity1 = new QuestionEntity();
   	QuestionEntity questionEntity2 = new QuestionEntity();
   	questionEntity1.setId(10L);
   	questionEntity2.setId(20L);
   	answerEntity1.setQuestion(questionEntity1);
      	answerEntity2.setQuestion(questionEntity2);
   	assertFalse(answerEntity1.equals(answerEntity2));
   }

   @Test
   public void FalseIfFirstObjectAnswerIsNullAndSecondObjectAnswerIsNotNull(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	AnswerEntity answerEntity2 = new AnswerEntity();
   	answerEntity2.setAnswerText("textY");
   	assertFalse(answerEntity1.equals(answerEntity2));
   }
   
   @Test
   public void FalseIfFirstObjectAnswerIsDifferentFromSecondObjectAnswer(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	AnswerEntity answerEntity2 = new AnswerEntity();
   	answerEntity1.setAnswerText("textZ");
   	answerEntity2.setAnswerText("textY");
   	assertFalse(answerEntity1.equals(answerEntity2));
   }
   
   @Test
   public void FalseIfFirstObjectIdIsNullAndSecondObjectIdIsNotNull(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	AnswerEntity answerEntity2 = new AnswerEntity();
   	answerEntity2.setId(20L);
   	assertFalse(answerEntity1.equals(answerEntity2));
   }
   
	@Test
   public void TrueIfFirstObjectAndSecondObjectIsEqual(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	AnswerEntity answerEntity2 = new AnswerEntity(); 
   	assertTrue(answerEntity1.equals(answerEntity2));
   } 	

   @Test
   public void FalseIfFirstObjectIdIsDifferentFromSecondObjectId(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	AnswerEntity answerEntity2 = new AnswerEntity();
   	answerEntity1.setId(20L);
   	answerEntity2.setId(10L);
   	assertFalse(answerEntity1.equals(answerEntity2));
   }
   
   @Test
   public void FalseIfFirstObjectQuestionIsNullAndSecondObjectQuestionIsNotNull(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	AnswerEntity answerEntity2 = new AnswerEntity();
   	answerEntity2.setQuestion(new QuestionEntity()); 
   	assertFalse(answerEntity1.equals(answerEntity2));
   }
   
   @Test
   public void FalseIfFirstObjectClassIsNotEqualSecondObjectClass(){
   	AnswerEntity answerEntity1 = new AnswerEntity();
   	QuestionEntity questionEntity1 = new QuestionEntity();
   	assertFalse(answerEntity1.equals(questionEntity1));
   }
    
}
