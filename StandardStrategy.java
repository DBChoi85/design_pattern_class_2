import java.math.BigDecimal;

public final class StandardStrategy implements PricingStrategy {
    @Override
    public BigDecimal quote(Booking b) {
        // TODO: 기본요금 = 방 기본요금 × 숙박박수
        return null; // 학생이 직접 구현
    }
}
