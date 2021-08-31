/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 *
 * @author sith
 */
public class SimpleTest {
    @Test
	public void test() {
                    int firstDigit  = 66;
                    Assert.isTrue(firstDigit > 0, "The value1 must be greater than zero");
                    
                    //int secondDigit = 4;
                    //Assert.isTrue(secondDigit > 10, "The value2 must be greater than zero");
	}
}
