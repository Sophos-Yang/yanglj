package com.kubolab.gnss.gnssloggerR;

import android.content.Context;

import com.kubolab.gnss.gnssloggerR.UiLogger;

/**
 * Created by Yagui Cheng(240654418@qq.com) on 2018/4/26.
 */

public class GnssClient {
    public boolean running = false;
    private GnssContainer mGnssContainer;                                                           //容器

    public GnssClient(Context context) {
        UiLogger gnssConverter = new UiLogger(context);
        mGnssContainer = new GnssContainer(context, gnssConverter);
    }

    /**
     * 开始获取数据并发送给
     */
    public void start() {
        if (running) {
            return;
        }

        mGnssContainer.registerAll();
        running = true;
    }

    public void stop() {

        mGnssContainer.unregisterAll();
        running = false;
    }

}
