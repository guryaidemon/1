package univercity;

import java.util.Date;
import java.util.Objects;

public class Olympiad implements Event {
    private String city;
    private Date dateevent;
    private int level;

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
        return "Olympiad{" +
                "city='" + city + '\'' +
                ", dateevent=" + dateevent +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Olympiad olympiad = (Olympiad) o;
        return level == olympiad.level &&
                city.equals(olympiad.city) &&
                dateevent.equals(olympiad.dateevent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, dateevent, level);
    }
}
