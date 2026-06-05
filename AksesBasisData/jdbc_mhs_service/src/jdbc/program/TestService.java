/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author Upay
 */

public class TestService {

    public static void main(String[] args) {

        MysqlMahasiswaService service =
                new MysqlMahasiswaService();

        service.add(
                new Mahasiswa(
                        0,
                        "Nina"
                )
        );

        System.out.println(
                service.getAll()
        );

    }
}
