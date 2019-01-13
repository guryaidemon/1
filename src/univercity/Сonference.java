package univercity;

import java.util.Date;
import java.util.Objects;

public class Сonference implements Event {
    private String city;
    private Date dateevent;
    private String statya;

    public String getStatya() {
        return statya;
    }

    public void setStatya(String statya) {
        this.statya = statya;
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
        return "Сonference{" +
                "city='" + city + '\'' +
                ", dateevent=" + dateevent +
                ", statya='" + statya + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Сonference that = (Сonference) o;
        return city.equals(that.city) &&
                dateevent.equals(that.dateevent) &&
                statya.equals(that.statya);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, dateevent, statya);
    }
}
