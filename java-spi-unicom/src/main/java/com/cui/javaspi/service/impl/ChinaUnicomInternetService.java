package com.cui.javaspi.service.impl;

import com.cui.javaspi.service.InternetService;

/**
 * @author ：czh
 * @date ：2024/11/8
 */
public class ChinaUnicomInternetService implements InternetService {
    /**
     * 服务功能api
     */
    public void connectInternet() {
        System.out.println("中国联通链接");
    }
}
