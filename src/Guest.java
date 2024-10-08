import java.time.LocalDate;

public class Guest {
    private String name;
    private String lastName;
    private LocalDate birthdate;

    public Guest(String name, String lastName, LocalDate birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}

