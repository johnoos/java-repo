package com.joosthuizen.finApps.testsuite;

//packages starting with org.junit.jupiter are part of JUnit5
//package starting with org.junit are part of JUnit4

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.platform.suite.api.SelectPackages;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTimeout;
//import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
//import static org.junit.jupiter.api.Assertions.assertTrue;

//import static java.time.Duration.ofMillis;
//import static java.time.Duration.ofMinutes;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suite")
@SelectPackages({"com.joosthuizen.finApps.stdTestClasses"})
public class TestSuite {
}
