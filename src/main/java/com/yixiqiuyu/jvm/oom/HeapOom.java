package com.yixiqiuyu.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: OOM示例
 * @VmArgs: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Author: yixiqiuyu
 * @Date: 2022/6/3  20:06
 */

public class HeapOom {

    static class OomObject {

    }
    public static void main(String[] args) {
        List<OomObject> list = new ArrayList<>();
        while (true) {
            list.add(new OomObject());
        }
    }
}
