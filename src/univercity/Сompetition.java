package univercity;

import java.util.Date;
import java.util.Objects;

public class Сompetition implements Event {
    private String city;
    private Date dateevent;
    private float sum = 0;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Date getDateevent() {
        return dateevent;
    }

    @Override
    public void setDateevent(Date dateevent) {
        this.dateevent = dateevent;
    }

    @Override
    public String toString() {
        return "Сompetition{" +
                "city='" + city + '\'' +
                ", dateevent=" + dateevent +
                ", sum=" + sum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Сompetition that = (Сompetition) o;
        return Float.compare(that.sum, sum) == 0 &&
                city.equals(that.city) &&
                dateevent.equals(that.dateevent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, dateevent, sum);
    }
}
