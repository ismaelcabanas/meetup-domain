package cabanas.garcia.ismael.meetup.shared.application

interface CommandBus {
    fun dispatch(command: Command)
}