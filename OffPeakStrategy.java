import java.math.BigDecimal;

public final class OffPeakStrategy implements PricingStrategy {
    private final BigDecimal offMultiplier;

    public OffPeakStrategy(BigDecimal offMultiplier) {
        this.offMultiplier = offMultiplier; // 예: 0.95 (5% 할인)
    }

    @Override
    public BigDecimal quote(Booking b) {
        // TODO: 기본요금 × offMultiplier × 박수
        return null; // 학생이 직접 구현
    }
}
