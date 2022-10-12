package authenticate;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.rmi.ConnectIOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.*;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.util.Base64;

public class PopulateSuiDB {

    public static final int SALT_BYTE_SIZE = 8;
    public static final String HASH_ALGORITHM = "PBKDF2WithHmacSHA256";
    public static final int DERIVED_KEY_LENGTH = 256;
    public static final int NUM_ITERATIONS = 20000;

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.postgresql.jdbc.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/employeesdb";

    // Database credentials
    static final String USERNAME = "root";
    static final String PASSWORD = "sui";

    /*
     * Generates a base64 encoded string from random byte sequence of a user-specified length
     * @param n Size of salt in bytes
     * @return String Base64-encoded salt value
     * */

    private static String generateSalt(int n) {
        byte[] bytes = null;
        // Instantiate SecureRandom class
        SecureRandom random = new SecureRandom();
        //Create a new byte array of length n
        bytes = new byte[n];
        // Populate the array with random bytes
        random.nextBytes(bytes);
        // Base-64 encode the salt byte array
        return encodeToBase64(bytes);
    }

    // ENCODES TO A BYTE ARRAY TO BYTE 64 STRING
    private static String encodeToBase64(byte[] bytes) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.withoutPadding().encodeToString(bytes);
    }

    // DECODES A BYTE ARRAY TO BASE 64 STRING
    private static byte[] decodeFromBase64(String base64String) {
        Base64.Decoder decoder = Base64.getDecoder();
        return decoder.decode(base64String);
    }


/* hashes a password string with a salt and then converts the hash to base64 encoded string
// * @param username input employee name string
// * @param password input password string
// * @param salt retrieved salt for corresponding input employee name
// * @return hashedPswd Password hash byte array
// * @throws NoSuchAlgorithm Exception
// * @throws InvalidKeySpecException
*/

    private static String hashAndEncodePassword(String username, String password, String salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
        // Convert salt string to byte array
        byte[] saltBytes = decodeFromBase64(salt);
        // convert password characters to a password-based encryption (PBE) key
        KeySpec spec = new PBEKeySpec(password.toCharArray(), saltBytes, NUM_ITERATIONS, DERIVED_KEY_LENGTH);
        SecretKeyFactory f = null;
        byte[] hashedPswd = null;
        // create a secret key factory instance for PBKDF2WithHmacSHA256
        try {
            f = SecretKeyFactory.getInstance(HASH_ALGORITHM);
        } catch (NoSuchAlgorithmException nsae) {
            throw new NoSuchAlgorithmException(nsae);
        }
        // now generate a secret key object from the key spec
        try {
            hashedPswd = f.generateSecret(spec).getEncoded();
        } catch (InvalidKeySpecException ikse) {
            throw new InvalidKeySpecException(ikse);
        }
        return encodeToBase64(hashedPswd);
    }

    public static void main(String[] args) {

//        Flags

        Boolean testQueryFlag = true;
        Boolean generateSaltAndPswdsFlag = true;
        Boolean genForUser1 = true;
        Boolean genForUser2 = false;
        Boolean genForUser3 = false;

        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;

        // Salt values

        String salt1 = null;
        String salt2 = null;
        String salt3 = null;

        // Plain text passwords

        String password1 = null;
        String password2 = null;
        String password3 = null;

        // Employee User Names

        String name1 = "Scott";
        String name2 = "Aaron";
        String name3 = "Euan";

        // Hashed passwords

        String pswd1 = null;
        String pswd2 = null;
        String pswd3 = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected to 'employeesdb' database.");

            // Generate and add salt to database for each employee
            if (generateSaltAndPswdsFlag) {
                // generate salt values
                System.out.println("Generating salt...");
                if (genForUser1) {
                    salt1 = generateSalt(SALT_BYTE_SIZE); // salt for scott
                }
                if (genForUser2) {
                    salt2 = generateSalt(SALT_BYTE_SIZE); // salt for aaron
                }
                if (genForUser3) {
                    salt3 = generateSalt(SALT_BYTE_SIZE); // salt for euan
                }

                // Build salt update query
                String sql = "UPDATE Persons SET salt=? WHERE firstName=?";
                System.out.println("Preparing statement...");
                pstmt = conn.prepareStatement(sql);

                if (genForUser1) {
                    pstmt.setString(1, salt1);
                    pstmt.setString(2, name1);
                }
                if (genForUser2) {
                    pstmt.setString(1, salt2);
                    pstmt.setString(2, name2);
                }
                if (genForUser3) {
                    pstmt.setString(1, salt3);
                    pstmt.setString(2, name3);
                }

                pstmt.executeUpdate();
                System.out.println("Salt updated in database.");

                password1 = "employee1";
                password2 = "employee2";
                password3 = "employee3";

                if (genForUser1) {
                    pswd1 = hashAndEncodePassword(name1, password1, salt1);
                }
                if (genForUser2) {
                    pswd2 = hashAndEncodePassword(name2, password2, salt2);
                }
                if (genForUser3) {
                    pswd3 = hashAndEncodePassword(name3, password3, salt3);
                }
                // Build password update query
                String sql2 = "UPDATE Persons SET password=? WHERE firstName=?";
                System.out.println("Preparing statement...");
                pstmt2 = conn.prepareStatement(sql2);
                if (genForUser1) {
                    pstmt2.setString(1, pswd1);
                    pstmt2.setString(2, name1);
                }
                if (genForUser2) {
                    pstmt2.setString(1, pswd2);
                    pstmt2.setString(2, name2);
                }
                if (genForUser3) {
                    pstmt2.setString(1, pswd3);
                    pstmt2.setString(2, name3);
                }

                // Add password values to database
                pstmt2.executeUpdate();
                System.out.println("Password updated in database.");
            } // end of generateSaltAndPswdsFlag

            if (testQueryFlag) {
                // build and execute sql query
                String sql = "SELECT id, age, firstName, lastName, salt, password FROM Persons";
                System.out.println("Preparing statement...");
                pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                // extract data from result set
                while (rs.next()) {
                    // retrieve values by column name
                    int id = rs.getInt("id");
                    int age = rs.getInt("age");
                    String firstName = rs.getString("firstName");
                    String lastName = rs.getString("lastName");
                    String salt = rs.getString("salt");
                    String password = rs.getString("password");

                    // Diplay values
                    System.out.println("ID: " + id);
                    System.out.println(", Age: " + age);
                    System.out.println(", First Name: " + firstName);
                    System.out.println(", Last Name: " + lastName);
                    System.out.println(", Salt: " + salt);
                    System.out.println(", Password: " + password);
                }

                // close the result set
                rs.close();
            } // end testQueryFlag
        } catch (SQLException se) {
            // handles errors for JDBC
            System.err.println("Issue with JDBC.");
        } catch (Exception e) {
            // handle errors for Class.forName
            System.err.println("Issue with registering connectivity driver.");
        } finally {
            // clean up environment and close all resources
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (pstmt2 != null) {
                    pstmt2.close();
                }
            } catch (SQLException se2) { //nothing can be done
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        } // end finally try/catch
        System.out.println("Disconnected. Bye!");
    }
}
