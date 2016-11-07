package com.max.tang.demokiller.utils;

import com.max.tang.demokiller.activity.DemoDataBindingActivity;
import com.max.tang.demokiller.activity.LoginActivity;
import com.max.tang.demokiller.activity.RxActivity;
import com.max.tang.demokiller.activity.WatchActivity;
import com.max.tang.demokiller.model.DemoEntity;

import java.util.ArrayList;
import java.util.List;

/**
 */

public class DataLoader {
    private static DataLoader mLoder;

    public static DataLoader getInstance() {
        if (mLoder == null) {
            mLoder = new DataLoader();
        }
        return mLoder;
    }

    //获取本地测试的Activity列表
    public List<DemoEntity> getTestList() {
        List<DemoEntity> list = new ArrayList<>();
        list.add(new DemoEntity("Login Demo", LoginActivity.class));
        list.add(new DemoEntity("Watch Activity", WatchActivity.class));
        list.add(new DemoEntity("Data Binding", DemoDataBindingActivity.class));
        list.add(new DemoEntity("Rx Demo", RxActivity.class));
        return list;
    }
}