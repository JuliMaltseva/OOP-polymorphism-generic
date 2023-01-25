package transport;

public class ValidateParameters {
    public static String validateString(String value, String defaultValue) {
        return (value == null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }

    public static String validateTransportParameters(String value) {
        return validateString(value, "default");
    }
}
