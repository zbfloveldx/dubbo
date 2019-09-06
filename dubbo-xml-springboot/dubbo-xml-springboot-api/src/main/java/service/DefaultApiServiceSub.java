package service;

public class DefaultApiServiceSub implements DefaultApiService {

    private final DefaultApiService defaultApiService;

    public DefaultApiServiceSub(DefaultApiService defaultApiService) {
        this.defaultApiService = defaultApiService;
    }

    public String defaultMethod(String str) {
        System.out.println("本地存根" + str);
        return defaultApiService.defaultMethod(str);
    }

}
