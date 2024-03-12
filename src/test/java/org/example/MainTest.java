package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
   public void isMinLength_shouldReturnTrue(){
        //GIVEN
        String password = "n5idn3uDFUI";
        //WHEN
        boolean actual = Main.isMinLength(password);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    public void isMinLength_shouldReturnFalse(){
        //GIVEN
        String password = "n5idn3";

        //WHEN
        boolean actual = Main.isMinLength(password);
        //THEN
        Assertions.assertFalse(actual);
    }
    @Test
    public void hasDot_shouldReturnTrue(){
        //GIVEN
        String password = "n5idn.3uDFUI";
        //WHEN
        boolean actual = Main.hasDot(password);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    public void hasDot_shouldReturnFalse(){
        //GIVEN
        String password = "n5idn3uDFUI";

        //WHEN
        boolean actual = Main.hasDot(password);
        //THEN
        Assertions.assertFalse(actual);
    }
    @Test
    public void hasUpperAndLower_shouldReturnTrue(){
        //GIVEN
        String password = "n5idn3uDFUI";

        //WHEN
        boolean actual = Main.hasUpperAndLower(password);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    public void hasUpperAndLower_shouldReturnFalse(){
        //GIVEN
        String password = "n5idn3uergre";

        //WHEN
        boolean actual = Main.hasUpperAndLower(password);
        //THEN
        Assertions.assertFalse(actual);
    }
    @Test
    public void hasCommonPassword_shouldReturnTrue(){
        //GIVEN
        String password = "Password";

        //WHEN
        boolean actual = Main.hasCommonPassword(password);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    public void hasCommonPassword_shouldReturnfalse(){
        //GIVEN
        String password = "bfhijdhds783";

        //WHEN
        boolean actual = Main.hasCommonPassword(password);
        //THEN
        Assertions.assertFalse(actual);
    }
    @Test
    public void hasspecialCharacters_shouldReturnTrue(){
        //GIVEN
        String password = "bfhijdhd!s783";

        //WHEN
        boolean actual = Main.hasspecialCharacters(password);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    public void hasspecialCharacters_shouldReturnFalse(){
        //GIVEN
        String password = "bfhijdhds783";

        //WHEN
        boolean actual = Main.hasspecialCharacters(password);
        //THEN
        Assertions.assertFalse(actual);
    }


}