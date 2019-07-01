package com.atlantis.backoffmaj;

import com.atlantis.backoffmaj.Device;
import com.atlantis.backoffmaj.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-27T18:29:09")
@StaticMetamodel(UserDevice.class)
public class UserDevice_ { 

    public static volatile SingularAttribute<UserDevice, Integer> id;
    public static volatile SingularAttribute<UserDevice, Device> deviceId;
    public static volatile SingularAttribute<UserDevice, User> userId;

}