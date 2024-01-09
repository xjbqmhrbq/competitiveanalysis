package technology.cariad.app.competitiveanalysis.service.impl;

import technology.cariad.app.competitiveanalysis.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void add(String data) {
        System.out.println("DemoService add:" + data);
    }
}
