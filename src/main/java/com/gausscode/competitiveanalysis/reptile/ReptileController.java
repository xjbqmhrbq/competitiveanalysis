package com.gausscode.competitiveanalysis.reptile;

import com.gausscode.competitiveanalysis.core.ApiResponse;
import com.gausscode.competitiveanalysis.core.entity.req.ReptileInfo;

public interface ReptileController {

    ApiResponse<Boolean> upload(ReptileInfo info);

}
