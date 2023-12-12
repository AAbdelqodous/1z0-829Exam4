package q49;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ahmed.elsayed\\Documents\\java\\data.dat"))) {
            String line;
            var data = new ArrayList<EmployeeDTO>();
            while ((line = br.readLine()) != null) {
                String[] record = line.split(",");
                EmployeeDTO employee = new EmployeeDTO();
                employee.setId(record[0]);
                employee.setName(record[1]);
                employee.setJob(record[2]);
                employee.setCountry(record[3]);
                data.add(employee);
            }
            insertIntoDatabase(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* String spssFilePath = "path/to/your/file.sav";

        SPSSFileReaderOptions options = SPSSFileReaderOptions.builder().build();
        try (SPSSFileReader reader = SPSSFileReaderFactory.newReader(spssFilePath, options)) {
            // Iterate over the records in the SPSS file
            while (reader.read()) {
                // Access data using reader.getString(variableName), reader.getDouble(variableName), etc.
                String variable1Value = reader.getString("Variable1");
                double variable2Value = reader.getDouble("Variable2");

                // Insert data into the database
                insertIntoDatabase(variable1Value, variable2Value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    private static void insertIntoDatabase(ArrayList<EmployeeDTO> data) {
        String url = "jdbc:oracle:thin:@//hyper-v2k19.manpower.gov.kw:1521/T27JUN22";
        String user = "PAM_DB";
        String password = "PAM_DB2022";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            for(EmployeeDTO employee: data) {
                String sql = "INSERT INTO EMPLOYEES_TEMP(EMP_ID, NAME_AR, JOB, COUNTRY) VALUES (?, ?, ?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Set values for each parameter based on your data array
                    statement.setString(1, employee.getId());
                    statement.setString(2, employee.getName());
                    statement.setString(3, employee.getJob());
                    statement.setString(4, employee.getCountry());
                    statement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
