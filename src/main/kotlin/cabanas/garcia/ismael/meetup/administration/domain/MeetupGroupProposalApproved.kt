package cabanas.garcia.ismael.meetup.administration.domain

import cabanas.garcia.ismael.meetup.shared.domain.DomainEvent
import java.time.Instant

data class MeetupGroupProposalApproved(
    val meetupGroupProposalId: String,
    val proposalId: String,
    val approveDate: Instant
) : DomainEvent