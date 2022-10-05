package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {

        if (name == ""){
            setName("Data not available");
        }
        if (employer.getValue() == "") {
            employer.setValue("Data not available");
        }
        if (location.getValue() == "") {
            location.setValue("Data not available");
        }
        if (positionType.getValue() == "") {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() == "") {
            coreCompetency.setValue("Data not available");
        }

//        checking/adding "Data not available" to blank name field
//        do {
//            getName();
//            if (name == ""){
//                setName("Data not available");
//            }
//        } while (name == "");

//        checking/adding "Data not available" to null Employer field
//        do {
//            getEmployer();
//            System.out.println("get: " + getEmployer());
//            System.out.println("employer: " + employer);
//            if (employer == null) {
//                System.out.println("condition: true");
//                setEmployer(new Employer("Data not available"));
//                System.out.println("employer: " + employer);
//            } else {
//                System.out.println("condition: false");
//            }
//            System.out.println("employer: " + employer +"\n");
//        } while (employer == null);

//      checking/adding "Data not available" to blank Employer field
//        do {
//            employer.getValue();
//            System.out.println("get:" + employer.getValue());
//            System.out.println("employer: " + employer.getValue());
//            if (employer.getValue() == "") {
//                System.out.println("if condition: true");
//                setEmployer(new Employer("Data not available"));
//                System.out.println("employer: " + employer);
//            } else {
//                System.out.println("employer condition: false");
//            }
//            System.out.println("employer: " + employer + "\n");
//        } while (employer.getValue() == "") ;

        String jobString = "\nID: " + getId() +
                        "\nName: " + getName() +
                        "\nEmployer: " + getEmployer() +
                        "\nLocation: " + getLocation() +
                        "\nPosition Type: " + getPositionType() +
                        "\nCore Competency: " + getCoreCompetency() +
                        "\n";

//        if (jobString.contains("\nEmployer: null")) {
//            jobString.replaceFirst("\nEmployer: null", "Employer: Data not available");
//        }
        System.out.println(jobString);

        return jobString;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
