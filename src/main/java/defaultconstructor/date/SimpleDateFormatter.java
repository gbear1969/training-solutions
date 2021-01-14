package defaultconstructor.date;

import java.time.LocalDate;

public class SimpleDateFormatter {
    private CountryCode cC;

    public SimpleDateFormatter() {
        this.cC = CountryCode.HU;
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        switch (countryCode) {
            case EN:
                return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
            case US:
                return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
            default:
                return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
        }
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(cC, simpleDate);
    }

}
