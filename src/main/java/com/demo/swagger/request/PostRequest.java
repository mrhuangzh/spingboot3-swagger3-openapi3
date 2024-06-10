package com.demo.swagger.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author: huangzh
 * @Date: 2024/2/20 11:17
 **/
@Schema(title = "请求参数", description = "请求参数体")
@Data
public class PostRequest {
    @Schema(title = "姓名", description = "name姓名")
    private String name;
    @Schema(title = "签名", description = "x_sign签名")
    private String x_sign;
}
