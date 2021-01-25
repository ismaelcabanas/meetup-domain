package cabanas.garcia.ismael.meetup.useraccess.user

import cabanas.garcia.ismael.meetup.useraccess.userregistration.DomainEvent

object UserFactory {
    fun createUserFromUserRegistration(
        userId: String,
        login: String,
        password: String,
        email: String,
        firstName: String,
        lastName: String
    ): User =
        User(
            userId,
            login,
            password,
            email,
            firstName,
            lastName,
            mutableListOf<DomainEvent>(UserCreated(userId, login, email, firstName, lastName)))
}