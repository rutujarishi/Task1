package com.stackroute.domain;

/**
 * Hello world!
 */
public class Movie {

    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
}
//
//       public void setActor(Actor actor) {
//        this.actor = actor;
//    }
//    public Movie() {
//    }

    public void print() {
        actor.print();

    }


}
