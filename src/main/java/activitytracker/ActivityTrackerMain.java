package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useunicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(LocalDateTime.of(2021,2,23,10,22), "Biking in Bakony", ActivityType.BIKING));
        activities.add(new Activity(LocalDateTime.of(2021,2,23,10,22), "Biking in Bakony", ActivityType.HIKING));
        activities.add(new Activity(LocalDateTime.of(2021,2,23,10,22), "Biking in Bakony", ActivityType.RUNNING));


        ActivityDao activityDao = new ActivityDao(dataSource);
        for (Activity activity: activities) {
            activityDao.insertActivity(activity);
        }
        System.out.println(activityDao.selectActivityById(2));
        System.out.println(activityDao.selectAllActivities());

    }

}
