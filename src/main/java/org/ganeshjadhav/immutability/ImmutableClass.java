package org.ganeshjadhav.immutability;

import java.util.List;

// use cases would DTOs , Keys in hashmap and sets
final public  class ImmutableClass {
    final private int id;
    final private String name;
    final private List<Address> addressList;

    public ImmutableClass(int id, String name, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.addressList = addressList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // do deep cloning
    public List<Address> getAddressList(){
        return addressList;
    }
}
