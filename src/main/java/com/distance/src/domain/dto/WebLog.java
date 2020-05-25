package com.distance.src.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 缄默
 * @date 2020/05/22
 */
@Data
@NoArgsConstructor
public class WebLog {

    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private Long startTime;

    /**
     * 消耗时间
     */
    private Integer spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * uri
     */
    private String uri;

    /**
     * url
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * ip
     */
    private String ip;

    /**
     * 请求参数
     */
    private Object parameter;

    /**
     * 请求返回的结果
     */
    private Object result;

}
