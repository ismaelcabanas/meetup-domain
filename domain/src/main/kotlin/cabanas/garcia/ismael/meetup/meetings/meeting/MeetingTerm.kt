package cabanas.garcia.ismael.meetup.meetings.meeting

import java.time.Instant

data class MeetingTerm(val startDate: Instant, val endDate: Instant) {
    fun isAfterStart(date: Instant): Boolean = date.isAfter(startDate)
}
