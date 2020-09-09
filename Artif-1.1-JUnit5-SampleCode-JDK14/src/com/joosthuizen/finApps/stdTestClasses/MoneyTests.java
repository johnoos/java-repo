package com.joosthuizen.finApps.stdTestClasses;

// packages starting with org.junit.jupiter are part of JUnit5
// package starting with org.junit are part of JUnit4

//import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.jupiter.api.DisplayName;

//import org.junit.platform.suite.api.SelectPackages;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTimeout;
//import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static java.time.Duration.ofMillis;
//import static java.time.Duration.ofMinutes;

import com.joosthuizen.finApps.Money;

@DisplayName("MoneyTests")
class MoneyTests {

    private Money mCHF12; 
	private Money mCHF14; 
	
	// Init methods

    @BeforeAll 
    static void init() { 
      
    }
    @BeforeEach
    void initAll() {
    	mCHF12 = new Money("CHF", 12.0); 
        mCHF14 = new Money("CHF", 14.0);
    }
    
    // Typically, multiple @Test methods go here 
    // - annotate each with @DisplayName and @Test
    @DisplayName("Tests adding two Money objects")
    @Test 
    void simpleAdd() {
    	Money mResult = new Money();
    	try {
    		mResult= mCHF12.add(mCHF14);
    	} catch (Exception e) {
    		assertTrue(false, "Currencies need to be the same");
    	}
    	Money mExpected = new Money("CHF", 26.0);
    	
        assertTrue(mResult.equals(mExpected), "mResult.equals(mExpected) is false");
    }
    
    // The @AfterEach, @AfterAll etc methods go here (consider using
    // inherited methods. For valid annotations, see 
    // https://junit.org/junit5/docs/current/user-guide/#writing-tests
    
    @AfterEach
    void tearDown() {
    }
    
    @AfterAll
    static void tearDownAll() {
    }
}