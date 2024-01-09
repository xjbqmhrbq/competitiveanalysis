package com.gausscode.competitiveanalysis.reptile.impl;

import com.gausscode.competitiveanalysis.core.ApiResponse;
import com.gausscode.competitiveanalysis.core.entity.ReptileType;
import com.gausscode.competitiveanalysis.core.entity.req.ReptileInfo;
import com.gausscode.competitiveanalysis.core.reptile.Dispatcher;
import com.gausscode.competitiveanalysis.core.reptile.IParser;
import com.gausscode.competitiveanalysis.reptile.ReptileController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/reptile")
@RestController
public class ReptileControllerImpl implements ReptileController {


    @PostMapping("/upload")
    @Override
    public ApiResponse<Boolean> upload(@RequestBody ReptileInfo info) {
        if (info == null) {
            return ApiResponse.errorWithNull();
        }
        String type = info.getType();
        String data = info.getData();
        boolean dispatch = Dispatcher.dispatch(type, data);
        return ApiResponse.success(dispatch);
    }
}
