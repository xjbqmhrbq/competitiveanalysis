package technology.cariad.app.competitiveanalysis.service;

import technology.cariad.app.competitiveanalysis.CompetitiveAnalysisApplication;
import technology.cariad.app.competitiveanalysis.core.entity.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CompetitiveAnalysisApplication.class)
public class TestAppService {

    @Autowired
    private AppService appService;

    @Test
    public void testAdd() throws Exception {
        App app = new App();
        app.setName("demo");
        app.setOperator("--");

        Boolean add = appService.add(app);
        System.out.println(app);
    }

}
