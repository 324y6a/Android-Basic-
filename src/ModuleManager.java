public class ModuleManager {
    // 默认开启模块
    boolean isModuleEnabled = true;

    public void checkModule() {
        如果(isModuleEnabled) {
            // 模块逻辑
            System.out.println ("模块正在运行...");
        方面
            System.out.println ("模块已关闭");
        }
    }
}
