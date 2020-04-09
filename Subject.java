package School;

public class Subject implements ISubject {


    public Subject(ESubject subject) {

        this.subject = subject;
    }
    private ESubject subject;
    @Override
    public ESubject getName() {
        return subject;
    }
}
