/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mirokshi
 */
public class Producte implements Serializable{
        
    public static final String PROP_STOCKMIN = "stockMin";
    public static final String PROP_STOCKACTUAL = "stockActual";
    public static final String PROP_PVP = "pvp";
    public static final String PROP_ANYFABRICACION = "anyFabricacion";


    private String numSerie;
    private String denominacion;    
    private String fabricante;
    private float costo;
    private int anyFabricacion;
    private String[] caracteristicas;
    private String categoria;
    private String ubicacion;
    private int stockMin;
    private int stockActual;
    private Date fechaAlta;    
    private float pvp;
    

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


    /**
     * @SETTERS
     */

    /**
     * Set the value of anyFabricacion
     *
     * @param anyFabricacion new value of anyFabricacion
     */
    public void setAnyFabricacion(int anyFabricacion) {
        int oldAnyFabricacion = this.anyFabricacion;
        this.anyFabricacion = anyFabricacion;
        propertyChangeSupport.firePropertyChange(PROP_ANYFABRICACION, oldAnyFabricacion, anyFabricacion);
    }

     /**
     * Set the value of stockActual
     *
     * @param stockActual new value of stockActual
     * @throws java.beans.PropertyVetoException
     */
    public void setStockActual(int stockActual) throws PropertyVetoException {
        int oldStockActual = this.stockActual;
        vetoableChangeSupport.fireVetoableChange(PROP_STOCKACTUAL, oldStockActual, stockActual);
        this.stockActual = stockActual;
        
        propertyChangeSupport.firePropertyChange(PROP_STOCKACTUAL, oldStockActual, stockActual);
    }

    /**
     * Set the value of stockMin
     *
     * @param stockMin new value of stockMin
     * @throws java.beans.PropertyVetoException
     */
    public void setStockMin(int stockMin) throws PropertyVetoException {
        int oldStockMin = this.stockMin;
        vetoableChangeSupport.fireVetoableChange(PROP_STOCKMIN, oldStockMin, stockMin);
        this.stockMin = stockMin;
        propertyChangeSupport.firePropertyChange(PROP_STOCKMIN, oldStockMin, stockMin);
    }
    
    
     /**
     * Set the value of pvp
     *
     * @param pvp new value of pvp
     * @throws java.beans.PropertyVetoException
     */
    public void setPvp(float pvp) throws PropertyVetoException {
        float oldPvp = this.pvp;
        vetoableChangeSupport.fireVetoableChange(PROP_PVP, oldPvp, pvp);
        this.pvp = pvp;
        propertyChangeSupport.firePropertyChange(PROP_PVP, oldPvp, pvp);
    }

    /**
     * Set the value of ubicacion
     *
     * @param ubicacion new value of ubicacion
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    /**
     * Set the value of categoria
     *
     * @param categoria new value of categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    /**
     * Set the value of caracteristicas
     *
     * @param caracteristicas new value of caracteristicas
     */
    public void setCaracteristicas(String[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


    /**
     * Set the value of costo
     *
     * @param costo new value of costo
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * Set the value of fabricante
     *
     * @param fabricante new value of fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    /**
     * Set the value of denominacion
     *
     * @param denominacion new value of denominacion
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * Set the value of numSerie
     *
     * @param numSerie new value of numSerie
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }


    /**
     * Set the value of fechaAlta
     *
     * @param fechaAlta new value of fechaAlta
     */
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    /**
     * Set the value of caracteristicas at specified index.
     *
     * @param index the index of caracteristicas
     * @param caracteristicas new value of caracteristicas at specified index
     */
    public void setCaracteristicas(int index, String caracteristicas) {
        this.caracteristicas[index] = caracteristicas;
    }

    
    /**
     * @GETTERS
     */
    
        
     /**
     * Get the value of anyFabricacion
     *
     * @return the value of anyFabricacion
     */
    public int getAnyFabricacion() {
        return anyFabricacion;
    }
     
     /**
     * Get the value of denominacion
     *
     * @return the value of denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

       
    /**
     * Get the value of stockMin
     *
     * @return the value of stockMin
     */
    public int getStockMin() {
        return stockMin;
    }

    
    /**
     * Get the value of categoria
     *
     * @return the value of categoria
     */
    public String getCategoria() {
        return categoria;
    }

    
    /**
     * Get the value of stockActual
     *
     * @return the value of stockActual
     */
    public int getStockActual() {
        return stockActual;
    }
    
    /**
     * Get the value of caracteristicas
     *
     * @return the value of caracteristicas
     */
    public String[] getCaracteristicas() {
        return caracteristicas;
    }
    
     /**
     * Get the value of caracteristicas at specified index
     *
     * @param index the index of caracteristicas
     * @return the value of caracteristicas at specified index
     */
    public String getCaracteristicas(int index) {
        return this.caracteristicas[index];
    }

        
    /**
     * Get the value of ubicacion
     *
     * @return the value of ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

     /**
     * Get the value of costo
     *
     * @return the value of costo
     */
    public float getCosto() {
        return costo;
    }
    
    /**
     * Get the value of fabricante
     *
     * @return the value of fabricante
     */
    public String getFabricante() {
        return fabricante;
    }
        
    /**
     * Get the value of numSerie
     *
     * @return the value of numSerie
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Get the value of fechaAlta
     *
     * @return the value of fechaAlta
     */
    public Date getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Get the value of pvp
     *
     * @return the value of pvp
     */
    public float getPvp() {
        return pvp;
    }

    
}

