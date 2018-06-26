package infiniteskills.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "time_test")
@Access(AccessType.FIELD)
public class Time {
    @Id
    @GeneratedValue
    @Column(name = "TIME_TEST_ID")
    private Long timeTestId;

    @Temporal(value = TemporalType.DATE)
    private Date datetimeColumn;
    @Temporal(value = TemporalType.DATE)
    private Date timestampColumn;
    @Temporal(value = TemporalType.DATE)
    private Date dateColumn;
    @Temporal(value = TemporalType.TIME)
    private Date timeColumn;
    @Temporal(value = TemporalType.TIME)
    private Timestamp sqlDatetimeColumn;
    @Temporal(value = TemporalType.TIME)
    private Timestamp sqlTimestampColumn;
    private java.sql.Date sqlDateColumn;
    private java.sql.Time sqlTimeColumn;
}
