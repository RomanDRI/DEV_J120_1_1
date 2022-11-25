package TelephoneNumber;

import java.util.Objects;

public class Number {
    String regionCode;
    String telephoneNumber;

    public Number(String regionCode, String telephoneNumber) {
        setRegionCode(regionCode);
        setTelephoneNumber(telephoneNumber);
    }


    public void setRegionCode(String regionCode) {
        if (regionCode!=null) this.regionCode = regionCode;
        else throw new IllegalArgumentException("Введите код региона");
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber!=null) this.telephoneNumber = telephoneNumber;
        else throw new IllegalArgumentException("Введите телефонный номер");
    }


    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (!(a instanceof Number)) return false;
        Number number = (Number) a;
        return regionCode == number.regionCode && telephoneNumber == number.telephoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCode,telephoneNumber);
    }

    @Override
    public String toString() {
        StringBuilder builderToString = new StringBuilder();
        builderToString.insert(0,"(").append(regionCode).append(")");
        int a = telephoneNumber.length() % 2+2;
        if (a < telephoneNumber.length()) {
            builderToString.append(telephoneNumber, 0, a);
            while (a <= (telephoneNumber.length() - 2)) {
                builderToString.append('-').append(telephoneNumber, a, a + 2);
                a += 2;
            }
        } else {
            builderToString.append(telephoneNumber);
        }
        return builderToString.toString();


    }
}
