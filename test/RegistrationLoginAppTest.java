/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class RegistrationLoginAppTest {
    
    public RegistrationLoginAppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
        Login loginSystem = new Login();
        
        @Test
        public void testUsernameCorrectly(){
            assertTrue(loginSystem.checkUsername("lind_"));
            }
    
        @Test
        public void testUsernameIncorrectlyFormatted(){
            assertFalse(loginSystem.checkUsername("lindo!!!!!!!"));
        }
        
        @Test
        public void testPasswordMeetComplexity(){
            assertTrue(loginSystem.checkPasswordComplexity("The&&lma@li99!"));
        }
        @Test
        public void testPasswordComplexityFailure(){
            assertFalse(loginSystem.checkPasswordComplexity("password"));
        }
          
        @Test
        public void testCellPhoneCorrectlyFormatted(){
             assertTrue(loginSystem.checkCellPhoneNumber("+27725693656"));
        }

        @Test
        public void testCellPhoneInorrectlyFormatted(){
             assertFalse(loginSystem.checkCellPhoneNumber("0725693656"));
        }

        }

