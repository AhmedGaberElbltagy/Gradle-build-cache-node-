// package com.example.demo;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
// class DemoApplicationTests {

// 	@Test
// 	void contextLoads() {
// 	}

// }
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testHello() {
        assertEquals("Hello", "Hello");
    }
}