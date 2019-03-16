package week_2.observer.specs;

public class Notification {

    private NotificationType notificationType;
    private String header;
    private String body;

    public Notification(NotificationType notificationType, String header, String body) {
        this.notificationType = notificationType;
        this.header = header;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.join(
                System.getProperty("line.separator"),
                String.format("[%s]", this.notificationType.toString().toUpperCase()),
                String.format("\"%s\"", Notification.toTitleCase(this.header)));
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }
}
