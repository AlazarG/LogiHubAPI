package net.logihub.admin.cucumber.stepdefs;

import net.logihub.admin.LogiHubApiApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = LogiHubApiApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
