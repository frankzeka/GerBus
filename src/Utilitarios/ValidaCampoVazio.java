/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilitarios;

import org.jdesktop.beansbinding.Validator;

/**
 *
 * @author professor
 */
public class ValidaCampoVazio extends Validator<String> {
        @Override
        public Validator.Result validate(String arg) {
        if ((arg == null) || (arg.length() == 0)) {
            return new Validator.Result(null, "Campo em branco! FAVOR PREENCHER!");
        }
        return null;
    }
    
}
