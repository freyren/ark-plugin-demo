package com.stori.toyservice;
import com.alipay.sofa.runtime.api.annotation.SofaService;


@SofaService(uniqueId = "annotationImpl")
public class ToyServiceImpl implements ToyService {
    private String name;
    public ToyServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public String sayHi() {
        return "Hello " + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
