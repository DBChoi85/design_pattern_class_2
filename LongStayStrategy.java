import java.math.BigDecimal;
import java.math.RoundingMode;

public final class LongStayStrategy implements PricingStrategy {
    private final int threshold;
    private final BigDecimal extraDiscount; // 0.10 = 10% 할인

    public LongStayStrategy(int threshold, BigDecimal extraDiscount) {
        this.threshold = threshold;
        this.extraDiscount = extraDiscount;
    }

    @Override
    public BigDecimal quote(Booking b) {
        // TODO:
        // 1. base = 기본요금 × 박수
        // 2. 만약 박수가 threshold 이상이면 base에 (1 - extraDiscount) 곱하기
        return null; // 학생이 직접 구현
    }
}
