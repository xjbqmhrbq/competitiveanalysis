package technology.cariad.app.competitiveanalysis.service;

import technology.cariad.app.competitiveanalysis.CompetitiveAnalysisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import technology.cariad.app.competitiveanalysis.core.entity.Label;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CompetitiveAnalysisApplication.class)
public class TestLabelService {

    @Autowired
    private LabelService labelService;

    @Test
    public void testAdd() throws Exception {
        Label label = new Label();
        label.setName("首页3");
        labelService.add(label);
        System.out.println("label:" + label);
        Label label1 = labelService.getById(label.getId());
        System.out.println("label1:" + label1);
        Boolean remove = labelService.remove(label1.getId());
        System.out.println("remove:" + remove);
    }

}
