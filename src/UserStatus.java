public class UserStatus {
    // 模拟服务器返回的会员状态 (0 是普通人，1 是尊贵会员)
    int serverStatus = 0; 
    
    // 我们的插件逻辑开关
    boolean forcePremium = true;

    public boolean isVip() {
        if (forcePremium) {
            // 逻辑：管它服务器返回什么，我们这里永远返回 true（是会员）
            System.out.println("插件运行中：已强制激活会员权益！");
            return true; 
        } else {
            // 没开插件就按实际情况来
            return serverStatus == 1;
        }
    }
}
