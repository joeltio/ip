package ipman.ui.javafx;

/**
 * Represents a UI message within a conversation with a chat bot.
 * @param author whose message this belongs to
 * @param message the message content
 */
public record Message(MessageAuthor author, String message) {}
