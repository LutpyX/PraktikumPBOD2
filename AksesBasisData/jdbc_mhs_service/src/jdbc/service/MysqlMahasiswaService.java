/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Upay
 */


public class MysqlMahasiswaService {

    private Connection connection;

    public MysqlMahasiswaService() {

        try {

            connection =
                    MysqlUtility.getConnection();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void add(Mahasiswa mhs) {

        try {

            String sql =
                    "INSERT INTO mahasiswa(nama) VALUES(?)";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setString(1, mhs.getNama());

            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void update(Mahasiswa mhs) {

        try {

            String sql =
                    "UPDATE mahasiswa SET nama=? WHERE id=?";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void delete(int id) {

        try {

            String sql =
                    "DELETE FROM mahasiswa WHERE id=?";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public Mahasiswa getById(int id) {

        Mahasiswa mhs = null;

        try {

            String sql =
                    "SELECT * FROM mahasiswa WHERE id=?";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if(rs.next()) {

                mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return mhs;
    }

    public List<Mahasiswa> getAll() {

        List<Mahasiswa> list =
                new ArrayList<>();

        try {

            String sql =
                    "SELECT * FROM mahasiswa";

            Statement st =
                    connection.createStatement();

            ResultSet rs =
                    st.executeQuery(sql);

            while(rs.next()) {

                list.add(
                        new Mahasiswa(
                                rs.getInt("id"),
                                rs.getString("nama")
                        )
                );

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return list;
    }

    public void indexReset() {

    if(isEmpty()) {
        return;
    }

    try {

        Statement st =
                connection.createStatement();

        st.executeUpdate(
                "SET @num := 0"
        );

        st.executeUpdate(
                "UPDATE mahasiswa "
                + "SET id = (@num := @num + 1)"
        );

        st.executeUpdate(
                "ALTER TABLE mahasiswa "
                + "AUTO_INCREMENT = 1"
        );

    } catch (SQLException e) {

        e.printStackTrace();

    }

}

    public boolean isEmpty() {

        return getAll().isEmpty();

    }

    public void closeConnection() {

        try {

            if(connection != null) {

                connection.close();

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
}