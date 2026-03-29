公众 班级 AdSkip{
    // 广告跳过开关
    boolean isAdSkipEnabled = true;

    public void onAdShow(int seconds) {
        if (isAdSkipEnabled) {
            // 逻辑：如果开关打开，不管广告倒计时是几秒，统统变成 0 秒
            int jumpTo = 0;
            System.out.println("检测到广告，剩余 " + seconds + " 秒。正在强制跳过...");
            System.out.println("成功！广告已跳至 " + jumpTo + " 秒并自动关闭。");
        } else {
            System.out.println("广告播放中，请等待...");
        }
    }
}
