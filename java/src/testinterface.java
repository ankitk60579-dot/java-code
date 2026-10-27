interface Gmail {
    public abstract void name();
    public void password();
    public void Zipcode();
}

interface Sharda {
    abstract int systemId();
    String studentname();
}

class UserMail implements Gmail, Sharda {

    @Override
    public int systemId() {
        return 2025251518;
    }

    @Override
    public String studentname() {
        return "Ankit Kumar";
    }

    @Override
    public void name() {
        System.out.println("Gmail Name: ankitk60579@gmail.com");
    }

    @Override
    public void password() {
        System.out.println("Password: ankit2006");
    }

    @Override
    public void Zipcode() {
        System.out.println("Zipcode: 847203");
    }
}

public class testinterface {

    public static void main(String[] args) {

        UserMail hi = new UserMail();

        System.out.println("Student Details:----");
        System.out.println("Student Name: " + hi.studentname());
        System.out.println("System ID: " + hi.systemId());

        hi.name();
        hi.password();
        hi.Zipcode();
    }
}