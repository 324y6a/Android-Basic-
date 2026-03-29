public class VideoHelper {
    // 无水印保存开关
    boolean noWatermark = true;

    public void downloadVideo(String videoUrl) {
        if (noWatermark) {
            // 逻辑：如果开启了无水印，就在下载地址里把 "watermark" 替换为空
            String cleanUrl = videoUrl.replace("watermark=1", "watermark=0");
            System.out.println("正在从无水印地址下载: " + cleanUrl);
        } else {
            System.out.println("正在普通下载: " + videoUrl);
        }
    }
}
