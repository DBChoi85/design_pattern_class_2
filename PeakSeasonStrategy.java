import java.math.BigDecimal;
import java.math.RoundingMode;

public final class PeakSeasonStrategy implements PricingStrategy {
    private final BigDecimal peakMultiplier;

    public PeakSeasonStrategy(BigDecimal peakMultiplier) {
        this.peakMultiplier = peakMultiplier; // 예: 1.35 (35% 가산)
    }

    @Override
    public BigDecimal quote(Booking b) {
        // TODO: 기본요금 × peakMultiplier × 박수
        return null; // 학생이 직접 구현
    }
}
