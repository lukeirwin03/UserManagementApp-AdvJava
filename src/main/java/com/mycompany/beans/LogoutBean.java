/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beans;

/**
 *
 * @author lukes
 */
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;

public class LogoutBean {

    public String logout() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();

        // Invalidate the user session
        externalContext.invalidateSession();

        // Redirect to the login page
        return "/login.xhtml?faces-redirect=true";
    }
}
