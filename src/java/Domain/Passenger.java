/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Philip
 */
@Entity
@SequenceGenerator(name = "passengerseq", sequenceName = "passengerseq", initialValue = 1, allocationSize = 1)
public class Passenger extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passengerseq")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
   
}
