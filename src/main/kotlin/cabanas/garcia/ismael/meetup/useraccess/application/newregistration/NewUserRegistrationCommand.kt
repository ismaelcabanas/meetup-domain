package cabanas.garcia.ismael.meetup.useraccess.application.newregistration

import cabanas.garcia.ismael.meetup.shared.application.Command

data class NewUserRegistrationCommand(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String
): Command
