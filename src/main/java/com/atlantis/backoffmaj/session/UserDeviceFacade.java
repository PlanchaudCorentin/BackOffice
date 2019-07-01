/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlantis.backoffmaj.session;

import com.atlantis.backoffmaj.UserDevice;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cesi
 */
@Stateless
public class UserDeviceFacade extends AbstractFacade<UserDevice> {

    @PersistenceContext(unitName = "com.atlantis_backOffMaj_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserDeviceFacade() {
        super(UserDevice.class);
    }
    
}
