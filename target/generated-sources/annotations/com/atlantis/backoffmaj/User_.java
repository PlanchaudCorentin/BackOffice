package com.atlantis.backoffmaj;

import com.atlantis.backoffmaj.UserDevice;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-27T18:29:09")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> mail;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Boolean> isAdmin;
    public static volatile CollectionAttribute<User, UserDevice> userDeviceCollection;

}