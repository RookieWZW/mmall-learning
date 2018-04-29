package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by RookieWangZhiWei on 2018/4/29.
 */
public interface IOrderService {

    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse aliCallback(Map<String, String> params);
    ServerResponse<Boolean> queryOrderPayStatus( Integer userId,Long orderNo);

}
