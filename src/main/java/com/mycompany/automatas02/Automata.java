
package com.mycompany.automatas02;

import lombok.Setter;

/*@author kevin*/

@Setter
public class Automata {

    private String cinta;
    
    public Automata(String cinta) {
        this.cinta = cinta;
    }
    
    
    public boolean estadoA(int posicion){
       if(posicion == cinta.length()) return false;
       if(cinta.charAt(posicion)=='0') return estadoA(posicion+1);
       if(cinta.charAt(posicion)=='1') return estadoB(posicion+1);
       return false;
    }
    
    private boolean estadoB(int posicion){
       if(posicion == cinta.length()) return true; 
       if(cinta.charAt(posicion)=='0') return estadoB(posicion+1);
       if(cinta.charAt(posicion)=='1') return estadoA(posicion+1);
       return false;
    }
}
