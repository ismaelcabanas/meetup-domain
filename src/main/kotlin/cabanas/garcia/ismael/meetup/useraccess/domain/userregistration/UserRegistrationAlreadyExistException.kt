package cabanas.garcia.ismael.meetup.useraccess.domain.userregistration

import java.lang.Exception

class UserRegistrationAlreadyExistException(login: String)
: Exception("$login has already registered.") {
}