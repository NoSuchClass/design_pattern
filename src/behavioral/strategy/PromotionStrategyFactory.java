package behavioral.strategy;

import com.sun.xml.internal.bind.InternalAccessorFactory;

import java.util.HashMap;

public class PromotionStrategyFactory {
    private static HashMap<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    private static PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }
}
