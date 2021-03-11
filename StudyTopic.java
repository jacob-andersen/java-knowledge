import java.util.Date;

public class StudyTopic {
    private static int Id;
    private static String Topic;
    private static Date Studydate;

    public StudyTopic(int Id, String Topic, Date Studydate) {
        this.Id = Id;
        this.Topic = Topic;
        this.Studydate = Studydate;
    }

    public static int getId() {
        return Id;
    }

    public static void setId(int id) {
        Id = id;
    }

    public static String getTopic() {
        return Topic;
    }

    public static void setTopic(String topic) {
        Topic = topic;
    }

    public static Date getStudydate() {
        return Studydate;
    }

    public static void setStudydate(Date studydate) {
        Studydate = studydate;
    }

}