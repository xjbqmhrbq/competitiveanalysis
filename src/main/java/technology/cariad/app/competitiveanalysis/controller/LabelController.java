package technology.cariad.app.competitiveanalysis.controller;

import technology.cariad.app.competitiveanalysis.core.Result;
import technology.cariad.app.competitiveanalysis.core.entity.Label;
import technology.cariad.app.competitiveanalysis.service.LabelService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @PostMapping("/add")
    public Result<Label> add(@RequestBody Label label) {
        if (label == null) {
            return Result.errorWithNull("label");
        }
        return Result.success(labelService.add(label));
    }

    @PostMapping("/update")
    public Result<Label> update(Label label) {
        if (label == null) {
            return Result.errorWithNull("label");
        }
        return Result.success(labelService.update(label));
    }

    @PostMapping("/remove")
    public Result<Boolean> remove(@RequestBody Integer id) {
        if (id == null) {
            return Result.errorWithNull("id");
        }
        return Result.success(labelService.removeById(id));
    }

    @GetMapping("/findById")
    public Result<Label> findById(@RequestParam("id") Integer id) {
        if (id == null) {
            return Result.errorWithNull("id");
        }
        return Result.success(labelService.getById(id));
    }

    @GetMapping("/searchByName")
    public Result<List<Label>> searchByName(@RequestParam("name") String name) {
        if (StringUtils.isBlank(name)) {
            return Result.errorWithNull("name");
        }
        return Result.success(labelService.searchByName(name));
    }

    @GetMapping("/list")
    public Result<List<Label>> list() {
        return Result.success(labelService.list());
    }

}
