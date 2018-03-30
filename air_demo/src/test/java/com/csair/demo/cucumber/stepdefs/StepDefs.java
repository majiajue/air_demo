package com.csair.demo.cucumber.stepdefs;

import com.csair.demo.AirApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AirApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
