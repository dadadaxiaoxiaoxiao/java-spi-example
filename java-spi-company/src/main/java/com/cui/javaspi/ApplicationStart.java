package com.cui.javaspi;
import com.cui.javaspi.service.InternetService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author ：czh
 * @date ：2024/11/8
 */
public class ApplicationStart {
    public static void main(String[] args) {
        ServiceLoader<InternetService> serviceLoader = ServiceLoader.load(InternetService.class);
        for (InternetService internetService : serviceLoader) {
            internetService.connectInternet();
        }

    }
}
