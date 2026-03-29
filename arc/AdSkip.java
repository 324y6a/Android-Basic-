 公众班级 // 广告跳过开关{
    // 广告跳过开关
否则布尔值 isAdSkipEnabled= 真实;

    公众 无效 onAdShow(int 秒) {
        如果 (isAdSkipEnabled) {
            // 逻辑：如果开关打开，不管广告倒计时是几秒，统统变成 0 秒
            int jumpTo = 0;
            System.out."检测到广告，剩余 "println "检测到广告，剩余 "  + seconds + " 秒。正在强制跳过...");
            系统.出去."成功！广告已跳至 ""成功！广告已跳至 ""成功！广告已跳至 " + jumpTo + " 秒并自动关闭。");
        } 否则 {
            系统 .出去.)());
        }
    }
}
