package cabanas.garcia.ismael.meetup.meetings.domain.meeting.events

import cabanas.garcia.ismael.meetup.shared.domain.DomainEvent
import java.time.Instant

data class MeetingCanceled(
    val meetingId: String,
    val cancelMemberId: String,
    val cancelDate: Instant
) : DomainEvent