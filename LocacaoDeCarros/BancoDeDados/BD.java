package BancoDeDados;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BD <K, V>{
    private Map<K, V> objetos = new HashMap<>();

    public void salvar(K key, V objeto){
        if(!objetos.containsKey(key))
            this.objetos.put(key, objeto);
    }
    public Collection<V> buscarTodos(){ return this.objetos.values(); }
    public java.util.Set<K> getChaves() {
        return this.objetos.keySet();
    }

    public V buscar(K identificador){
        if(objetos.containsKey(identificador)) return objetos.get(identificador);
        return null;
    }

    public void remover(K identificador){
        if(objetos.containsKey(identificador)) objetos.remove(identificador);
    }

    public void alterar(K identificador, V novoObjeto){
        if(objetos.containsKey(identificador)) objetos.put(identificador, novoObjeto);
    }
}
