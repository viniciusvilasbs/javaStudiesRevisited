package org.javaCore.designPatterns.domain.factory;

public class PersonFactory {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    private PersonFactory(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonFactory{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static final class PersonFactoryBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        private PersonFactoryBuilder() {
        }

        public static PersonFactoryBuilder builder() {
            return new PersonFactoryBuilder();
        }

        public PersonFactoryBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonFactoryBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonFactoryBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonFactoryBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonFactory build() {
            return new PersonFactory(firstName, lastName, userName, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
