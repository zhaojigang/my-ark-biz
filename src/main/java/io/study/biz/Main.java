package io.study.biz;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import io.study.plugin.ArkPlugin1Service;
import io.study.plugin.ArkPlugin2Service;

public class Main {
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
        new ArkPlugin1Service().test();
        new ArkPlugin2Service().test();
    }
}
