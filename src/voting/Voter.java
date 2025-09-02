
package voting;

import java.io.Serializable;

/**
 * 
 * @author Mcacisi Sithole
 */
public class Voter implements Serializable{
    //VARIABLES USED FOT THE SYSTEM
   
    private String voterID, name, surname, candidateVoted;

    
    //A PARAMETERIZED CONSTRUCTOR TO GET VALUES OF THE VARIABLES
    public Voter(String voterID, String name, String surname, String candidateVoted) {
        this.voterID = voterID;
        this.name = name;
        this.surname = surname;
        this.candidateVoted = candidateVoted;
    }
    
    
    
    //GETTERS TO GET DATA FROM USER INPUT
    public String getVoterID() {
        return voterID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCandidateVoted() {
        return candidateVoted;
    }
    
    
    
    //SETTERS TO SET THE VALUES
    public void setVoterID(String voterID) {
        this.voterID = voterID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCandidateVoted(String candidateVoted) {
        this.candidateVoted = candidateVoted;
    }
    
    
    //ToString METHOD TO DISPLAY
    @Override
    public String toString(){
        return voterID + "\t" + name + "\t" + surname + "\t" + candidateVoted;
    }  
}
