/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hari;

/**
 *
 * @author LENOVO
 */
public class hari {
    public static void main(String[] args) {

        //check out the class alien one
        AlienCreatureOne aOne = new AlienCreatureOne();
        System.out.format("%s%n", aOne.lifeBegins());
        System.out.format("%s%n", aOne.live());
        System.out.format("%s%n", aOne.lifeEnds());

        //check out the class alien two
        AlienCreatureTwo aTwo = new AlienCreatureTwo();
        System.out.format("%s%n", aTwo.lifeBegins());
        System.out.format("%s%n", aTwo.live());
        System.out.format("%s%n", aTwo.lifeEnds());
    }/*from w  ww  . j  a  va 2  s.c om*/

}
abstract class AlienCreature {
    // all creaturesd are born
    String lifeBegins() {
        String me = "Hello, I'm here.";
        return me;
    }

    // creatures live by eating different material..so this is abstract
    abstract String live();

    // all creatures die
    String lifeEnds() {
        String meEnd = "Oh no, it all ends - bye. ";
        return meEnd;
    }
}

//nonabstract subclass 1
class AlienCreatureOne extends AlienCreature {
    String live() {
        String living = "We alien ones live happily on alien one nutrition.";
        return living;
    }
}
//nonabstract subclass 2

class AlienCreatureTwo extends AlienCreature {
    @Override
    String live() {
        String living = "We alien twos live happily on alien two nutrition.";
        return living;
    }
    
}
