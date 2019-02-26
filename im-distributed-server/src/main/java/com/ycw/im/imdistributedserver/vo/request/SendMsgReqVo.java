package com.ycw.im.imdistributedserver.vo.request;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;


/**
 * @Author yuchunwei
 */
@Data
public class SendMsgReqVo {

    @ApiModelProperty(required = true, value = "msg", example = "hello")
    private String msg;

    @ApiModelProperty(required = true, value = "userId", example = "11")
    private Long userId;

    @Override
    public String toString() {
        return "SendMsgReqVO{" +
                "msg='" + msg + '\'' +
                ", userId=" + userId +
                "} " + super.toString();
    }
}   
