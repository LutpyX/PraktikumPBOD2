/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;
import jdbc.utilities.MysqlUtility;
import java.sql.Connection;


/**
 *
 * @author Upay
 */

public class TestConnection {

    public static void main(String[] args) {

        try {

            Connection conn =
                    MysqlUtility.getConnection();

            System.out.println(
                    "Koneksi Berhasil!"
            );

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
