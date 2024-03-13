package BancoDeDados;

import java.util.HashMap;
import java.util.Map;

public class BD <K, V>{
    private Map<K, V> objetos = new HashMap<>();

    public void salvarObjeto(K key, V objeto){
        this.objetos.put(key, objeto);
    }

    public V getObjetos(K identificador){
        if(objetos.containsKey(identificador)) return objetos.get(identificador);
        return null;
    }

    public void deletarObjeto(K identificador){
        if(objetos.containsKey(identificador)) objetos.remove(identificador);
    }

    public void alterarObjeto(K identificador, V novoObjeto){
        if(objetos.containsKey(identificador)) objetos.put(identificador, novoObjeto);
    }
}
