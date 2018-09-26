package com.lvdao.sail.lvdao.data.source;

/**
 * Created by Zheng on 2018/9/26.
 */

public interface HttpDataSource {

    void doLogin();

    void doRegister();

    void getVerificationCode();

    void findPassword();

    void getHomePageContent();

}
