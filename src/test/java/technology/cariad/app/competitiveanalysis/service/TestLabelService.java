package technology.cariad.app.competitiveanalysis.service;

import technology.cariad.app.competitiveanalysis.CompetitiveAnalysisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CompetitiveAnalysisApplication.class)
public class TestLabelService {

    @Autowired
    private LabelService labelService;

    @Test
    public void testAdd() throws Exception {

    }

}
