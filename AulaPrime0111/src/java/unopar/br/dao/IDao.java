/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopar.br.dao;

import java.util.List;

/**
 *
 * @author anderson5687
 */
public interface IDao<T> {
    public List<T> listar();
    public void inserir(T t);
    public void alterar(T t);
    public void deletar(T t);
}
