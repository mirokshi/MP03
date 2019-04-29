/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author mirokshi
 */
public class Model {

    public static final String PROP_DATABASE = "database";
    public static final String PROP_USERDB = "userDb";
    public static final String PROP_PASSWORDDB = "passwordDb";    
    
    
    private static Connection conneccion = null;
    private static ResultSet resultSet = null;
    private static PreparedStatement sentenciaActTabla = null;
    private PropertyChangeSupport propertySupport;
    private String database;
    private String userDb;
    private String passwordDb;

    

    /**
     * Get the value of passwordDb
     *
     * @return the value of passwordDb
     */
    public String getPasswordDb() {
        return passwordDb;
    }

    /**
     * Set the value of passwordDb
     *
     * @param passwordDb new value of passwordDb
     * @throws java.beans.PropertyVetoException
     */
    public void setPasswordDb(String passwordDb) throws PropertyVetoException {
        String oldPasswordDb = this.passwordDb;
        vetoableChangeSupport.fireVetoableChange(PROP_PASSWORDDB, oldPasswordDb, passwordDb);
        this.passwordDb = passwordDb;
        propertyChangeSupport.firePropertyChange(PROP_PASSWORDDB, oldPasswordDb, passwordDb);
    }

    


    /**
     * Get the value of userDb
     *
     * @return the value of userDb
     */
    public String getUserDb() {
        return userDb;
    }

    /**
     * Set the value of userDb
     *
     * @param userDb new value of userDb
     * @throws java.beans.PropertyVetoException
     */
    public void setUserDb(String userDb) throws PropertyVetoException {
        String oldUserDb = this.userDb;
        vetoableChangeSupport.fireVetoableChange(PROP_USERDB, oldUserDb, userDb);
        this.userDb = userDb;
        propertyChangeSupport.firePropertyChange(PROP_USERDB, oldUserDb, userDb);
    }

    
    

    /**
     * Get the value of database
     *
     * @return the value of database
     */
    public String getDatabase() {
        return database;
    }

    /**
     * Set the value of database
     *
     * @param database new value of database
     * @throws java.beans.PropertyVetoException
     */
    public void setDatabase(String database) throws PropertyVetoException {
        String oldDatabase = this.database;
        vetoableChangeSupport.fireVetoableChange(PROP_DATABASE, oldDatabase, database);
        this.database = database;
        propertyChangeSupport.firePropertyChange(PROP_DATABASE, oldDatabase, database);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private transient final VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);

    /**
     * Add VetoableChangeListener.
     *
     * @param listener
     */
    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.addVetoableChangeListener(listener);
    }

    /**
     * Remove VetoableChangeListener.
     *
     * @param listener
     */
    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }

     
       public Model() {
           propertySupport = new PropertyChangeSupport(this);
        Properties props = new Properties();
        String url, user, password;
        url = user = password = null;

        try (FileInputStream in = new FileInputStream("database.properties")) {
            props.load(in);
            url = props.getProperty("db.url");
            user = props.getProperty("db.user");
            password = props.getProperty("db.password");
            crearConnexio(url, user, password);
        } catch (IOException ex) {
            System.err.println("No se ha podido establecer coneccion a la BD...");
            System.exit(0);
        }
    }
       

    public void finalize() throws Throwable {
        if (sentenciaActTabla != null) {
            sentenciaActTabla.close();
        }
        if (resultSet != null) {
            resultSet.close();
        }
        if (conneccion != null) {
            conneccion.close();
        }
        System.out.println("Cerrando la conección a la BD...");
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    private void crearConnexio(String url, String user, String password) {
        try {
            conneccion = DriverManager.getConnection(url, user, password);
            System.out.println("Conectando a la BD...");
        } catch (SQLException ex) {
            System.err.println("No se ha podido establecer coneccion a la BD...");
            System.out.println(ex);
            System.exit(0);
        }

    }

    public void insertarPintor(String first_name, String last_name) {

        String sql = "INSERT INTO pintores (first_name, last_name) VALUES (? , ?)";
        try (PreparedStatement sentenciaPr = conneccion.prepareStatement(sql)) {
            sentenciaPr.setString(1, first_name);
            sentenciaPr.setString(2, last_name);
            sentenciaPr.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al insertar un pintor");
        }
    }
    
    public void insertarPintura(String picture_name, String picture_date) {

        String sql = "INSERT INTO pinturas (picture_name, picture_date) VALUES (? , ?)";
        try (PreparedStatement sentenciaPr = conneccion.prepareStatement(sql)) {
            sentenciaPr.setString(1, picture_name);
            sentenciaPr.setString(2, picture_date);
            sentenciaPr.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al insertar una pinttura");
        }
    }

    public void borrarPintor(int actor_id) {

        String sql = "DELETE FROM pintores WHERE pintor_id=?";
        try (PreparedStatement sentenciaPr = conneccion.prepareStatement(sql)) {
            sentenciaPr.setInt(1, actor_id);
            sentenciaPr.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al borrar el pintor!!");
        }
    }

    public void borrarPintura(int pintura_id) {

        String sql = "DELETE FROM pinturas WHERE pintura_id=?";
        try (PreparedStatement sentenciaPr = conneccion.prepareStatement(sql)) {
            sentenciaPr.setInt(1, pintura_id);
            sentenciaPr.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al borrar !!");
        }

    }

    public void modificarPintor(int actor_id, String first_name, String last_name) {

        String sql = "UPDATE pintores SET first_name=?, last_name=? "
                + "WHERE pintor_id=?";
        try (PreparedStatement sentenciaPr = conneccion.prepareStatement(sql)) {
            sentenciaPr.setString(1, first_name);
            sentenciaPr.setString(2, last_name);
            sentenciaPr.setInt(3, actor_id);
            sentenciaPr.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al modificar el pintor!!");
        }

    }
       
    /**
     *
     * @return ArrayList Pintores
     *
     */
    public ArrayList<Pintor> listarPintores() {
        ArrayList lista = new ArrayList();
        String sql = "SELECT * FROM pintores;";

        try {

            //La instàncio aquí i no en un try_with_resources per què per poder actualitzar la taula que rep les dades la sentència ha d'estar oberta 
            sentenciaActTabla = conneccion.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            this.resultSet = sentenciaActTabla.executeQuery();

            if (this.resultSet != null) {

                while (resultSet.next()) {
                    int actor_id = resultSet.getInt(1);
                    String first_name = resultSet.getString(2);
                    String last_name = resultSet.getString(3);
                    lista.add(new Pintor(actor_id, first_name, last_name));
                }

            }
        } catch (SQLException ex) {
            System.err.println("Error al listar los pintores!!");
        }
        return lista;
    }

    /**
     *
     * @return Arraylist Pinturas
     */
    public ArrayList<Pinturas> listarPinturas() {
        ArrayList lista = new ArrayList();
        String sql = "SELECT * FROM pinturas ORDER BY 1;";

        try {
            //La instàncio aquí i no en un try_with_resources per què per poder actualitzar la taula que rep les dades la sentència ha d'estar oberta 
            sentenciaActTabla = conneccion.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            this.resultSet = sentenciaActTabla.executeQuery();

            if (this.resultSet != null) {

                while (resultSet.next()) {
                    int pintura_id = resultSet.getInt(1);
                    String picture_name = resultSet.getString(2);
                    String picture_date = resultSet.getString(3);
                    lista.add(new Pinturas(pintura_id, picture_name, picture_date));
                }

            }
        } catch (SQLException ex) {
            System.err.println("Error al listar las pinturas!!");
        }
        return lista;
    }

    public static ResultSet getResultSet() {
        return resultSet;
    }

} 
