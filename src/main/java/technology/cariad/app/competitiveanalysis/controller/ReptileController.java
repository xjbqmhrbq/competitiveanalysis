package technology.cariad.app.competitiveanalysis.controller;

import technology.cariad.app.competitiveanalysis.core.Result;
import technology.cariad.app.competitiveanalysis.core.entity.req.ReptileInfo;
import technology.cariad.app.competitiveanalysis.reptile.Dispatcher;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/reptile")
@RestController
public class ReptileController {

    @PostMapping("/upload")
    public Result<Boolean> upload(@RequestBody ReptileInfo info) {
        if (info == null) {
            return Result.errorWithNull("ReptileInfo");
        }
        String type = info.getType();
        if (StringUtils.isBlank(type)) {
            return Result.errorWithNull("type");
        }
        String data = info.getData();
        if (StringUtils.isBlank(data)) {
            return Result.errorWithNull("data");
        }
        boolean dispatch = Dispatcher.dispatch(type, data);
        return Result.success(dispatch);
    }
}
