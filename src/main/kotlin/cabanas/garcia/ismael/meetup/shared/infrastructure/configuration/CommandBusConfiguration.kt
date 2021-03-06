package cabanas.garcia.ismael.meetup.shared.infrastructure.configuration

import cabanas.garcia.ismael.meetup.meetings.application.createmeetinggroupproposal.CreateMeetingGroupProposalCommandHandler
import cabanas.garcia.ismael.meetup.shared.application.CommandBus
import cabanas.garcia.ismael.meetup.shared.application.InMemoryCommandBus
import cabanas.garcia.ismael.meetup.shared.domain.service.EventBus
import cabanas.garcia.ismael.meetup.useraccess.application.authentication.AuthenticateUserCommandHandler
import cabanas.garcia.ismael.meetup.useraccess.application.createuser.CreateUserByUserRegistrationCommandHandler
import cabanas.garcia.ismael.meetup.useraccess.domain.userregistration.UserRegistrationRepository
import cabanas.garcia.ismael.meetup.useraccess.domain.userregistration.UsersCounter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CommandBusConfiguration {
    @Bean
    fun dummyCommandBus(
        userRegistrationRepository: UserRegistrationRepository,
        usersCounter: UsersCounter,
        eventBus: EventBus,
        authenticateUserCommandHandler: AuthenticateUserCommandHandler,
        createUserByUserRegistrationCommandHandler: CreateUserByUserRegistrationCommandHandler,
        createMeetingGroupProposalCommandHandler: CreateMeetingGroupProposalCommandHandler
    ): CommandBus = InMemoryCommandBus(
        userRegistrationRepository,
        usersCounter,
        eventBus,
        authenticateUserCommandHandler,
        createUserByUserRegistrationCommandHandler,
        createMeetingGroupProposalCommandHandler
    )
}