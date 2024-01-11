package technology.cariad.app.competitiveanalysis.reptile.parser;

import technology.cariad.app.competitiveanalysis.reptile.BaseParser;
import technology.cariad.app.competitiveanalysis.service.AppCommentService;
import technology.cariad.app.competitiveanalysis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoParser extends BaseParser {

    @Autowired
    private DemoService demoService;

    @Autowired
    private AppCommentService service;

    @Override
    protected void onParse(String data) {
        demoService.add(data);

    }
}
