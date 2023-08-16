package org.javaCore.designPatterns.domain.builder;

public class PersonBuild {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    private PersonBuild(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonBuild{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static final class PersonBuildBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        public PersonBuildBuilder() {
        }

        public PersonBuildBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuildBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuildBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuildBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuild build() {
            return new PersonBuild(firstName, lastName, userName, email);
        }
    }

//    handmade:
    /*public static class PersonBuild {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        public PersonBuild firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuild lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuild userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuild email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder build() {
            return new PersonBuilder(firstName, lastName, userName, email);
        }
    }*/
}
