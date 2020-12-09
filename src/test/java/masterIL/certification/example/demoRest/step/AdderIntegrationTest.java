package masterIL.certification.example.demoRest.step;

import masterIL.certification.example.demoRest.controller.AdderController;
import masterIL.certification.example.demoRest.service.AdderService;
import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.SerenityStory;
import org.jbehave.core.annotations.BeforeStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        AdderController.class, AdderService.class })
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AdderIntegrationTest extends SerenityStories {

}
