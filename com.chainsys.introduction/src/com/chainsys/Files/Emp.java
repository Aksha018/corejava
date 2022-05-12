package com.chainsys.Files;

import java.io.Serializable;

public class Emp implements Serializable{
    private final int id;
    public String Name;

    public Emp (int v1,String sname) {
            id = v1;
            Name=sname;
            }

    public int getID() {
        return id;
    }
    public String sname() {
		return Name;
    	
    }

    @Override
    public boolean equals(Object obj) {
        Class c1 = obj.getClass();
        boolean flag = false;
        if (c1 == this.getClass()) {
            Emp other = (Emp) obj;
            if (this.hashCode() == other.hashCode())
                flag = true;
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    }

