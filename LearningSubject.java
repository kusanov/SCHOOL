package School;

public class LearningSubject {

    public ESubject subject;
    public Double value;

    public LearningSubject(ESubject subject, Double value) {
        this.subject = subject;
        this.value = value;
    }

    public ESubject getSubject() {
        return subject;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
