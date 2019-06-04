package behavioral.strategy;

public class Test {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();

        // 实战结合工厂模式和策略模式消除if-else
//        PromotionActivity promotionActivity;
        String promotionKey = "MANJIAN";
//        if ("Lijian".equalsIgnoreCase(promotionKey)){
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        }else if ("manjian".equalsIgnoreCase(promotionKey)){
//            promotionActivity = new PromotionActivity(new ManJianPromotionStrategy());
//        }else {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }
//        promotionActivity.executePromotionStrategy();
        PromotionStrategy strategy = PromotionStrategyFactory.getStrategy(promotionKey);
        PromotionActivity promotionActivity = new PromotionActivity(strategy);
        promotionActivity.executePromotionStrategy();
    }
}
