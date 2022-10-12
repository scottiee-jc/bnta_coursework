package authenticate;

import java.util.Scanner;

public class SecurePassword {
    // Class static final vars
    public static final String HASH_ALGORITHM = "PBKDF2WithHmacSHA256";
    public static final int DERIVED_KEY_LENGTH = 256;
    public static final int NUM_ITERATIONS = 20000;

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
}
