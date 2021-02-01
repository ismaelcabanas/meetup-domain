package cabanas.garcia.ismael.meetup.meetings.meetingcomment

class Comment(val value: String) {
    init {
        if (value == "") {
            throw CommentRequiredException()
        }
    }
}
