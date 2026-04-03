package cts.vladu.raresmihai.g1098.singletonregistry.model;

import java.util.HashMap;
import java.util.Map;

public class RegistryCuptor {
    static Map<Integer, CuptorUpdated> collectie = new HashMap<>();

    static {
        collectie.put(5, new CuptorUpdated(5, 200));
        collectie.put(6, new CuptorUpdated(6, 250));
        collectie.put(7, new CuptorUpdated(7, 300));
        collectie.put(8, new CuptorUpdated(8, 350));
    }

    private RegistryCuptor() {
    }

    public static void register(int id, CuptorUpdated cuptor){
        if(collectie.containsKey(id)){
            throw  new RuntimeException("Key already registered ");
        }
        else{
            collectie.put(id, cuptor);
        }
    }

    public static CuptorUpdated getCuptor(int id){
        return collectie.get(id);
    }
}
