package cabanas.garcia.ismael.meetup.useraccess.application.newRegistration

import cabanas.garcia.ismael.meetup.shared.application.CommandHandler
import cabanas.garcia.ismael.meetup.shared.domain.service.EventBus
import cabanas.garcia.ismael.meetup.useraccess.domain.userregistration.UserRegistrationFactory
import cabanas.garcia.ismael.meetup.useraccess.domain.userregistration.UserRegistrationRepository
import cabanas.garcia.ismael.meetup.useraccess.domain.userregistration.UsersCounter
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CreateUserRegistrationCommandHandler(
    private val userRegistrationRepository: UserRegistrationRepository,
    private val usersCounter: UsersCounter,
    private val eventBus: EventBus
) : CommandHandler<CreateUserRegistrationCommand> {
    private var logger: Logger = LoggerFactory.getLogger(CreateUserRegistrationCommandHandler::class.java)

    override fun handle(command: CreateUserRegistrationCommand) {
        logger.info("New user registration $command")

        val userRegistration = UserRegistrationFactory.registerNewUser(
            command.id,
            command.email,
            command.password,
            command.email,
            command.firstName,
            command.lastName,
            usersCounter
        )

        userRegistrationRepository.save(userRegistration)

        eventBus.publish(userRegistration.events())
    }
}